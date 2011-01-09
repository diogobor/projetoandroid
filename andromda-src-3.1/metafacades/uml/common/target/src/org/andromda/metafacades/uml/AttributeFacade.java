//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents an attribute on a classifier.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface AttributeFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * <p>
    * Searches the given feature for the specified tag.
    * </p>
    * <p>
    * If the follow boolean is set to true then the search will
    * continue from the class attribute to the class itself and then
    * up the class hiearchy.
    * </p>
    */
    public java.lang.Object findTaggedValue(java.lang.String name, boolean follow);

   /**
    * <p>
    * The default value of the attribute.  This is the value given if
    * no value is defined.
    * </p>
    */
    public java.lang.String getDefaultValue();

   /**
    * <p>
    * If the attribute is an enumeration literal this represents the
    * owning enumeration. Can be empty.
    * </p>
    */
    public org.andromda.metafacades.uml.EnumerationFacade getEnumeration();

   /**
    * <p>
    * The value for this attribute if it is an enumeration literal,
    * null otherwise. The default value is returned as a String if it
    * has been specified, if it's not specified this attribute's name
    * is assumed.
    * </p>
    */
    public java.lang.String getEnumerationValue();

   /**
    * <p>
    * The name of the accessor operation that would retrieve this
    * attribute's value.
    * </p>
    */
    public java.lang.String getGetterName();

   /**
    * <p>
    * The name of the type that is returned on the accessor and
    * mutator operations,  determined in part by the multiplicity.
    * </p>
    */
    public java.lang.String getGetterSetterTypeName();

   /**
    * <p>
    * Gets the classifer who is the owner of the attributes.
    * </p>
    */
    public org.andromda.metafacades.uml.ClassifierFacade getOwner();

   /**
    * <p>
    * The name of the mutator operation that would retrieve this
    * attribute's value.
    * </p>
    */
    public java.lang.String getSetterName();

   /**
    * 
    */
    public org.andromda.metafacades.uml.ClassifierFacade getType();

   /**
    * <p>
    * True if this attribute can only be set.
    * </p>
    */
    public boolean isAddOnly();

   /**
    * <p>
    * True if this attribute can be modified.
    * </p>
    */
    public boolean isChangeable();

   /**
    * <p>
    * Indicates if the default value is present.
    * </p>
    */
    public boolean isDefaultValuePresent();

   /**
    * <p>
    * True if this attribute is owned by an enumeration.
    * </p>
    */
    public boolean isEnumerationLiteral();

   /**
    * <p>
    * Whether or not this attribute has a multiplicity of greater than
    * 1.
    * </p>
    */
    public boolean isMany();

   /**
    * <p>
    * Indicates whether or not the attributes are ordered (if
    * multiplicity is greater than 1).
    * </p>
    */
    public boolean isOrdered();

   /**
    * <p>
    * Whether or not this attribute can be modified.
    * </p>
    */
    public boolean isReadOnly();

   /**
    * <p>
    * Whether or not the multiplicity of this attribute is 1.
    * </p>
    */
    public boolean isRequired();

   /**
    * <p>
    * Indicates if this attribute is 'static', meaning it has a
    * classifier scope.
    * </p>
    */
    public boolean isStatic();

}