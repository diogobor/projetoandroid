//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ModelFacade
{
    /**
     * Provides any required initialization of the metafacade.
     */
    void initialize();

    /**
     * Gets the metafacade that acts as the <code>owner</code> of this metafacade.
     * (for example: an operation is an owner of its parameters, etc). This is used
     * by AndroMDA's validation framework to provide more context as to where the
     * error has occurred.
     */
    public Object getValidationOwner();

    /**
     * Gets the name of the metafacade used within validation messages.  This provides
     * the full name of the metafacade.
     */
    public String getValidationName();

    /**
     * Performs validation of any invariants found on this model element
     * and stores the messages within the <code>validationMessages</code>
     * collection.
     *
     * @param validationMessages the collection of messages to which additional
     *        validation messages will be added if invariants are broken.
     */
    void validateInvariants(java.util.Collection validationMessages);

   /**
    * 
    */
    public org.andromda.metafacades.uml.ActivityGraphFacade findActivityGraphByName(java.lang.String name);

   /**
    * 
    */
    public org.andromda.metafacades.uml.ActivityGraphFacade findActivityGraphByNameAndStereotype(java.lang.String name, java.lang.String stereotypeName);

   /**
    * 
    */
    public org.andromda.metafacades.uml.ClassifierFacade findClassWithTaggedValueOrHyperlink(java.lang.String tag, java.lang.String value);

   /**
    * 
    */
    public java.util.Collection findFinalStatesWithNameOrHyperlink(org.andromda.metafacades.uml.UseCaseFacade useCase);

   /**
    * 
    */
    public org.andromda.metafacades.uml.UseCaseFacade findUseCaseByName(java.lang.String name);

   /**
    * 
    */
    public org.andromda.metafacades.uml.UseCaseFacade findUseCaseWithNameAndStereotype(java.lang.String name, java.lang.String stereotypeName);

   /**
    * 
    */
    public org.andromda.metafacades.uml.UseCaseFacade findUseCaseWithTaggedValueOrHyperlink(java.lang.String tag, java.lang.String value);

   /**
    * 
    */
    public java.util.Collection getAllActionStates();

   /**
    * 
    */
    public java.util.Collection getAllActionStatesWithStereotype(org.andromda.metafacades.uml.ActivityGraphFacade activityGraph, java.lang.String stereotypeName);

   /**
    * 
    */
    public java.util.Collection getAllActors();

   /**
    * 
    */
    public java.util.Collection getAllClasses();

   /**
    * 
    */
    public java.util.Collection getAllUseCases();

   /**
    * 
    */
    public org.andromda.metafacades.uml.PackageFacade getRootPackage();

}