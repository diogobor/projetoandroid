//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ManageableEntityAttribute
    extends org.andromda.metafacades.uml.CoppetecEntityAttribute
{

   /**
    * <p>
    * Whether or not this attribute should be displayed.
    * </p>
    */
    public boolean isDisplay();

   /**
    * <p>
    * Whether or not this attribute can be read in a call isolated
    * from the rest (for example when downloading binary fields).
    * </p>
    */
    public boolean isManageableGetterAvailable();

}