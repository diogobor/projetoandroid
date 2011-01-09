//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface PseudostateFacade
    extends org.andromda.metafacades.uml.StateVertexFacade
{

   /**
    * 
    */
    public boolean isChoice();

   /**
    * <p>
    * Denotes this pseudostate to be either a join or a fork with a
    * single outgoing transition and more than one incoming
    * transition.
    * </p>
    */
    public boolean isCollect();

   /**
    * 
    */
    public boolean isDecisionPoint();

   /**
    * 
    */
    public boolean isDeepHistory();

   /**
    * 
    */
    public boolean isFork();

   /**
    * 
    */
    public boolean isInitialState();

   /**
    * 
    */
    public boolean isJoin();

   /**
    * 
    */
    public boolean isJunction();

   /**
    * 
    */
    public boolean isMergePoint();

   /**
    * 
    */
    public boolean isShallowHistory();

   /**
    * <p>
    * Denotes this pseudostate to be either a join or a fork with a
    * single incoming transition and more than one outgoing
    * transition.
    * </p>
    */
    public boolean isSplit();

}