package org.andromda.metafacades.uml14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.andromda.core.metafacade.MetafacadeBase;
import org.andromda.metafacades.uml.CoppetecPackageFacade;
import org.andromda.metafacades.uml.CoppetecUMLMetafacadeProperties;
import org.andromda.metafacades.uml.FinalStateFacade;
import org.andromda.metafacades.uml.FrontEndActionState;
import org.andromda.metafacades.uml.FrontEndUseCase;
import org.andromda.metafacades.uml.ModelElementFacade;
import org.andromda.metafacades.uml.PackageFacade;
import org.andromda.metafacades.uml.StateVertexFacade;
import org.andromda.metafacades.uml.TransitionFacade;
import org.andromda.metafacades.uml.UMLProfile;
import org.apache.commons.lang.StringUtils;


/**
 * MetafacadeLogic implementation for org.andromda.metafacades.uml.CoppetecPackageFacade.
 *
 * @see org.andromda.metafacades.uml.CoppetecPackageFacade
 */
public class CoppetecPackageFacadeLogicImpl
    extends CoppetecPackageFacadeLogic
{

    public CoppetecPackageFacadeLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
    
    
    /**
     * @see org.andromda.metafacades.uml.CoppetecPackageFacade#getServiceModuleName()
     */
    protected String handleGetServiceModuleName()
    {
        for(ModelElementFacade packageFacade = this; packageFacade != null; packageFacade = packageFacade.getPackage()){
        	if(packageFacade.hasStereotype(UMLProfile.STEREOTYPE_MODULO_SERVICO)){
        		return packageFacade.getName();
        	}
        }
        
       return "";
    }

    /**
     * @see org.andromda.metafacades.uml.CoppetecPackageFacade#getWebModuleName()
     */
    protected String handleGetWebModuleName()
    {
        for(ModelElementFacade packageFacade = this; packageFacade != null; packageFacade = packageFacade.getPackage()){
        	if(packageFacade.hasStereotype(UMLProfile.STEREOTYPE_MODULO_WEB) || packageFacade.hasStereotype(UMLProfile.STEREOTYPE_MODULO_WEB_PAI)){
        		return packageFacade.getName();
        	}
        }
        
       return "";
    }
    
    protected  java.lang.String handleReplaceOutletWithWebModuleName(java.lang.String outlet){
    	String modulo = getConfiguredProperty(CoppetecUMLMetafacadeProperties.OUTLET_REPLACE_MODULO).toString();
    	return StringUtils.replace(outlet, modulo,getWebModuleName());
    }
    
    protected  java.lang.String handleReplaceOutletWithServiceModuleName(java.lang.String outlet){
    	String modulo = getConfiguredProperty(CoppetecUMLMetafacadeProperties.OUTLET_REPLACE_MODULO).toString();
    	return StringUtils.replace(outlet, modulo,getServiceModuleName());
    }
    
    public java.util.Collection handleGetMessageDrivenBeans(){
    	Collection col = getElementsByStereotype("MessageDrivenBean");
    	if(!col.isEmpty() && ((MetafacadeBase)col.iterator().next()).getComparatorObject() != null)
    		Collections.sort((List)col, ((MetafacadeBase)col.iterator().next()).getComparatorObject());
    	return col;
    }

    public java.util.Collection handleGetSessions(){
    	Collection col =  getElementsByStereotype(UMLProfile.STEREOTYPE_SERVICE);
    	if(!col.isEmpty() && ((MetafacadeBase)col.iterator().next()).getComparatorObject() != null)
    		Collections.sort((List)col, ((MetafacadeBase)col.iterator().next()).getComparatorObject());
    	return col;
    }
    
    protected java.lang.Boolean handleGetWebServiceModule(){
    	Boolean webService = Boolean.FALSE;
    	
    	Iterator it = getOwnedElements().iterator();
    	
    	while (it.hasNext()){
    		ModelElementFacade element = (ModelElementFacade)it.next();
    		
    		if(element instanceof CoppetecPackageFacade){
    			CoppetecPackageFacade pacote = (CoppetecPackageFacade) element;
    			webService = Boolean.valueOf(webService.booleanValue() || pacote.getWebServiceModule().booleanValue());
    		}
    		else if((element.hasStereotype(UMLProfile.STEREOTYPE_WEBSRV))||(element.hasStereotype(UMLProfile.STEREOTYPE_WEBSRV_CLIENT))){
    			webService = Boolean.TRUE;
    		}
    	}
    	
    	return webService;
    }
    
    public java.util.Collection handleGetWebServices(){
    	Collection col = getElementsByStereotype(UMLProfile.STEREOTYPE_WEBSRV);
		if(!col.isEmpty() && ((MetafacadeBase)col.iterator().next()).getComparatorObject() != null)
    		Collections.sort((List)col, ((MetafacadeBase)col.iterator().next()).getComparatorObject());
    	return col;
    }

	protected Collection handleGetUseCases() {
		Collection col = getElementsByStereotype(UMLProfile.STEREOTYPE_FRONT_END_USECASE);
		if(!col.isEmpty() && ((MetafacadeBase)col.iterator().next()).getComparatorObject() != null)
    		Collections.sort((List)col, ((MetafacadeBase)col.iterator().next()).getComparatorObject());
    	return col;
	}
    
	protected Collection handleGetManageables() {
		String manageableStereotypes[] = new String[2];
		manageableStereotypes[0] = UMLProfile.STEREOTYPE_ENTITY;
		manageableStereotypes[1] = UMLProfile.STEREOTYPE_MANAGEABLE;
		return getElementsByStereotypes(manageableStereotypes);
	}


	/**
	 * Retorna os elementos dentro do pacote que possuem o estere�tipo passado como par�metro
	 */
	private Collection getElementsByStereotype(String stereotype)
	{
		String stereotypeArray[] = new String[1];
		stereotypeArray[0] = stereotype;
		return getElementsByStereotypes(stereotypeArray); 
	}
	
	
	/**
	 * Retorna os elementos dentro do pacote que possuem os estere�tipos passados como par�metro
	 */
	private Collection getElementsByStereotypes(String[] stereotypes)
	{
		List result = new ArrayList();
    	
    	Iterator it = getOwnedElements().iterator();
    	
    	while (it.hasNext()){
    		ModelElementFacade element = (ModelElementFacade)it.next();
    		
    		if (element instanceof CoppetecPackageFacadeLogicImpl){
    			CoppetecPackageFacadeLogicImpl pacote = (CoppetecPackageFacadeLogicImpl) element;
    			result.addAll(pacote.getElementsByStereotypes(stereotypes));
    		}
    		else
    		{
    			boolean checkStereotypes = true;
    			for (int i=0; i< stereotypes.length; i++)
    			{
    				if (!element.hasStereotype(stereotypes[i])) {
    						checkStereotypes = false;
    						break;
    				}
    			}
    			
    			if (checkStereotypes)
    				result.add(element);
    		}
    	}
    	
    	return result;
	}


	protected Collection handleGetFinalStates() {
		
		Collection processedTransitions = new ArrayList();
		Set finalStates = new HashSet();
    	
    	Iterator it = getUseCases().iterator();
    
    	while(it.hasNext()){
    		
    		FrontEndUseCase useCase = (FrontEndUseCase)it.next();
    		
    		Iterator actions = useCase.getActions().iterator();
    		
    		while(actions.hasNext()){
    			TransitionFacade transition = (TransitionFacade)actions.next();
    			collectTransitions(transition, processedTransitions, finalStates);
    		}
    	}
    	
    	List result = new ArrayList(finalStates);
    	
    	if(!result.isEmpty() && ((MetafacadeBase)result.iterator().next()).getComparatorObject() != null)
    		Collections.sort((List)result, ((MetafacadeBase)result.iterator().next()).getComparatorObject());
    	
    	return result;
	}


	private void collectTransitions(TransitionFacade transition, Collection processedTransitions, Set finalStates){
		if (transition == null || processedTransitions.contains(transition)){
			return;
		}
		
		processedTransitions.add(transition);

		final StateVertexFacade target = transition.getTarget();
		if (target instanceof FinalStateFacade){
			finalStates.add(transition.getTarget());
		}else{
			if(target instanceof FrontEndActionState){
				TransitionFacade trans = ((FrontEndActionState)target).getForward();
				collectTransitions(trans, processedTransitions,finalStates);
			}else{
				final Collection outcomes = target.getIncoming();
				for (final Iterator iterator = outcomes.iterator(); iterator.hasNext();){
					final TransitionFacade outcome = (TransitionFacade) iterator.next();
					collectTransitions(outcome, processedTransitions,finalStates);
				}
			}
		}
	}


	protected String handleGetMoreSpecificPackageName() {
		StringTokenizer st = new StringTokenizer(this.getFullyQualifiedName(), ".");
		StringBuffer sb = new StringBuffer();
		String[] tokens = new String[st.countTokens()];
		
		int position = st.countTokens() - 1;
		
		while(st.hasMoreTokens()){
			tokens[position--] = st.nextToken();
		}
		
		for(int i = 0;i < tokens.length;i++){
			String point = "";
			if(i != tokens.length -1) point = ".";
			sb.append(tokens[i] + point);
		}
		return  sb.toString();
	}
}