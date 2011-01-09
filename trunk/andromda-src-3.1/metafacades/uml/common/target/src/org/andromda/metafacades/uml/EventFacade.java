//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface EventFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * 
    */
    public java.util.Collection getParameters();

   /**
    * <p>
    * If this event is located on an action state, this will represent
    * that state.
    * </p>
    */
    public org.andromda.metafacades.uml.StateFacade getState();

   /**
    * <p>
    * If this event is located on a transition, this represents that
    * transition.
    * </p>
    */
    public org.andromda.metafacades.uml.TransitionFacade getTransition();

}