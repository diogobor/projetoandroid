package org.andromda.cartridges.android.metafacades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.andromda.metafacades.uml.FrontEndAction;
import org.andromda.metafacades.uml.FrontEndForward;
import org.andromda.metafacades.uml.ParameterFacade;


/**
 * MetafacadeLogic implementation for org.andromda.cartridges.android.metafacades.AndroidPage.
 *
 * @see org.andromda.cartridges.android.metafacades.AndroidPage
 */
public class AndroidPageLogicImpl
    extends AndroidPageLogic
{

        public String insertModuleNameIntoOutlet(String outlet){
		return outlet;
    }
    
    public AndroidPageLogicImpl (Object metaObject, String context)
    {
        super (metaObject, context);
    }


	public String getName() {
		return super.getName().replace(" ", "");
	}

	protected Collection handleGetAtributosTabela() {
		Collection resultado = new ArrayList();
		Collection params = getIncomingParameter();
		for(Iterator it = params.iterator();it.hasNext();){
			ParameterFacade param = (ParameterFacade)it.next();
			String tag = (String)param.findTaggedValue("@andromda.presentation.view.table.columns");
			String[]elementos = tag.split(",");
			for(int i=0;i<elementos.length;i++){
				resultado.add(elementos[i]);
			}
		}
		
		return resultado;
	}

	protected Collection handleGetIncomingParameter() {
		Collection resultado = new ArrayList();
		Collection col= getIncoming();
		for(Iterator it = col.iterator();it.hasNext();){
			FrontEndForward forw  = (FrontEndForward)it.next();
			resultado.addAll(forw.getForwardParameters());
		}
		return resultado;
	}

	
	protected Collection handleGetButtons() {
		Collection resultado = new ArrayList();
		Collection col= getOutgoing();
		for(Iterator it = col.iterator();it.hasNext();){
			FrontEndForward forw  = (FrontEndForward)it.next();
			if(forw.isTriggerPresent()){
				resultado.add(forw.getTrigger().getName());
			}
		}
		return resultado;
	}
}