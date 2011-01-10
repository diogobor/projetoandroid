//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ActorFacade
    extends org.andromda.metafacades.uml.ClassifierFacade
{

   /**
    * <p>
    * All actors generalized by this actor.
    * </p>
    */
    public java.util.List getGeneralizedActors();

   /**
    * <p>
    * The set of actors that generalize this actor.
    * </p>
    */
    public java.util.List getGeneralizedByActors();

}