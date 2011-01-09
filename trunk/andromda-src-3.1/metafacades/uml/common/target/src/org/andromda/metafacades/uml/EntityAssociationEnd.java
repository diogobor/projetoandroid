//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents an association end of an entity.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface EntityAssociationEnd
    extends org.andromda.metafacades.uml.CoppetecAssociationEndFacade
{

   /**
    * <p>
    * The name of the index to create on a column that persists the
    * foreign key attribute.
    * </p>
    */
    public java.lang.String getColumnIndex();

   /**
    * <p>
    * The name of the column that makes up the foreign key.
    * </p>
    */
    public java.lang.String getColumnName();

   /**
    * <p>
    * The name of the foreign key constraint to use for databases.
    * </p>
    */
    public java.lang.String getForeignKeyConstraintName();

   /**
    * <p>
    * The current foreign key suffix specified for this entity
    * association end facade.
    * </p>
    */
    public java.lang.String getForeignKeySuffix();

   /**
    * <p>
    * The SQL type for this the foreign key column of this association
    * end.
    * </p>
    */
    public java.lang.String getSqlType();

   /**
    * <p>
    * Indicates whether or not a foreign identifier should be used for
    * the entity that owns this association end.  This would only make
    * sense in the case of a child in a one-to-one parent-child
    * association.  If this flag is true, then the identifier of this
    * entity should also be used as the foreign key to the related
    * parent entity.
    * </p>
    */
    public boolean isForeignIdentifier();

}