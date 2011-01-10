//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents an attribute of an entity.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface EntityAttribute
    extends org.andromda.metafacades.uml.AttributeFacade
{

   /**
    * <p>
    * The name of the index to create on a column that persists the
    * entity attribute.
    * </p>
    */
    public java.lang.String getColumnIndex();

   /**
    * <p>
    * The length of the column that persists this entity attribute.
    * </p>
    */
    public java.lang.String getColumnLength();

   /**
    * <p>
    * The name of the table column to which this entity is mapped.
    * </p>
    */
    public java.lang.String getColumnName();

   /**
    * <p>
    * The PIM to language specific mappings for JDBC.
    * </p>
    */
    public org.andromda.metafacades.uml.TypeMappings getJdbcMappings();

   /**
    * <p>
    * The JDBC type for this entity attribute.
    * </p>
    */
    public java.lang.String getJdbcType();

   /**
    * <p>
    * The SQL mappings (i.e. the mappings which provide PIM to SQL
    * mappings).
    * </p>
    */
    public org.andromda.metafacades.uml.TypeMappings getSqlMappings();

   /**
    * <p>
    * The SQL type for this attribute.
    * </p>
    */
    public java.lang.String getSqlType();

   /**
    * <p>
    * True if this attribute is an identifier for its entity.
    * </p>
    */
    public boolean isIdentifier();

   /**
    * <p>
    * Whether or not the entity attribute is unique (default is
    * false).
    * </p>
    */
    public boolean isUnique();

}