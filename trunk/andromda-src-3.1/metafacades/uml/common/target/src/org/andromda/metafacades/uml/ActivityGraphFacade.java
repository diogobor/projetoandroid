//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface ActivityGraphFacade
    extends org.andromda.metafacades.uml.StateMachineFacade
{

   /**
    * 
    */
    public java.util.Collection getActionStates();

   /**
    * 
    */
    public java.util.Collection getObjectFlowStates();

   /**
    * 
    */
    public java.util.Collection getPartitions();

   /**
    * <p>
    * The use-case owning this activity graph.
    * </p>
    */
    public org.andromda.metafacades.uml.UseCaseFacade getUseCase();

}