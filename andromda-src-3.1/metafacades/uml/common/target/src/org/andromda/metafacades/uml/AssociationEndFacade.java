//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface AssociationEndFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * 
    */
    public org.andromda.metafacades.uml.AssociationFacade getAssociation();

   /**
    * 
    */
    public java.lang.String getGetterName();

   /**
    * <p>
    * The name of the type that is returned on the accessor and
    * mutator operations,  determined in part by the multiplicity.
    * </p>
    */
    public java.lang.String getGetterSetterTypeName();

   /**
    * 
    */
    public org.andromda.metafacades.uml.AssociationEndFacade getOtherEnd();

   /**
    * 
    */
    public java.lang.String getSetterName();

   /**
    * 
    */
    public org.andromda.metafacades.uml.ClassifierFacade getType();

   /**
    * 
    */
    public boolean isAggregation();

   /**
    * <p>
    * Returns whether or not (true/false) this association end is the
    * child end of the assocation (i.e. the other end's aggregation is
    * composition).
    * </p>
    */
    public boolean isChild();

   /**
    * 
    */
    public boolean isComposition();

   /**
    * 
    */
    public boolean isMany();

   /**
    * 
    */
    public boolean isMany2Many();

   /**
    * 
    */
    public boolean isMany2One();

   /**
    * 
    */
    public boolean isNavigable();

   /**
    * 
    */
    public boolean isOne2Many();

   /**
    * 
    */
    public boolean isOne2One();

   /**
    * <p>
    * Indicates whether or not the association ends are ordered (if
    * multiplicity is greater than 1).
    * </p>
    */
    public boolean isOrdered();

   /**
    * 
    */
    public boolean isReadOnly();

   /**
    * 
    */
    public boolean isRequired();

}