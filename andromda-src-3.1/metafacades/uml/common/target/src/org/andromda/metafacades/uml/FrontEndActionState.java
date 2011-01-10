//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * A front end action state represents an operation on the server
 * called by an action. Optionally an action state may defer
 * operations to the controller.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndActionState
    extends org.andromda.metafacades.uml.ActionStateFacade
{

   /**
    * <p>
    * The method name representing this action state.
    * </p>
    */
    public java.lang.String getActionMethodName();

   /**
    * <p>
    * The actions that pass through this action state.
    * </p>
    */
    public java.util.List getContainerActions();

   /**
    * <p>
    * All calls deferred to the controller by this action state.
    * </p>
    */
    public java.util.List getControllerCalls();

   /**
    * <p>
    * All exceptions modelled on this action state.
    * </p>
    */
    public java.util.List getExceptions();

   /**
    * <p>
    * The next transition, there can be only one transition going out
    * of an action state, otherwise decision points should be used
    * (triggers are not supported at the server-side).
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndForward getForward();

   /**
    * <p>
    * True if this element is contained in a FrontEndUseCase.
    * </p>
    */
    public boolean isContainedInFrontEndUseCase();

   /**
    * <p>
    * Indicates whether or not this front end action state is server
    * side. Pages, for example, are also action states but they return
    * control to the client.
    * </p>
    */
    public boolean isServerSide();

}