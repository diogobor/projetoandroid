//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * A front-end event is represented by some kind of even on some
 * kind of front-end (hyperlink, submit button, etc).
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndEvent
    extends org.andromda.metafacades.uml.EventFacade
{

   /**
    * <p>
    * The action which triggers the "front-end" event.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndAction getAction();

   /**
    * <p>
    * The call to the controller for this front-end event (if any).
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndControllerOperation getControllerCall();

   /**
    * <p>
    * Indicates whether or not this front end event is contained
    * within a FrontEndUseCase.
    * </p>
    */
    public boolean isContainedInFrontEndUseCase();

}