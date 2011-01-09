//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ExtendFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * 
    */
    public org.andromda.metafacades.uml.UseCaseFacade getBase();

   /**
    * 
    */
    public org.andromda.metafacades.uml.UseCaseFacade getExtension();

   /**
    * 
    */
    public java.util.List getExtensionPoints();

}