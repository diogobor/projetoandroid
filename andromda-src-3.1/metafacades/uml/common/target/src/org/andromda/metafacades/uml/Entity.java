//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a persistent entity.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface Entity
    extends org.andromda.metafacades.uml.ClassifierFacade
{

   /**
    * <p>
    * Gets a comma seperated list of attribute names.  If 'follow' is
    * true, will travel up the inheritance hiearchy to include
    * attributes in parent entities as well.  If 'withIdentifiers' is
    * true, will include identifiers.
    * </p>
    */
    public java.lang.String getAttributeNameList(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * Gets a comma seperated list of attribute types.  If 'follow' is
    * true, will travel up the inheritance hiearchy to include
    * attributes in parent entities as well.  If 'withIdentifiers' is
    * true, will include identifiers.
    * </p>
    */
    public java.lang.String getAttributeTypeList(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * Gets all attributes of the entity, and optionally retieves the
    * super entities attributes as well as excludes the entity's
    * identifiers if 'withIdentifiers' is set to false.
    * </p>
    */
    public java.util.Collection getAttributes(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * All business operations of the entity, these include any
    * operations that aren't queries.
    * </p>
    */
    public java.util.Collection getBusinessOperations();

   /**
    * <p>
    * Gets any children association ends (i.e. entity association ends
    * that are participants in an association with this entity and
    * this entity has composite aggregation defined for those
    * associations).
    * </p>
    */
    public java.util.Collection getChildEnds();

   /**
    * <p>
    * All entities referenced by this entity.
    * </p>
    */
    public java.util.Collection getEntityReferences();

   /**
    * <p>
    * All the attributes of the entity which make up its identifier
    * (primary key).  Will search any super classes as well.  If no
    * identifiers exist, a default identifier will be created if the
    * allowDefaultIdentifiers property is set to true.
    * </p>
    */
    public java.util.Collection getIdentifiers();

   /**
    * <p>
    * Gets all identifiers for an entity. If 'follow' is true, and if
    * no identifiers can be found on the entity, a search up the
    * inheritance chain will be performed, and the identifiers from
    * the first super class having them will be used.   If no
    * identifiers exist, a default identifier will be created if the
    * allowDefaultIdentifiers property is set to true.
    * </p>
    */
    public java.util.Collection getIdentifiers(boolean follow);

   /**
    * <p>
    * The maximum length a SQL name may be.
    * </p>
    */
    public java.lang.Short getMaxSqlNameLength();

   /**
    * <p>
    * Gets the attributes as a list within an operation call,
    * optionally including the type names and the identifier
    * attributes.
    * </p>
    */
    public java.lang.String getOperationCallFromAttributes(boolean withIdentifiers);

   /**
    * <p>
    * Gets the attributes as a list within an operation call.  If
    * 'withTypeNames' is true, it will include the type names, if
    * 'withIdentifiers' is true it will include the identifiers.  If
    * 'follow' is true it will follow the inheritance hierarchy and
    * get the attributes of the super class as well.
    * </p>
    */
    public java.lang.String getOperationCallFromAttributes(boolean withIdentifiers, boolean follow);

   /**
    * <p>
    * Returns the parent association end of this entity if its a child
    * entity.  The parent is the entity that is the participant the
    * association that has composite aggregation defined.  Will return
    * null if the entity has no parent.
    * </p>
    */
    public org.andromda.metafacades.uml.EntityAssociationEnd getParentEnd();

   /**
    * <p>
    * Gets all properties of this entity, this includes the attributes
    * and navigable association ends of the entity.  The 'follow' flag
    * indcates whether or not the inheritance hierachy should be
    * followed when getting all the properties.  The 'withIdentifiers'
    * flag indicates whether or not identifiers should be included in
    * the collection of properties.
    * </p>
    */
    public java.util.Collection getProperties(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * Gets all query operations for an entity. If 'follow' is true,
    * and if no query operations can be found on the entity, a search
    * up the inheritance chain will be performed, and the identifiers
    * from the first super class having them will be used.   If no
    * identifiers exist, a default identifier will be created if the
    * allowDefaultIdentifiers property is set to true.
    * </p>
    */
    public java.util.Collection getQueryOperations(boolean follow);

   /**
    * <p>
    * Returns all the operations that can perform queries on the
    * entity.
    * </p>
    */
    public java.util.Collection getQueryOperations();

   /**
    * <p>
    * Gets a comma seperated list of required attribute names.  If
    * 'follow' is true, will travel up the inheritance hiearchy to
    * include attributes in parent entities as well.  If
    * 'withIdentifiers' is true, will include identifiers.
    * </p>
    */
    public java.lang.String getRequiredAttributeNameList(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * Gets a comma seperated list of attribute types with are
    * required.  If 'follow' is true, will travel up the inheritance
    * hiearchy to include attributes in parent entities as well.  If
    * 'withIdentifiers' is true, will include identifiers.
    * </p>
    */
    public java.lang.String getRequiredAttributeTypeList(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * Returns all attributes that are specified as 'required' in the
    * model.  If 'follow' is true, then required attributes in super
    * classes will also be returned, if false, just the ones directly
    * on the entity will be returned.  If 'withIdentifiers' is true,
    * the identifiers will be include, if false, no identifiers will
    * be included.
    * </p>
    */
    public java.util.Collection getRequiredAttributes(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * Gets all required properties for this entity.  These consist of
    * any required attributes as well as navigable associations that
    * are marked as 'required'.  If 'follow' is true, then the
    * inheritance hierchy will be followed and all required properties
    * from super classes will be included as well.
    * </p>
    * <p>
    * If 'withIdentifiers' is true, the identifiers will be include,
    * if false, no identifiers will be included.
    * </p>
    */
    public java.util.Collection getRequiredProperties(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * Creates a comma seperated list of the required property names.
    * </p>
    */
    public java.lang.String getRequiredPropertyNameList(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * A comma seperated list of the required property types.
    * </p>
    */
    public java.lang.String getRequiredPropertyTypeList(boolean follow, boolean withIdentifiers);

   /**
    * <p>
    * The name of the database table to which this entity is
    * persisted.
    * </p>
    */
    public java.lang.String getTableName();

   /**
    * <p>
    * Returns true/false depending on whether or not this entity
    * represetns a child in an association (this occurs when this
    * entity is on the opposite end of an assocation end defined as
    * composite).
    * </p>
    */
    public boolean isChild();

   /**
    * <p>
    * True if the entity has its identifiers dynamically added, false
    * otherwise.
    * </p>
    */
    public boolean isDynamicIdentifiersPresent();

   /**
    * <p>
    * True if the entity has any identifiers defined, false otherwise.
    * </p>
    */
    public boolean isIdentifiersPresent();

   /**
    * <p>
    * Indiciates if this entity is using an assigned identifier or
    * not.
    * </p>
    */
    public boolean isUsingAssignedIdentifier();

   /**
    * <p>
    * Indicates whether or not this entity is using a foreign
    * identifier as its identifiers.  That is: the foreignIdentifier
    * flag was set on an incoming association end and the entity is
    * therefore using the related foreign parent entity's identifier.
    * </p>
    */
    public boolean isUsingForeignIdentifier();

}