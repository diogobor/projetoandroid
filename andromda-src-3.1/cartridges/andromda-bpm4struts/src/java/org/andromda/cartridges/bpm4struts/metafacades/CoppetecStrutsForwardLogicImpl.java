package org.andromda.cartridges.bpm4struts.metafacades;

import org.andromda.cartridges.bpm4struts.Bpm4StrutsProfile;
import org.andromda.metafacades.uml.CoppetecFrontEndPackage;
import org.andromda.metafacades.uml.CoppetecPackageFacade;
import org.andromda.metafacades.uml.CoppetecUMLMetafacadeProperties;
import org.andromda.metafacades.uml.StateVertexFacade;
import org.andromda.metafacades.uml.UMLProfile;
import org.apache.commons.lang.StringUtils;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.bpm4struts.metafacades.CoppetecStrutsForward.
 *
 * @see org.andromda.cartridges.bpm4struts.metafacades.CoppetecStrutsForward
 */
public class CoppetecStrutsForwardLogicImpl
    extends CoppetecStrutsForwardLogic
{

	public String insertModuleNameIntoOutlet(String outlet){
		return ((CoppetecPackageFacade)(getUseCase().getPackage())).replaceOutletWithWebModuleName(outlet); 
	}
    
    public CoppetecStrutsForwardLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
    
    protected java.lang.String handleGetForwardPath()
    {
    	String forwardPath = null;
        
        final StateVertexFacade target = this.getTarget();
        
        if (isEnteringPage())
        {
            forwardPath = ((StrutsJsp)target).getFullPath() + ".jsp";
        }
        else if (isEnteringFinalState())
        {
            forwardPath = ((StrutsFinalState)target).getFullPath();
  
            if(((StrutsFinalState)target).findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_EXTERNAL_APPLICATION_NAME)== null || ((StrutsFinalState)target).findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_EXTERNAL_APPLICATION_NAME).equals("")){
	            if(((StrutsFinalState)target).findTaggedValue(UMLProfile.TAGGEDVALUE_EXTERNAL_HYPERLINK) == null){
	            	// caso tagged value n�o preenchida.. entao considera que N�O � troca de modulo
	            	
	        		
	            }
	            else{
	            	if(((StrutsFinalState)target).findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_HYPERLINK_MODULO) == null)
	            		forwardPath = "/" + getConfiguredProperty(CoppetecUMLMetafacadeProperties.CONTEXTO_PRINCIPAL) +  
                        ((StrutsFinalState)target).findTaggedValue(UMLProfile.TAGGEDVALUE_EXTERNAL_HYPERLINK).toString();
	            	else
	            		forwardPath = "/" + getConfiguredProperty(CoppetecUMLMetafacadeProperties.CONTEXTO_PRINCIPAL) + "/" + 
	            					  ((StrutsFinalState)target).findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_HYPERLINK_MODULO).toString() +
	            					  ((StrutsFinalState)target).findTaggedValue(UMLProfile.TAGGEDVALUE_EXTERNAL_HYPERLINK).toString();
	            		
	            	
	            }
            }else{
            	String modulo ="";
            	String link = "";
            	if(((StrutsFinalState)target).findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_HYPERLINK_MODULO)!=null)
            	modulo = ((StrutsFinalState)target).findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_HYPERLINK_MODULO).toString();
            	if(((StrutsFinalState)target).findTaggedValue(UMLProfile.TAGGEDVALUE_EXTERNAL_HYPERLINK)!=null)
                link = ((StrutsFinalState)target).findTaggedValue(UMLProfile.TAGGEDVALUE_EXTERNAL_HYPERLINK).toString();
            	forwardPath = "/" + 
            					((StrutsFinalState)target).findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_EXTERNAL_APPLICATION_NAME).toString()
            				+ "/" + 
            				  	modulo
            				  	  +
            				  	link;
            }
        }
        return forwardPath.replaceAll("//", "/");
    }
    
    protected boolean handleIsModuloRedirect(){
    	final StateVertexFacade target = this.getTarget();
    	
    	if (isEnteringFinalState())
        {
    		
    		if(((StrutsFinalState)target).findTaggedValue(UMLProfile.TAGGEDVALUE_EXTERNAL_HYPERLINK) != null)
    			return true;
    		
    		// caso caso de uso alvo n�o esteja no modelo.. considera que N�O � troca de m�dulo
    		if (((StrutsFinalState)target).getTargetUseCase() == null)
    			return false;
    		
            CoppetecFrontEndPackage pacoteAtual = (CoppetecFrontEndPackage)this.getUseCase().getPackage();
            CoppetecFrontEndPackage pacoteDestino = (CoppetecFrontEndPackage)((StrutsFinalState)target).getTargetUseCase().getPackage();
            
            if(!pacoteAtual.getWebModuleName().equals(pacoteDestino.getWebModuleName())){
            		return true;
            }
        }
    	
    	
    	
    	return false;
    }
    
    protected String handleGetTargetContext(){
    	final StateVertexFacade target = this.getTarget();
    	if (isEnteringFinalState())
        {
    		if(((StrutsFinalState)target).findTaggedValue(UMLProfile.TAGGEDVALUE_EXTERNAL_HYPERLINK) != null){
    			String contexto = null;
    			String modulo = null;
    			String tagged = null;
    	
    			if(((StrutsFinalState)target).findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_HYPERLINK_MODULO) != null){
    				contexto = ((CoppetecFrontEndPackage)(getUseCase().getPackage())).getContexto();
    				modulo = ((CoppetecPackageFacade)(getUseCase().getPackage())).getWebModuleName(); 
    				tagged = (String)((StrutsFinalState)target).findTaggedValue(Bpm4StrutsProfile.TAGGEDVALUE_HYPERLINK_MODULO);
    				
					contexto = (String)getConfiguredProperty(CoppetecUMLMetafacadeProperties.CONTEXTO_PRINCIPAL);

					if(!modulo.equals("/"))			
						contexto = contexto + "/" + tagged;
    				
					return contexto.replaceAll("//","/");
    			}
    		}
    			
    		
            CoppetecFrontEndPackage pacoteAtual = (CoppetecFrontEndPackage)this.getUseCase().getPackage();
            CoppetecFrontEndPackage pacoteDestino = (CoppetecFrontEndPackage)((StrutsFinalState)target).getTargetUseCase().getPackage();
            
            if(!pacoteAtual.getWebModuleName().equals(pacoteDestino.getWebModuleName()))
            	return pacoteDestino.getContexto();
            
            return null;
        }
    	else
    		return ((CoppetecStrutsPackage)(getUseCase().getPackage())).getContexto();
 
    }
}