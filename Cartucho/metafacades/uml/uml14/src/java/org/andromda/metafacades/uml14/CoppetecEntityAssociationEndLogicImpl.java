package org.andromda.metafacades.uml14;

import java.io.File;

import org.andromda.metafacades.uml.Abreviacoes;
import org.andromda.metafacades.uml.ClassifierFacade;
import org.andromda.metafacades.uml.CoppetecEntityMetafacadeUtils;
import org.andromda.metafacades.uml.CoppetecUMLMetafacadeProperties;
import org.andromda.metafacades.uml.Entity;
import org.andromda.metafacades.uml.UMLMetafacadeProperties;
import org.andromda.metafacades.uml.UMLProfile;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * MetafacadeLogic implementation for org.andromda.metafacades.uml.CoppetecEntityAssociationEnd.
 *
 * @see org.andromda.metafacades.uml.CoppetecEntityAssociationEnd
 */
public class CoppetecEntityAssociationEndLogicImpl
    extends CoppetecEntityAssociationEndLogic
{
	/**
	 * O logger desta classe.
	 */
	private static final Log log = LogFactory.getLog( CoppetecEntityAssociationEndLogicImpl.class );

    public CoppetecEntityAssociationEndLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
        
        String caminhoDoArquivoDeAbreviacoes = getConfiguredProperty(CoppetecUMLMetafacadeProperties.CAMINHO_DO_ARQUIVO_DE_ABREVIACOES).toString();
        Abreviacoes.getInstance().setCaminhoDoArquivoDePropriedades( new File( caminhoDoArquivoDeAbreviacoes ) );
    }

    /**
     * @see org.andromda.metafacades.uml.EntityAssociationEnd#getForeignKeyPrefix()
     */
    public String handleGetForeignKeyPrefix()
    {
        return (String)this.getConfiguredProperty( CoppetecUMLMetafacadeProperties.FOREIGN_KEY_PREFIX );
    }
    
    /**
     * @see org.andromda.metafacades.uml.EntityAssociationEnd#getForeignKeyColumnName()
     */
    public String handleGetColumnName()
    {
        String foreignKeyColumnName = null;
        // prevent ClassCastException if the association isn't an Entity
        if (this.getType() instanceof Entity)
        {
        	String columnTag = StringUtils.trimToEmpty((String)this.findTaggedValue(UMLProfile.TAGGEDVALUE_PERSISTENCE_COLUMN));
        	String tableTag = StringUtils.trimToEmpty((String)this.getType().findTaggedValue(UMLProfile.TAGGEDVALUE_PERSISTENCE_TABLE));
        	
        	if(!StringUtils.isEmpty(columnTag) || StringUtils.isEmpty(tableTag) || (this.getName() != null && !StringUtils.isEmpty(this.getName())  && !StringUtils.isEmpty(tableTag) && !this.getName().toUpperCase().equals(this.getType().getName().toUpperCase()))){
        		foreignKeyColumnName =	
        		    CoppetecEntityMetafacadeUtils.getSqlNameFromTaggedValueAbreviado(this.getForeignKeyPrefix(),this,UMLProfile.TAGGEDVALUE_PERSISTENCE_COLUMN,	
                        ((Entity)this.getType()).getMaxSqlNameLength(), this.getForeignKeySuffix(),
                        this.getConfiguredProperty(UMLMetafacadeProperties.SQL_NAME_SEPARATOR),
                        this.getConfiguredProperty(UMLMetafacadeProperties.RELATION_NAME_SEPARATOR));
        	}
        	else{
        		foreignKeyColumnName =
                    CoppetecEntityMetafacadeUtils.getSqlNameFromTaggedValueAbreviado2(this.getForeignKeyPrefix(),this.getType(),UMLProfile.TAGGEDVALUE_PERSISTENCE_TABLE,	
                        ((Entity)this.getType()).getMaxSqlNameLength(), this.getForeignKeySuffix(),
                        this.getConfiguredProperty(UMLMetafacadeProperties.SQL_NAME_SEPARATOR),
                        this.getConfiguredProperty(UMLMetafacadeProperties.RELATION_NAME_SEPARATOR));
        	}
        }
        
        return foreignKeyColumnName;
    }

    /**
     * @see AssociationEndFacadeLogic#getForeignKeyConstraintName()
     */
    protected String handleGetForeignKeyConstraintName()
    {
        String constraintName = null;

        final Object taggedValueObject = findTaggedValue(
                UMLProfile.TAGGEDVALUE_PERSISTENCE_FOREIGN_KEY_CONSTRAINT_NAME);
        if (taggedValueObject == null)
        {
            // we construct our own foreign key constraint name here
            StringBuffer buffer = new StringBuffer();

            String constraintPrefix = getConfiguredProperty( CoppetecUMLMetafacadeProperties.CONSTRAINT_PREFIX ).toString();
            
            Object sqlNameSeparator = getConfiguredProperty( UMLMetafacadeProperties.SQL_NAME_SEPARATOR );
			if( !StringUtils.isEmpty( constraintPrefix ) ) {
	            buffer.append( constraintPrefix );
	            buffer.append( sqlNameSeparator );
            }

            final ClassifierFacade type = getOtherEnd().getType();
            if (type instanceof Entity)
            {
                Entity entity = (Entity)type;
                String entityTableName = entity.getTableName();
                buffer.append( entityTableName );
            }
            else
            {
                // should not happen
                buffer.append(type.getName().toUpperCase());
            }

            buffer.append( sqlNameSeparator );
            buffer.append( this.getName().toUpperCase() );

            String constraintSuffix = getConfiguredProperty( CoppetecUMLMetafacadeProperties.CONSTRAINT_SUFFIX ).toString();

            if( !StringUtils.isEmpty( constraintSuffix ) ) {
	            buffer.append( sqlNameSeparator );
	            buffer.append( constraintSuffix );
            }
            
            constraintName = buffer.toString();
        }
        else
        {
            // use the tagged value
            constraintName = taggedValueObject.toString();
        }

        constraintName = CoppetecEntityMetafacadeUtils.abrevieNomeSql( constraintName, getConfiguredProperty( UMLMetafacadeProperties.SQL_NAME_SEPARATOR ).toString() );

        // we take into consideration the maximum length allowed
        final String maxLengthString = (String)getConfiguredProperty(UMLMetafacadeProperties.MAX_SQL_NAME_LENGTH);
        final Short maxLength = Short.valueOf(maxLengthString);
        return CoppetecEntityMetafacadeUtils.ensureMaximumNameLength(constraintName, maxLength);
    }
    
   

}
