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
		recuperaPais(new DetalhaPaisUCForm());
		posInit();
	}
	protected void preInit(){
	}
	protected void posInit(){
	}
	public abstract void recuperaPais(DetalhaPaisUCForm form);
}
