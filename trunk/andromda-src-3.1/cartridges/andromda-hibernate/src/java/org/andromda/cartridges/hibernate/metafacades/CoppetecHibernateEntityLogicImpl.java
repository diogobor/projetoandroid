package org.andromda.cartridges.hibernate.metafacades;

import org.andromda.cartridges.hibernate.HibernateProfile;
import org.andromda.metafacades.uml.TypeMappings;
import org.andromda.metafacades.uml.UMLMetafacadeProperties;
import org.andromda.metafacades.uml.EntityMetafacadeUtils;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.hibernate.metafacades.CoppetecHibernateEntity.
 *
 * @see org.andromda.cartridges.hibernate.metafacades.CoppetecHibernateEntity
 */
public class CoppetecHibernateEntityLogicImpl
    extends CoppetecHibernateEntityLogic
{

    public CoppetecHibernateEntityLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }

    /**
     * @see org.andromda.cartridges.hibernate.metafacades.CoppetecHibernateEntity#getBatch()
     */
	protected int handleGetBatch() {
		String batchStr = (String)findTaggedValue(HibernateProfile.TAGGEDVALUE_HIBERNATE_ENTITY_BATCH);
		int batch = 1;
		if(batchStr != null)
			batch =  new Integer(batchStr).intValue();
		return batch;
	}

	protected String handleGetTableName() {
		String tableName = super.getTableName();
		
		if (this.isView()) {
			tableName = "VW_" + tableName;
		}
		
		return tableName;
	}

	protected boolean handleIsExportIdUnique() {
		this.getAttributes();
		
		this.getProperties();
		
		java.util.Iterator atributos = getAttributes().iterator();
		String nomeUniqueGroup = null;
		while (atributos.hasNext())
		{
			HibernateEntityAttributeLogicImpl att = (HibernateEntityAttributeLogicImpl) atributos.next();

			if (att.hasExactStereotype("ExportId"))
			{
				if (!att.isUnique())
				{
					if (att.getColumnUniqueGroup() == null)
						return false;
					
					if (nomeUniqueGroup == null)
						nomeUniqueGroup = att.getColumnUniqueGroup();
					else if (!nomeUniqueGroup.equals(att.getColumnUniqueGroup()))
						return false;
				}
			}
		}
		return true;
	}
	
	protected boolean handleIsAuditoria() {
		String securityRealm = (String) getConfiguredProperty("securityRealm");
		if (securityRealm == null || securityRealm.equals(""))
			return false;
		
		if (this.hasExactStereotype("Auditoria"))
			return true;
		
		String auditoria = (String) getConfiguredProperty(HibernateGlobals.HIBERNATE_ENTITY_AUDITORIA);

        return Boolean.valueOf(auditoria).booleanValue();
	}
	
	protected boolean handleIsView() {
		if (this.hasExactStereotype("View"))
			return true;
		return false;
	}
	
	protected java.lang.String handleGetAuditoriaLoginSqlType(){
		return getSqlType("datatype::String", "30");
	}
	
	protected java.lang.String handleGetAuditoriaDataSqlType(){
		return getSqlType("datatype::DateTime", null);
	}
	
	protected java.lang.String handleGetAuditoriaOperacaoSqlType(){
		return getSqlType("datatype::String", "12");
	}
	protected java.lang.String handleGetAuditoriaVersionSqlType(){
		return getSqlType("datatype::Long", null);
	}
	protected java.lang.String handleGetAuditoriaHashSqlType(){
		return getSqlType("datatype::String", "256");
	}
	
	
	private String getSqlType(String dataType, String columnLength){
		String value = null;
        if (this.getSqlMappings() != null)
        {
        	value = this.getSqlMappings().getTo(dataType);
            if(columnLength != null)
            	value = EntityMetafacadeUtils.constructSqlTypeName(value, columnLength);
        }
        return value;
	}
	
	private TypeMappings getSqlMappings(){
		
        final Object property = this.getConfiguredProperty(UMLMetafacadeProperties.SQL_MAPPINGS_URI);
        TypeMappings mappings = null;
        String uri = null;
        if (property instanceof String)
        {
            uri = (String)property;
            try
            {
                mappings = TypeMappings.getInstance(uri);
                this.setProperty(UMLMetafacadeProperties.SQL_MAPPINGS_URI, mappings);
            }
            catch (Throwable th)
            {
                String errMsg = "Error getting '" + UMLMetafacadeProperties.SQL_MAPPINGS_URI + "' --> '" + uri + "'";
                logger.error(errMsg, th);
                // don't throw the exception
            }
        }
        else
        {
            mappings = (TypeMappings)property;
        }
        return mappings;
    }

	protected String handleGetAuditoriaListaId() {
		return getSqlType("datatype::String", (String) getConfiguredProperty(HibernateGlobals.TAMANHO_ASSOCIACAO));
	}
}