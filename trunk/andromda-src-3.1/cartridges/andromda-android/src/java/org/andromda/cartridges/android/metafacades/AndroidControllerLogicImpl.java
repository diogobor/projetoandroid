package org.andromda.cartridges.android.metafacades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.andromda.metafacades.uml.FinalStateFacade;
import org.andromda.metafacades.uml.FrontEndAction;
import org.andromda.metafacades.uml.FrontEndUseCase;
import org.andromda.metafacades.uml.ParameterFacade;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidController.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidController
 */
public class AndroidControllerLogicImpl
    extends AndroidControllerLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidControllerLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidController#getFullPath()
     */
    protected java.lang.String handleGetFullPath()
    {
        return getFullyQualifiedName().replace(".", "/");
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidController#getDependencies()
     */
    protected java.lang.String[] handleGetDependencies()
    {
    	Set  resultado = new HashSet();
    	
    	List actions = getUseCase().getActions();
    	for(Iterator it =actions.iterator();it.hasNext();){
    		FrontEndAction state = (FrontEndAction)it.next();
    		List parameters = state.getForwardParameters();
    		for(Iterator it2 =parameters.iterator();it2.hasNext();){
    			ParameterFacade param = (ParameterFacade)it2.next();
    			if(!param.getType().getFullyQualifiedName().startsWith("java.lang")){
    				resultado.add(param.getType().getFullyQualifiedName());
    			}
    			
    		}
    	}
    	String[]retorno = new String[resultado.size()];
    	int i=0;
    	for(Iterator it =resultado.iterator();it.hasNext();i++){
    		retorno[i]=(String)it.next();
    	}
        return retorno;
    }
    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidController#getUc()
     */
    protected java.lang.Object handleGetUc()
    {

        // TODO: add your implementation here!
        return null;
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidController#getOperation()
     */
    protected java.util.Collection handleGetOperation()
    {
        // TODO: add your implementation here!
        return null;
    }
    protected java.util.Collection handleGetUniqueUCParameters()
    {

		Collection resultParameters = new ArrayList();
    	List actions = getUseCase().getActions();

    	for(Iterator it =actions.iterator();it.hasNext();){
    		FrontEndAction state = (FrontEndAction)it.next();
    		List parameters = state.getForwardParameters();
    		for(Iterator it2 =parameters.iterator();it2.hasNext();){
    			boolean adicionar = true;
    			ParameterFacade param = (ParameterFacade)it2.next();

    			for(Iterator it3 = resultParameters.iterator();it3.hasNext();){
    				if(param.getFullyQualifiedName().equals(((ParameterFacade)it3.next()).getFullyQualifiedName())){
    					adicionar=false;
    					break;
    				}
    			}
    			if(adicionar){
    				resultParameters.add(param);
    			}
    			
    		}
    	}
        return resultParameters;
    	
    }

	protected Collection handleGetControllerTransitions() {
		Collection resultado = new ArrayList();
		Collection col  = getUseCase().getActivityGraph().getFinalStates();
    	for(Iterator it = col.iterator();it.hasNext();){
    		
    		resultado.add(((FrontEndUseCase)getModel().findUseCaseByName(((FinalStateFacade)it.next()).getName())).getController());
    	}
		return resultado;
	}

}