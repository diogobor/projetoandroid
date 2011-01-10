//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents the activity graph describing the details of a
 * presentation tier or "front end" use case.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndActivityGraph
    extends org.andromda.metafacades.uml.ActivityGraphFacade
{

   /**
    * <p>
    * The controller context for this activity graph. This controller
    * can be the target of deferrable events in the action states and
    * transitions in this graph.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndController getController();

   /**
    * <p>
    * This is the initial action encountered in this activity graph.
    * This is the one and only transition coming out of the initial
    * state.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndAction getInitialAction();

   /**
    * <p>
    * True if this element is contained in a FrontEndUseCase.
    * </p>
    */
    public boolean isContainedInFrontEndUseCase();

}