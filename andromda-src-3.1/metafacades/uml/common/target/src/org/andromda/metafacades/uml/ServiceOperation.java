//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Reprsents an operation of a service.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ServiceOperation
    extends org.andromda.metafacades.uml.OperationFacade
{

   /**
    * <p>
    * The users of the service operation, these are the actor's that
    * can access this operation.
    * </p>
    */
    public java.util.Collection getRoles();

   /**
    * <p>
    * The service which owns the service operation.
    * </p>
    */
    public org.andromda.metafacades.uml.Service getService();

}