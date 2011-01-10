//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a package storing "front-end" components.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndPackage
    extends org.andromda.metafacades.uml.CoppetecPackageFacade
{

   /**
    * <p>
    * The "front-end" controllers belonging to this package.
    * </p>
    */
    public java.util.List getFrontEndControllers();

   /**
    * <p>
    * The use cases that make up the "front-end".
    * </p>
    */
    public java.util.List getFrontEndUseCases();

}