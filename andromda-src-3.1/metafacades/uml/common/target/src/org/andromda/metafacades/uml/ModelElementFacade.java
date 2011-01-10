//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a model element.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ModelElementFacade
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
    * <p>
    * Copies all tagged values from the given ModelElementFacade to
    * this model element facade.
    * </p>
    */
    public void copyTaggedValues(org.andromda.metafacades.uml.ModelElementFacade element);

   /**
    * <p>
    * Finds the tagged value with the specified 'tagName'. In case
    * there are more values the first one found will be returned.
    * </p>
    */
    public java.lang.Object findTaggedValue(java.lang.String tagName);

   /**
    * <p>
    * Returns all the values for the tagged value with the specified
    * name. The returned collection will contains only String
    * instances, or will be empty. Never null.
    * </p>
    */
    public java.util.Collection findTaggedValues(java.lang.String tagName);

   /**
    * <p>
    * Gets all constraints belonging to the model element.
    * </p>
    */
    public java.util.Collection getConstraints();

   /**
    * <p>
    * Returns the constraints of the argument kind that have been
    * placed onto this model. Typical kinds are "inv", "pre" and
    * "post". Other kinds are possible.
    * </p>
    */
    public java.util.Collection getConstraints(java.lang.String kind);

   /**
    * 
    */
    public java.lang.String getDocumentation(java.lang.String indent, int lineLength, boolean htmlStyle);

   /**
    * <p>
    * This method returns the documentation for this model element,
    * with the lines wrapped after the specified number of characters,
    * values of less than 1 will indicate no line wrapping is
    * required. By default paragraphs are returned as HTML.
    * </p>
    * <p>
    * This method is equivalent to <code>getDocumentation(indent,
    * lineLength, true)</code>.
    * </p>
    */
    public java.lang.String getDocumentation(java.lang.String indent, int lineLength);

   /**
    * <p>
    * Gets the documentation for the model element, The indent
    * argument is prefixed to each line. By default this method wraps
    * lines after 64 characters.
    * </p>
    * <p>
    * This method is equivalent to <code>getDocumentation(indent,
    * 64)</code>.
    * </p>
    */
    public java.lang.String getDocumentation(java.lang.String indent);

   /**
    * <p>
    * Returns the fully qualified name of the model element. The fully
    * qualified name includes complete package qualified name of the
    * underlying model element.  If modelName is true, then the
    * original name of the model element (the name contained within
    * the model) will be the name returned, otherwise a name from a
    * language mapping will be returned.
    * </p>
    */
    public java.lang.String getFullyQualifiedName(boolean modelName);

   /**
    * <p>
    * The fully qualified name of this model element.
    * </p>
    */
    public java.lang.String getFullyQualifiedName();

   /**
    * <p>
    * Returns the fully qualified name as a path, the returned value
    * always starts with out a slash '/'.
    * </p>
    */
    public java.lang.String getFullyQualifiedNamePath();

   /**
    * <p>
    * Gets the unique identifier of the underlying model element.
    * </p>
    */
    public java.lang.String getId();

   /**
    * <p>
    * The language mappings that have been set for this model elemnt.
    * </p>
    */
    public org.andromda.metafacades.uml.TypeMappings getLanguageMappings();

   /**
    * 
    */
    public org.andromda.metafacades.uml.ModelFacade getModel();

   /**
    * <p>
    * The name of the model element.
    * </p>
    */
    public java.lang.String getName();

   /**
    * <p>
    * Gets the package to which this model element belongs.
    * </p>
    */
    public org.andromda.metafacades.uml.ModelElementFacade getPackage();

   /**
    * <p>
    * Gets the package name (optionally providing the ability to
    * retrieve the model name and not the mapped name).
    * </p>
    */
    public java.lang.String getPackageName(boolean modelName);

   /**
    * <p>
    * The name of this model element's package.
    * </p>
    */
    public java.lang.String getPackageName();

   /**
    * <p>
    * Returns the package as a path, the returned value always starts
    * with out a slash '/'.
    * </p>
    */
    public java.lang.String getPackagePath();

   /**
    * <p>
    * Gets the root package for the model element.
    * </p>
    */
    public org.andromda.metafacades.uml.PackageFacade getRootPackage();

   /**
    * <p>
    * Gets the dependencies for which this model element is the
    * source.
    * </p>
    */
    public java.util.Collection getSourceDependencies();

   /**
    * <p>
    * If this model element is the context of an activity graph, this
    * represents that activity graph.
    * </p>
    */
    public org.andromda.metafacades.uml.StateMachineFacade getStateMachineContext();

   /**
    * <p>
    * The collection of ALL stereotype names for this model element.
    * </p>
    */
    public java.util.Collection getStereotypeNames();

   /**
    * <p>
    * Gets all stereotypes for this model element.
    * </p>
    */
    public java.util.Collection getStereotypes();

   /**
    * 
    */
    public java.util.Collection getTaggedValues();

   /**
    * <p>
    * Gets the dependencies for which this model element is the
    * target.
    * </p>
    */
    public java.util.Collection getTargetDependencies();

   /**
    * 
    */
    public java.lang.Object getTemplateParameter(java.lang.String parameterName);

   /**
    * 
    */
    public java.util.Collection getTemplateParameters();

   /**
    * <p>
    * The visibility (i.e. public, private, protected or package) of
    * the model element, will attempt a lookup for these values in the
    * language mappings (if any).
    * </p>
    */
    public java.lang.String getVisibility();

   /**
    * <p>
    * Returns true if the model element has the exact stereotype
    * (meaning no stereotype inheritence is taken into account when
    * searching for the stereotype), false otherwise.
    * </p>
    */
    public boolean hasExactStereotype(java.lang.String stereotypeName);

   /**
    * <p>
    * Returns true if the model element has the specified stereotype. 
    * If the stereotype itself does not match, then a search will be
    * made up the steretype inheritance hiearchy, and if one of the
    * stereotype's ancestors has a matching name this method will
    * return true, false otherwise.
    * </p>
    * <p>
    * For example, if we have a certain stereotype called
    * <<exception>> and a model element has a stereotype called
    * <<applicationException>> which extends <<exception>>, when
    * calling this method with 'stereotypeName' defined as 'exception'
    * the method would return true since <<applicationException>>
    * inherits from <<exception>>.  If you want to check if the model
    * element has the exact stereotype, then use the method
    * 'hasExactStereotype' instead.
    * </p>
    */
    public boolean hasStereotype(java.lang.String stereotypeName);

   /**
    * 
    */
    public boolean isBindingDependenciesPresent();

   /**
    * <p>
    * Indicates if any constraints are present on this model element.
    * </p>
    */
    public boolean isConstraintsPresent();

   /**
    * 
    */
    public boolean isTemplateParametersPresent();

   /**
    * <p>
    * Searches for the constraint with the specified 'name' on this
    * model element, and if found translates it using the specified
    * 'translation' from a translation library discovered by the
    * framework.
    * </p>
    */
    public java.lang.String translateConstraint(java.lang.String name, java.lang.String translation);

   /**
    * <p>
    * Translates all constraints belonging to this model element with
    * the given 'translation'.
    * </p>
    */
    public java.lang.String[] translateConstraints(java.lang.String translation);

   /**
    * <p>
    * Translates the constraints of the specified 'kind' belonging to
    * this model element.
    * </p>
    */
    public java.lang.String[] translateConstraints(java.lang.String kind, java.lang.String translation);

}