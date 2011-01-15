package org.andromda.cartridges.android.metafacades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.andromda.metafacades.uml.FrontEndActionState;
import org.andromda.metafacades.uml.ParameterFacade;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidUC.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidUC
 */
public class AndroidUCLogicImpl
    extends AndroidUCLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidUCLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }
    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidUC#getUniqueParameters()
     */
    protected java.util.Collection handleGetUniqueParameters()
    {
    	Collection resultParameters = new ArrayList();
    	List actions = getActions();
    	for(Iterator it =actions.iterator();it.hasNext();){
    		FrontEndActionState state = (FrontEndActionState)it.next();
    		List parameters = state.getForward().getForwardParameters();
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

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidUC#getAndroidInitialState()
     */
    protected java.lang.Object handleGetAndroidInitialState()
    {
        // TODO: add your implementation here!
        return null;
    }

    /**
     * @see org.andromda.cartridges.android.metafacades.AndroidUC#getUcController()
     */
    protected java.lang.Object handleGetUcController()
    {
        // TODO: add your implementation here!
        return null;
    }

}