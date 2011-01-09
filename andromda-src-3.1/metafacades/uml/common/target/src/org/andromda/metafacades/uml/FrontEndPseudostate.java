//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * Encapsulates a pseudostate and provides specific front-end
 * services. This pseudostate can be a decision point, junction or
 * initial state.
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndPseudostate
    extends org.andromda.metafacades.uml.PseudostateFacade
{

   /**
    * <p>
    * The actions that pass through this pseudo state.
    * </p>
    */
    public java.util.List getContainerActions();

   /**
    * <p>
    * Indicates if this "front-end" pseudo date is contained within a
    * "front-end" use case.
    * </p>
    */
    public boolean isContainedInFrontEndUseCase();

}