//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * A front end controller is assigned as the context of a use-case.
 * The controller provides the "controlling" of the use case's
 * activity.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndController
    extends org.andromda.metafacades.uml.ClassifierFacade
{

   /**
    * <p>
    * All actions that defer to at least one operation of this
    * controller.
    * </p>
    */
    public java.util.List getDeferringActions();

   /**
    * <p>
    * Returns all back-end services referenced by this controller.
    * </p>
    */
    public java.util.List getServiceReferences();

   /**
    * <p>
    * Returns the use-case "controlled" by this controller.
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndUseCase getUseCase();

}