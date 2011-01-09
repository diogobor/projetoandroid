package br.gov.tutorial.view.cadastroPais.detalhaPais;

import br.gov.tutorial.R;
import br.gov.tutorial.view.cadastroPais.detalhaPais.form.DetalhaPaisUCForm;
import br.ufrj.dcc.api.view.ActionCommander;
import br.ufrj.dcc.api.view.PageFacade;
import br.ufrj.dcc.impl.view.PageFacadeImpl;

public abstract class DetalhaPaisControle {
	private ActionCommander btnNovaConsulta = new ActionCommander(){
		public void action() {
			PageFacade page = new PageFacadeImpl();
			page.changePage(String.valueOf(R.layout.preenchaosdadosdaconsultadepais_consultarpais));
		}
		
	};

	public void iniciar(){
		preInit();
		PageFacade page = new PageFacadeImpl();
		page.changePage(String.valueOf(R.layout.detalhamentodopais_detalhapais));
		page.getButton(String.valueOf(R.id.novaconsulta)).setAction(btnNovaConsulta);
		DetalhaPaisUCForm form =new DetalhaPaisUCForm();
		recuperaPais(form);
		page.setLabel(String.valueOf(R.id.codigo), form.getCodigo());
		page.setLabel(String.valueOf(R.id.codigoAuxiliar), form.getCodigoAuxiliar());
		page.setLabel(String.valueOf(R.id.descricao), form.getDescricao());
		page.setLabel(String.valueOf(R.id.valor), form.getValor());
		posInit();
	}
	protected void preInit(){
	}
	protected void posInit(){
	}
	public abstract void recuperaPais(DetalhaPaisUCForm form);
}
