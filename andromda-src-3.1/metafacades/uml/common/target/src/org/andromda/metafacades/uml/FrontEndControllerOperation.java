//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents an operation modeled on a controller.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndControllerOperation
    extends org.andromda.metafacades.uml.OperationFacade
{

   /**
    * <p>
    * The activity graph in which this controller operation is used.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndActivityGraph getActivityGraph();

   /**
    * <p>
    * All those actions that contain at least one front-end action
    * state that is deferring to this operation.
    * </p>
    */
    public java.util.List getDeferringActions();

   /**
    * <p>
    * The set of fields in the form made up form this controller
    * operation's parameters.
    * </p>
    */
    public java.util.List getFormFields();

   /**
    * <p>
    * For each front-end controller operation argument there must
    * exist a form field for each action deferring to that operation.
    * This form field must carry the same name and must be of the same
    * type. True if this is the case, false otherwise.
    * </p>
    */
    public boolean isAllArgumentsHaveFormFields();

   /**
    * <p>
    * Indicates if the owner of this operation is a controller.
    * </p>
    */
    public boolean isOwnerIsController();

}