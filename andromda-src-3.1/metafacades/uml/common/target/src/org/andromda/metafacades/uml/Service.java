//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a service.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface Service
    extends org.andromda.metafacades.uml.ClassifierFacade
{

   /**
    * <p>
    * All roles associated with the service, this includes both roles
    * that have access to the entire service, and any roles that have
    * access to a single operation.
    * </p>
    */
    public java.util.Collection getAllRoles();

   /**
    * <p>
    * References to all entities to which this service has a
    * dependency.
    * </p>
    */
    public java.util.Collection getEntityReferences();

   /**
    * <p>
    * The roles of the service, these are the actor's that can access
    * this service.
    * </p>
    */
    public java.util.Collection getRoles();

   /**
    * <p>
    * References to all services to which this service has a
    * dependency.
    * </p>
    */
    public java.util.Collection getServiceReferences();

}