//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface UseCaseFacade
    extends org.andromda.metafacades.uml.NamespaceFacade
{

   /**
    * 
    */
    public java.util.Collection getExtends();

   /**
    * 
    */
    public java.util.Collection getExtensionPoints();

   /**
    * <p>
    * The first activity graph directly owned by this use-case.
    * </p>
    */
    public org.andromda.metafacades.uml.ActivityGraphFacade getFirstActivityGraph();

}