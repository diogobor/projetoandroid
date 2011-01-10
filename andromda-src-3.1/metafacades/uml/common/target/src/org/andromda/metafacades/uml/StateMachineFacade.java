//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface StateMachineFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * 
    */
    public org.andromda.metafacades.uml.ModelElementFacade getContextElement();

   /**
    * 
    */
    public java.util.Collection getFinalStates();

   /**
    * <p>
    * The first initial state (if any) found in this activity graph.
    * Although technically many initial states per graph are allowed,
    * it makes sense to have only one, for this reason we provide this
    * property.
    * </p>
    */
    public org.andromda.metafacades.uml.PseudostateFacade getInitialState();

   /**
    * 
    */
    public java.util.Collection getInitialStates();

   /**
    * <p>
    * The first transition on the first initial state found for this
    * activity graph.
    * </p>
    */
    public org.andromda.metafacades.uml.TransitionFacade getInitialTransition();

   /**
    * 
    */
    public java.util.Collection getPseudostates();

   /**
    * 
    */
    public java.util.Collection getStates();

   /**
    * 
    */
    public java.util.Collection getTransitions();

}