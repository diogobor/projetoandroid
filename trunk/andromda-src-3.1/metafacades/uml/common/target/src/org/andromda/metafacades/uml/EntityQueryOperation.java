//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents a persistent entity finder method.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface EntityQueryOperation
    extends org.andromda.metafacades.uml.OperationFacade
{

   /**
    * <p>
    * The query string for this EntityFinderMethod.  The query
    * returned is based on the 'translation' passed in.  The
    * translation must be one available to AndroMDA found with a
    * translation-library.
    * </p>
    */
    public java.lang.String getQuery(java.lang.String translation);

}