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
	
	public abstract Collection handleFilter(PaisVO paisVO);
	public abstract void handleInsert(PaisVO paisVO);
	public abstract void handleExcluir(PaisVO paisVO);
	public abstract void handleAtualizar(PaisVO paisVO);
}
