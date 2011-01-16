package org.andromda.cartridges.android.metafacades;

import java.util.List;

import org.andromda.metafacades.uml.FinalStateFacade;
import org.andromda.metafacades.uml.FrontEndActionState;
import org.andromda.metafacades.uml.OperationFacade;
import org.andromda.metafacades.uml.TransitionFacade;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidTrigger.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidTrigger
 */
public class AndroidTriggerLogicImpl
    extends AndroidTriggerLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidTriggerLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidTrigger#getNomeAcao()
     */
    protected java.lang.String handleGetNomeAcao()
    {
        if(getTransition().getTarget() instanceof FrontEndActionState){
        	FrontEndActionState feas = (FrontEndActionState)getTransition().getTarget();
        	List lista = feas.getControllerCalls();
        	if (lista!=null){
        		return ((OperationFacade)lista.get(0)).getName();
        	}
        }
        return "";
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidTrigger#getNextPageName()
     */
    protected java.lang.String handleGetNextPageName()
    {
    	return buscaPagina(this.getTransition());
    }
    private String buscaPagina(TransitionFacade tr){
    	if(tr.getTarget() instanceof AndroidPage){
    		AndroidPage page = (AndroidPage)tr.getTarget();
    		return page.getName();
    	}else{
    		if(tr.getTarget() instanceof FrontEndActionState){
    			FrontEndActionState feas = (FrontEndActionState)tr.getTarget();
    			return buscaPagina((TransitionFacade)feas.getOutgoing().iterator().next());
    		}else{
    			if(tr.getTarget() instanceof FinalStateFacade){
    				FinalStateFacade finalState = (FinalStateFacade)tr.getTarget();
    				return ((AndroidUC)getModel().findUseCaseByName(finalState.getName())).getFirstPage().getName();
    			}
    		}
    	}
        return "";
    }

}