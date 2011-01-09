//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface StateVertexFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * 
    */
    public org.andromda.metafacades.uml.StateFacade getContainer();

   /**
    * 
    */
    public java.util.Collection getIncoming();

   /**
    * 
    */
    public java.util.Collection getOutgoing();

   /**
    * <p>
    * The partition (if any) to which this vertex belongs.
    * </p>
    */
    public org.andromda.metafacades.uml.PartitionFacade getPartition();

   /**
    * 
    */
    public org.andromda.metafacades.uml.StateMachineFacade getStateMachine();

}