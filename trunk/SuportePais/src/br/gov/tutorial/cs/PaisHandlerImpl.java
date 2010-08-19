package br.gov.tutorial.cs;

import java.util.Collection;
import java.util.List;

import br.gov.tutorial.cd.Pais;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisForm;
import br.gov.tutorial.vo.PaisVO;

public class PaisHandlerImpl extends PaisHandler{

	@Override
	public Collection handleFilter(ConsultaPaisForm form) {
		PaisVO paisvo = new PaisVO();
		paisvo.setCodigo(form.getCodigo());
		paisvo.setCodigoAuxiliar(form.getCodigoAuxiliar());
		paisvo.setDescricao(form.getDescricao());
		paisvo.setValor(form.getValor());
		//Passar o pais vo para o buscar pais
		List listaPais = dao.buscarPais("");
		return listaPais;
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
