//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a dependency/reference.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface DependencyFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * <p>
    * The "getter" name for this dependency.
    * </p>
    */
    public java.lang.String getGetterName();

   /**
    * <p>
    * The "setter" name for this dependency.
    * </p>
    */
    public java.lang.String getSetterName();

   /**
    * 
    */
    public org.andromda.metafacades.uml.ModelElementFacade getSourceElement();

   /**
    * <p>
    * Gets the element to which the dependencies belong.
    * </p>
    */
    public org.andromda.metafacades.uml.ModelElementFacade getTargetElement();

}