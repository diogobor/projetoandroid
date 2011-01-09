//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a "front-end" action. An action is some action that
 * is taken when a front-end even occurs.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndAction
    extends org.andromda.metafacades.uml.FrontEndForward
{

   /**
    * <p>
    * Finds the parameter on this action having the given name, if no
    * parameter is found, null is returned instead.
    * </p>
    */
    public org.andromda.metafacades.uml.ParameterFacade findParameter(java.lang.String name);

   /**
    * <p>
    * All action forwards for this foward. Each action forward either
    * calls a view or another use-case (which is essentially an
    * action).
    * </p>
    */
    public java.util.List getActionForwards();

   /**
    * <p>
    * All action states visited by this action.
    * </p>
    */
    public java.util.List getActionStates();

   /**
    * <p>
    * The controller that will handle the execution of this front-end
    * action. This controller is set as the context of the activity
    * graph (and therefore also of the use-case).
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndController getController();

   /**
    * <p>
    * All the transitions coming out of decision points. These
    * transitions should all carry guards.
    * </p>
    */
    public java.util.List getDecisionTransitions();

   /**
    * <p>
    * The controller operations to which this action defers, the order
    * is preserved.
    * </p>
    */
    public java.util.List getDeferredOperations();

   /**
    * <p>
    * Form fields for this action. Form fields are those parameters
    * that can be altered by the user on a corresponding view at
    * runtime.
    * </p>
    */
    public java.util.List getFormFields();

   /**
    * <p>
    * The view on which this action can be triggered.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndView getInput();

   /**
    * <p>
    * All parameters sent by this "front-end" action.
    * </p>
    */
    public java.util.List getParameters();

   /**
    * <p>
    * All views that can be possibly targetted by triggering this
    * action.
    * </p>
    */
    public java.util.List getTargetViews();

   /**
    * <p>
    * All the transitions that make up this action, this directly maps
    * onto the forwards.
    * </p>
    */
    public java.util.List getTransitions();

   /**
    * <p>
    * Indicates if this action represents the beginning of the
    * front-end use case or not.
    * </p>
    */
    public boolean isUseCaseStart();

}