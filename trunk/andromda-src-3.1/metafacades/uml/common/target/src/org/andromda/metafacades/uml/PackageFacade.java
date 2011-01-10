//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface PackageFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * <p>
    * Finds the model element with the given 'fullyQualifiedName', or
    * returns null if one can't be found with that name.
    * </p>
    */
    public org.andromda.metafacades.uml.ModelElementFacade findModelElement(java.lang.String fullyQualifiedName);

   /**
    * 
    */
    public java.util.Collection getClasses();

   /**
    * <p>
    * Gets all the model elements belonging to the root package.
    * </p>
    */
    public java.util.Collection getModelElements();

   /**
    * <p>
    * The elements directly found in this package.
    * </p>
    */
    public java.util.Collection getOwnedElements();

   /**
    * 
    */
    public java.util.Collection getSubPackages();

}