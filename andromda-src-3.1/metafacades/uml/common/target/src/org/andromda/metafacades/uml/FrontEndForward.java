//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * A front end forward is any transition between front-end states.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndForward
    extends org.andromda.metafacades.uml.TransitionFacade
{

   /**
    * <p>
    * The method name used to delegate to this forward.
    * </p>
    */
    public java.lang.String getActionMethodName();

   /**
    * <p>
    * The front-end actions directly containing this front-end
    * forward.
    * </p>
    */
    public java.util.List getActions();

   /**
    * <p>
    * The trigger for this front-end forward.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndEvent getDecisionTrigger();

   /**
    * <p>
    * Tthe set of parameter used during transport in this forward.
    * </p>
    */
    public java.util.List getForwardParameters();

   /**
    * <p>
    * The activity graph which holds this forward if the graph is
    * contained in a FrontEndUseCase.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndActivityGraph getFrontEndActivityGraph();

   /**
    * <p>
    * The operation to which is called during execution of this
    * front-end forward.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndControllerOperation getOperationCall();

   /**
    * <p>
    * The use case in which this forward is contained.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndUseCase getUseCase();

   /**
    * <p>
    * Indicates if this forward is contained in a FrontEndUseCase.
    * </p>
    */
    public boolean isContainedInFrontEndUseCase();

   /**
    * <p>
    * Indicates if this action directly targets a "front-end" view,
    * false otherwise.
    * </p>
    */
    public boolean isEnteringView();

   /**
    * <p>
    * Indicates if this forward (transition) is coming out of a
    * front-end view.
    * </p>
    */
    public boolean isExitingView();

}