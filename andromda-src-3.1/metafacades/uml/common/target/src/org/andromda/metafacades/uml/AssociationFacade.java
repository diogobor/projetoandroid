//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface AssociationFacade
    extends org.andromda.metafacades.uml.GeneralizableElementFacade
{

   /**
    * <p>
    * Gets the association ends belonging to this association.
    * </p>
    */
    public java.util.List getAssociationEnds();

   /**
    * 
    */
    public java.lang.String getRelationName();

   /**
    * <p>
    * Indicates whether or not this associations represents a
    * many-to-many relation.
    * </p>
    */
    public boolean isMany2Many();

}