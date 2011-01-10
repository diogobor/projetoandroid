//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a view within a front end application.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndView
    extends org.andromda.metafacades.uml.FrontEndActionState
{

   /**
    * <p>
    * All actions that can be triggered on this view.
    * </p>
    */
    public java.util.List getActions();

   /**
    * <p>
    * All parameters for each action going out of this view.
    * </p>
    */
    public java.util.List getAllActionParameters();

   /**
    * <p>
    * All fields from all forms on the given view.
    * </p>
    */
    public java.util.List getAllFormFields();

   /**
    * <p>
    * The use-case of which this view is a member.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndUseCase getUseCase();

   /**
    * <p>
    * All those variables that will be present as variables in the
    * target view. These are the trigger parameters on the incoming
    * transitions.
    * </p>
    */
    public java.util.List getVariables();

   /**
    * <p>
    * True if this element carries the FrontEndView stereotype.
    * </p>
    */
    public boolean isFrontEndView();

}