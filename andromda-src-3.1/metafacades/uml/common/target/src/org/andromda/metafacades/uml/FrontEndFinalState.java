//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * A final state represents the end of a use-case, in a "front-end"
 * application this means its the transition into the next
 * front-end use case.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndFinalState
    extends org.andromda.metafacades.uml.FinalStateFacade
{

   /**
    * <p>
    * Parameters that are directly entering this final state, they
    * will be able to survive a trip to the next use-case.
    * </p>
    */
    public java.util.List getInterUseCaseParameters();

   /**
    * <p>
    * The use case the final state is "targetting".
    * </p>
    */
    public org.andromda.metafacades.uml.FrontEndUseCase getTargetUseCase();

   /**
    * <p>
    * Indicates if this front end final state is contained within a
    * FrontEndUseCase.
    * </p>
    */
    public boolean isContainedInFrontEndUseCase();

}