package br.gov.tutorial.cs;

import java.util.Collection;
import java.util.List;

import br.gov.tutorial.cd.Pais;
import br.gov.tutorial.cd.PaisImpl;
import br.gov.tutorial.vo.PaisVO;

public class PaisHandlerImpl extends PaisHandler{

	public PaisHandlerImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection handleFilter(PaisVO paisVO) {
		
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
	public void handleExcluir(PaisVO paisVO)
	{
		paisDao.excluir(paisVO.getId());
	}

	public void handleAtualizar(PaisVO paisVO)
	{
		Pais pais = new PaisImpl();
		pais.setCodigo(paisVO.getCodigo());
		pais.setCodigoAuxiliar(paisVO.getCodigoAuxiliar());
		pais.setDescricao(paisVO.getDescricao());
		pais.setValor(paisVO.getValor());
		
		paisDao.atualizar(pais);
	}


}
