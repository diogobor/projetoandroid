package br.gov.tutorial.cs;

import java.util.Collection;
import java.util.List;

import br.gov.tutorial.cd.Pais;
import br.gov.tutorial.cd.PaisImpl;
import br.gov.tutorial.vo.PaisVO;

public class PaisHandlerImpl extends PaisHandler{

	@Override
	public Collection handleFilter(PaisVO paisVO) {
		//Passar o pais vo para o buscar pais
		List listaPais = paisDao.buscarPais(paisVO);
		return listaPais;
	}

	@Override
	public void handleInsert(PaisVO paisVO) {
		
		Pais pais = new PaisImpl();
		pais.setCodigo(paisVO.getCodigo());
		pais.setCodigoAuxiliar(paisVO.getCodigoAuxiliar());
		pais.setDescricao(paisVO.getDescricao());
		pais.setValor(paisVO.getValor());
		
		paisDao.inserir(pais);
		
	}



}
