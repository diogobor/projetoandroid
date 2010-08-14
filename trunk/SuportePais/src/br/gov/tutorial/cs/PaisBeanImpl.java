package br.gov.tutorial.cs;

import java.util.Collection;

import br.gov.tutorial.cd.Pais;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisForm;

public class PaisBeanImpl extends PaisBean{

	@Override
	public Collection handleFilter(ConsultaPaisForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleInsert(ConsultaPaisForm form) {
		
		Pais pais = new Pais();
		pais.setCodigo(form.getCodigo());
		pais.setCodigoAuxiliar(form.getCodigoAuxiliar());
		pais.setDescricao(form.getDescricao());
		pais.setValor(form.getValor());
		
		dao.inserir(pais);
		
	}



}
