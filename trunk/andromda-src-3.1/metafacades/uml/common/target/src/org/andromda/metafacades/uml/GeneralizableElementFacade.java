//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * The model element that represents an element that can be
 * generalized or specialized.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface GeneralizableElementFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * <p>
    * Finds the tagged value optional searching the entire inheritance
    * hierarchy if 'follow' is set to true.
    * </p>
    */
    public java.lang.Object findTaggedValue(java.lang.String tagName, boolean follow);

   /**
    * <p>
    * All generalizations for this generalizable element, goes up the
    * inheritance tree.
    * </p>
    */
    public java.util.Collection getAllGeneralizations();

   /**
    * <p>
    * All specializations (travels down the inheritance hiearchy).
    * </p>
    */
    public java.util.Collection getAllSpecializations();

   /**
    * <p>
    * Gets the direct generalization for this generalizable element.
    * </p>
    */
    public org.andromda.metafacades.uml.GeneralizableElementFacade getGeneralization();

   /**
    * <p>
    * Gets the actual links that this generalization element is part
    * of (it plays either the specialization or generalization).
    * </p>
    */
    public java.util.Collection getGeneralizationLinks();

   /**
    * <p>
    * A comma seperated list of the fully qualified names of all
    * generalizations.
    * </p>
    */
    public java.lang.String getGeneralizationList();

   /**
    * 
    */
    public java.util.Collection getGeneralizations();

   /**
    * <p>
    * Gets the direct specializations (i.e. sub elements) for this
    * generalizatble element.
    * </p>
    */
    public java.util.Collection getSpecializations();

}