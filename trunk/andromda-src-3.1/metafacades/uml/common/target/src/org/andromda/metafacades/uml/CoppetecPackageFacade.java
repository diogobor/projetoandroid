//
// Attention: generated code (by Metafacade.vsl) - do not modify!
//
package org.andromda.metafacades.uml;

/**
 * 
 *
 * Metafacade interface to be used by AndroMDA cartridges.
 */
public interface CoppetecPackageFacade
    extends org.andromda.metafacades.uml.PackageFacade
{

   /**
    * 
    */
    public java.util.Collection getFinalStates();

   /**
    * 
    */
    public java.util.Collection getManageables();

   /**
    * 
    */
    public java.util.Collection getMessageDrivenBeans();

   /**
    * 
    */
    public java.lang.String getMoreSpecificPackageName();

   /**
    * 
    */
    public java.lang.String getServiceModuleName();

   /**
    * 
    */
    public java.util.Collection getSessions();

   /**
    * 
    */
    public java.util.Collection getUseCases();

   /**
    * 
    */
    public java.lang.String getWebModuleName();

   /**
    * 
    */
    public java.lang.Boolean getWebServiceModule();

   /**
    * 
    */
    public java.util.Collection getWebServices();

   /**
    * 
    */
    public java.lang.String replaceOutletWithServiceModuleName(java.lang.String outlet);

   /**
    * 
    */
    public java.lang.String replaceOutletWithWebModuleName(java.lang.String outlet);

}