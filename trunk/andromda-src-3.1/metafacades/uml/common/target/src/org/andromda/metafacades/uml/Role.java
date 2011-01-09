//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a role a user may play within a system.  Provides
 * access to things such as services and service operations.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface Role
    extends org.andromda.metafacades.uml.ActorFacade
{

   /**
    * <p>
    * Indicates if the necessary references are present for the Role. 
    * This include any references to a service, service operation or
    * use case.
    * </p>
    */
    public boolean isReferencesPresent();

}