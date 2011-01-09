package br.gov.tutorial.view.cadastroPais.detalhaPais;


import br.gov.tutorial.cd.Pais;
import br.gov.tutorial.view.cadastroPais.detalhaPais.form.DetalhaPaisUCForm;
import br.ufrj.dcc.api.view.PageFacade;
import br.ufrj.dcc.impl.view.SessionImpl;

public class DetalhaPaisControleImpl extends DetalhaPaisControle{

	@Override
	public void recuperaPais(DetalhaPaisUCForm form) {
		Pais pais = (Pais)SessionImpl.instance().get(PageFacade.TABLE_ACTION_KEY);
		form.setCodigo(pais.getCodigo());
		form.setCodigoAuxiliar(pais.getCodigoAuxiliar());
		form.setDescricao(pais.getDescricao());
		form.setValor(pais.getValor());
	}

}
