//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ManageableEntity
    extends org.andromda.metafacades.uml.CoppetecEntity
{

   /**
    * <p>
    * All entities to which can be browsed from this entity. Currently
    * this property will simple hold all entities, so the value is the
    * same for any arbitrary entity. Hiding entities can be done in
    * the presentation tier, for example depending on runtime security
    * information.
    * </p>
    */
    public java.util.List getAllManageables();

   /**
    * 
    */
    public org.andromda.metafacades.uml.ManageableEntityAttribute getDisplayAttribute();

   /**
    * 
    */
    public java.lang.String getFullyQualifiedManageableServiceName();

   /**
    * 
    */
    public java.util.List getManageableAssociationEnds();

   /**
    * 
    */
    public java.util.List getManageableMembers();

   /**
    * 
    */
    public java.lang.String getManageablePackageName();

   /**
    * 
    */
    public java.lang.String getManageablePackagePath();

   /**
    * 
    */
    public java.lang.String getManageableServiceAccessorCall();

   /**
    * 
    */
    public java.lang.String getManageableServiceFullPath();

   /**
    * 
    */
    public java.lang.String getManageableServiceName();

   /**
    * <p>
    * The maximum number of rows to load from the database.
    * </p>
    */
    public int getMaximumListSize();

   /**
    * <p>
    * The maximum number of rows to load from the database.
    * </p>
    */
    public int getPageSize();

   /**
    * 
    */
    public java.util.List getReferencingManageables();

   /**
    * 
    */
    public java.util.List getUsers();

   /**
    * 
    */
    public boolean isCreate();

   /**
    * 
    */
    public boolean isDelete();

   /**
    * 
    */
    public boolean isManageable();

   /**
    * 
    */
    public boolean isRead();

   /**
    * <p>
    * The maximum number of rows to load from the database.
    * </p>
    */
    public boolean isResolveable();

   /**
    * 
    */
    public boolean isUpdate();

   /**
    * 
    */
    public java.lang.String listManageableMembers(boolean withTypes);

}