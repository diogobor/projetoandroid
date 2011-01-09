//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents an association between entities.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface EntityAssociation
    extends org.andromda.metafacades.uml.CoppetecAssociationFacade
{

   /**
    * <p>
    * The name of the table if this is a many-to-many association. 
    * Otherwise it just returns null if not part of a many-to-many
    * association.
    * </p>
    */
    public java.lang.String getTableName();

}