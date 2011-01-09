//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * <p>
 * A front-end exception handler intercepts exceptions and
 * delegates them into a front-end action state that will handle it
 * (for example by simply displaying it if the action state
 * happened to be a view) .
 * </p>
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface FrontEndExceptionHandler
    extends org.andromda.metafacades.uml.FrontEndForward
{

   /**
    * <p>
    * Indicatesif this element carries the FrontEndException
    * stereotype.
    * </p>
    */
    public boolean isFrontEndException();

}