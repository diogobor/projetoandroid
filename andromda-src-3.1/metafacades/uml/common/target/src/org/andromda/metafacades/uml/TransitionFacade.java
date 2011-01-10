//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface TransitionFacade
    extends org.andromda.metafacades.uml.ModelElementFacade
{

   /**
    * 
    */
    public org.andromda.metafacades.uml.ActionFacade getEffect();

   /**
    * 
    */
    public org.andromda.metafacades.uml.GuardFacade getGuard();

   /**
    * 
    */
    public org.andromda.metafacades.uml.StateVertexFacade getSource();

   /**
    * 
    */
    public org.andromda.metafacades.uml.StateVertexFacade getTarget();

   /**
    * <p>
    * If a trigger is present on this transition, this event
    * represents that trigger.
    * </p>
    */
    public org.andromda.metafacades.uml.EventFacade getTrigger();

   /**
    * 
    */
    public boolean isEnteringActionState();

   /**
    * 
    */
    public boolean isEnteringDecisionPoint();

   /**
    * 
    */
    public boolean isEnteringFinalState();

   /**
    * 
    */
    public boolean isExitingActionState();

   /**
    * 
    */
    public boolean isExitingDecisionPoint();

   /**
    * 
    */
    public boolean isExitingInitialState();

   /**
    * 
    */
    public boolean isTriggerPresent();

}