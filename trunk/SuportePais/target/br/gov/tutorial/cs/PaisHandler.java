package br.gov.tutorial.cs;

import java.util.Collection;

import br.gov.tutorial.ActivityHandler;
import br.gov.tutorial.cd.PaisDAO;
import br.gov.tutorial.cd.PaisDAOImpl;
import br.gov.tutorial.vo.PaisVO;

public abstract class PaisHandler {
	protected PaisDAO paisDao = null;
	
	public PaisHandler(){
		if (paisDao == null)
			paisDao = new PaisDAOImpl(ActivityHandler.atividade);
	}
	
	protected abstract Collection handleFilter(PaisVO paisVO);
	protected abstract void handleInsert(PaisVO paisVO);
	protected abstract void handleExcluir(PaisVO paisVO);
	protected abstract void handleAtualizar(PaisVO paisVO);
	
	public void Filter(PaisVO paisVO){
		
		handleFilter(paisVO);
		
		
	}
	public void Insert(PaisVO paisVO){
		handleInsert(paisVO);
	}
	public void Excluir(PaisVO paisVO){
		handleExcluir(paisVO);
	}
	public void Atualizar(PaisVO paisVO){
		handleAtualizar(paisVO);
	}
}
