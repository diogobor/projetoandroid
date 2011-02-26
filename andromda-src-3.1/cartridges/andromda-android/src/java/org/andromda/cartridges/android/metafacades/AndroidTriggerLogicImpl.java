package org.andromda.cartridges.android.metafacades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.andromda.metafacades.uml.FinalStateFacade;
import org.andromda.metafacades.uml.FrontEndActionState;
import org.andromda.metafacades.uml.OperationFacade;
import org.andromda.metafacades.uml.ParameterFacade;
import org.andromda.metafacades.uml.StateVertexFacade;
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
        	if (lista!=null && !lista.isEmpty()){
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

	protected ParameterFacade handleGetColecaoResultado() {
		
		if(getTransition().getTarget() instanceof FrontEndActionState){
        	FrontEndActionState feas = (FrontEndActionState)getTransition().getTarget();
			if(feas.getControllerCalls()!=null && !feas.getControllerCalls().isEmpty()){
				Collection out = feas.getOutgoing();
				if(out!=null && !out.isEmpty()){
					List parametros = feas.getForward().getForwardParameters();
					if(parametros!=null && !parametros.isEmpty()){
						for(Iterator it = parametros.iterator();it.hasNext();){
							ParameterFacade param = ((ParameterFacade)it.next());
							if(param.getType().getName().equals("Collection")){
								return param;
							}
						}
					}
				}
			}
		}
		return null;
	}

	protected boolean handleIsTemColecaoResultado() {
		
		return handleGetColecaoResultado()!=null;
	}

	protected Collection handleGetSinaisColecao() {
		Collection resultado = new ArrayList();
		StateVertexFacade svf = getTransition().getTarget();
		if(svf instanceof FrontEndActionState){
			FrontEndActionState feas = (FrontEndActionState)svf;
			Collection transicoes = feas.getOutgoing();
			for(Iterator it = transicoes.iterator();it.hasNext();){
				TransitionFacade transicao = (TransitionFacade)it.next();
				if(transicao.isTriggerPresent()){
					if(transicao.findTaggedValue("@andromda.presentation.web.action.type")!=null
							&& transicao.findTaggedValue("@andromda.presentation.web.action.type").equals("form")){
						resultado.add(transicao);
					}
				}
			}
		}
		return resultado;
	}

	protected AndroidUC handleGetTargetUseCase() {
		if(getTransition().getTarget() instanceof FinalStateFacade){
			return ((AndroidUC)getModel().findUseCaseByName(getTransition().getTarget().getName()));
		}
		return null;
	}

	protected Collection handleGetParametrosCollection() {
		Collection col = this.getParameters();
		Collection resultado = new ArrayList();
		for (Iterator iterator = col.iterator(); iterator.hasNext();) {
			ParameterFacade param = (ParameterFacade)iterator.next();
			if(param.getType().getName().equals("Collection")){
				resultado.add(param);
			}
			
		}
		return resultado;
	}

	protected Integer handleGetTamanhoParametrosCollection() {
		return new Integer(handleGetParametrosCollection().size());
	}

	protected ParameterFacade handleGetColecao() {
		Collection parametros = getParameters();
		if(parametros!=null && !parametros.isEmpty()){
			for(Iterator it = parametros.iterator();it.hasNext();){
				ParameterFacade param = ((ParameterFacade)it.next());
				if(param.getType().getName().equals("Collection")){
					return param;
				}
			}
		}
		return null;
	}
	protected java.util.Collection handleGetAtributosExibidos(){
		Collection retorno = new ArrayList();
		String tag = (String)getColecao().findTaggedValue("@andromda.presentation.view.table.columns");
		String[]elementos = tag.split(",");
		for(int i=0;i<elementos.length;i++){
			retorno.add(elementos[i]);
		}
		return retorno;
	}

}