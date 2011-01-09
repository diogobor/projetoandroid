//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a Classifier model element
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ClassifierFacade
    extends org.andromda.metafacades.uml.GeneralizableElementFacade
{

   /**
    * <p>
    * Return the attribute which name matches the parameter
    * </p>
    */
    public org.andromda.metafacades.uml.AttributeFacade findAttribute(java.lang.String name);

   /**
    * 
    */
    public java.util.Collection getAbstractions();

   /**
    * <p>
    * Gets the array type for this classifier.  If this classifier
    * already represents an array, it just returns itself.
    * </p>
    */
    public org.andromda.metafacades.uml.ClassifierFacade getArray();

   /**
    * <p>
    * The name of the classifier as an array.
    * </p>
    */
    public java.lang.String getArrayName();

   /**
    * <p>
    * Gets the association ends belonging to a classifier.
    * </p>
    */
    public java.util.Collection getAssociationEnds();

   /**
    * <p>
    * Gets the attributes that belong to the classifier.
    * </p>
    */
    public java.util.Collection getAttributes();

   /**
    * <p>
    * Gets all attributes for the classifier and if 'follow' is true
    * goes up the inheritance hierachy and gets the attributes from
    * the super classes as well.
    * </p>
    */
    public java.util.Collection getAttributes(boolean follow);

   /**
    * <p>
    * The fully qualified name of the classifier as an array.
    * </p>
    */
    public java.lang.String getFullyQualifiedArrayName();

   /**
    * <p>
    * A comma seperated list of the fully qualified names of all
    * implemented interfaces.
    * </p>
    */
    public java.lang.String getImplementedInterfaceList();

   /**
    * <p>
    * Those attributes that are scoped to an instance of this class.
    * </p>
    */
    public java.util.Collection getInstanceAttributes();

   /**
    * <p>
    * Those operations that are scoped to an instance of this class.
    * </p>
    */
    public java.util.Collection getInstanceOperations();

   /**
    * <p>
    * A String representing the null-value for this classifier type to
    * be used in a Java environment.
    * </p>
    */
    public java.lang.String getJavaNullString();

   /**
    * <p>
    * The other ends of this classifier's association ends which are
    * navigable.
    * </p>
    */
    public java.util.Collection getNavigableConnectingEnds();

   /**
    * <p>
    * Assuming that the classifier is an array, this will return the
    * non array type of the classifier from
    * </p>
    * <p>
    * the model.  If the classifier is NOT an array, it will just
    * return itself.
    * </p>
    */
    public org.andromda.metafacades.uml.ClassifierFacade getNonArray();

   /**
    * <p>
    * The attributes from this classifier in the form of an operation
    * call (this example would be in Java): '(java.lang.String
    * attributeOne, java.lang.String attributeTwo).  If there were no
    * attributes on the classifier, the result would be an empty '()'.
    * </p>
    */
    public java.lang.String getOperationCallFromAttributes();

   /**
    * 
    */
    public java.util.Collection getOperations();

   /**
    * <p>
    * Gets all properties (attributes and navigable association ends)
    * for the classifier and if 'follow' is true goes up the
    * inheritance hierachy and gets the properties from the super
    * classes as well.
    * </p>
    */
    public java.util.Collection getProperties(boolean follow);

   /**
    * <p>
    * A collection containing all 'properties' of the classifier. 
    * Properties are any attributes and navigable connecting
    * association ends.
    * </p>
    */
    public java.util.Collection getProperties();

   /**
    * <p>
    * Returns the serial version UID of the underlying model element.
    * </p>
    */
    public java.lang.Long getSerialVersionUID();

   /**
    * <p>
    * Those attributes that are scoped to the definition of this
    * class.
    * </p>
    */
    public java.util.Collection getStaticAttributes();

   /**
    * <p>
    * Those operations that are scoped to the definition of this
    * class.
    * </p>
    */
    public java.util.Collection getStaticOperations();

   /**
    * <p>
    * The wrapper name for this classifier if a mapped type has a
    * defined wrapper class (ie. 'long' maps to 'Long').  If the
    * classifier doesn't have a wrapper defined for it, this method
    * will return a null.  Note that wrapper mappings must be defined
    * for the namespace by defining the 'wrapperMappingsUri', this
    * property must point to the location of the mappings file which
    * maps the primitives to wrapper types.
    * </p>
    */
    public java.lang.String getWrapperName();

   /**
    * <p>
    * Indicates if this classifier is 'abstract'.
    * </p>
    */
    public boolean isAbstract();

   /**
    * <p>
    * True if this classifier represents an array type. False
    * otherwise.
    * </p>
    */
    public boolean isArrayType();

   /**
    * <p>
    * Returns true if this type represents a Blob type.
    * </p>
    */
    public boolean isBlobType();

   /**
    * <p>
    * Indicates if this type represents a boolean type or not.
    * </p>
    */
    public boolean isBooleanType();

   /**
    * <p>
    * True if this classifier represents a collection type. False
    * otherwise.
    * </p>
    */
    public boolean isCollectionType();

   /**
    * <p>
    * True/false depending on whether or not this classifier
    * represents a datatype.
    * </p>
    */
    public boolean isDataType();

   /**
    * <p>
    * True when this classifier is a date type.
    * </p>
    */
    public boolean isDateType();

   /**
    * <p>
    * True if this classifier is in fact marked as an enumeration.
    * </p>
    */
    public boolean isEnumeration();

   /**
    * <p>
    * Returns true if this type represents a 'file' type.
    * </p>
    */
    public boolean isFileType();

   /**
    * <p>
    * True/false depending on whether or not this Classifier
    * represents an interface or not.
    * </p>
    */
    public boolean isInterface();

   /**
    * <p>
    * True if this classifier cannot be extended and represent a leaf
    * in the inheritance tree.
    * </p>
    */
    public boolean isLeaf();

   /**
    * <p>
    * True if this classifier represents a list type. False otherwise.
    * </p>
    */
    public boolean isListType();

   /**
    * <p>
    * Indicates whether or not this classifier represents a Map type.
    * </p>
    */
    public boolean isMapType();

   /**
    * <p>
    * Indicates whether or not this classifier represents a
    * 'primative'.
    * </p>
    */
    public boolean isPrimitive();

   /**
    * <p>
    * True if this classifier represents a set type. False otherwise.
    * </p>
    */
    public boolean isSetType();

   /**
    * <p>
    * Indicates whether or not tihs classifier represents a string
    * type.
    * </p>
    */
    public boolean isStringType();

   /**
    * <p>
    * Indicates whether or not this classifier represents a time type.
    * </p>
    */
    public boolean isTimeType();

   /**
    * 
    */
    public boolean isWebServiceGeneralizationFormat();

   /**
    * 
    */
    public boolean validateFullyQualifiedNameSize();

}