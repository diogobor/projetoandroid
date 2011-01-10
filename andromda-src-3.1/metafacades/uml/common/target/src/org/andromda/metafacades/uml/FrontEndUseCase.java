//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a use case used in the "front end" of an application.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndUseCase
    extends org.andromda.metafacades.uml.UseCaseFacade
{

   /**
    * <p>
    * The actions for this use-case. This will include the initial
    * action to start the use-case.
    * </p>
    */
    public java.util.List getActions();

   /**
    * <p>
    * Returns the activity graph describing this use-case in more
    * detail.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndActivityGraph getActivityGraph();

   /**
    * <p>
    * All roles that directly or indirectly related to any "front-end"
    * use cases.
    * </p>
    */
    public java.util.List getAllRoles();

   /**
    * <p>
    * Returns all struts use-cases in this "front end" application.
    * </p>
    */
    public java.util.List getAllUseCases();

   /**
    * <p>
    * Returns the controller for this use-case.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndController getController();

   /**
    * <p>
    * The first view of this use case, this may actually return a view
    * of another use case if the first is found by traveling through
    * the final state.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndView getInitialView();

   /**
    * <p>
    * The final states linking to this use case
    * </p>
    */
    public java.util.List getReferencingFinalStates();

   /**
    * <p>
    * Returns all roles that are directly and indirectly associated to
    * this use-case.
    * </p>
    */
    public java.util.List getRoles();

   /**
    * <p>
    * The variables for all views in this use-case. A parameter
    * qualifies to be a variable when it explicitely and directly
    * receives it via an action.
    * </p>
    */
    public java.util.List getViewVariables();

   /**
    * <p>
    * All views that are part of this use case.
    * </p>
    */
    public java.util.List getViews();

   /**
    * <p>
    * True if this use-case is the entry point to the front end.
    * </p>
    */
    public boolean isEntryUseCase();

   /**
    * <p>
    * Indicates if this use case is "secured".  This is true when
    * there is at least one role associated to it.
    * </p>
    */
    public boolean isSecured();

}