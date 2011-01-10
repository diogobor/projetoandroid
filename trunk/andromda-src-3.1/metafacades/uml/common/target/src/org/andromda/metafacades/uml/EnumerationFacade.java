//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Represents an enumeration.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface EnumerationFacade
    extends org.andromda.metafacades.uml.ClassifierFacade
{

   /**
    * <p>
    * The 'from' operation name.  This is the name of the operation
    * that takes the actual literal value and allows a new enumeration
    * to be constructed.
    * </p>
    */
    public java.lang.String getFromOperationName();

   /**
    * <p>
    * The 'from' operation signature.  This is the signature that
    * takes the actual literal value and allows a new enumeration to
    * be constructed.
    * </p>
    */
    public java.lang.String getFromOperationSignature();

   /**
    * <p>
    * The type of the enumeration's literals.
    * </p>
    */
    public org.andromda.metafacades.uml.ClassifierFacade getLiteralType();

   /**
    * 
    */
    public java.util.Collection getLiterals();

}