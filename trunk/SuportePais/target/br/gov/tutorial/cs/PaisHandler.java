package br.gov.tutorial.cs;

import java.util.Collection;
import java.util.List;

import android.content.Context;
import br.gov.tutorial.cd.PaisDAO;
import br.gov.tutorial.cd.PaisDAOImpl;
import br.gov.tutorial.controller.DataBase;
import br.gov.tutorial.vo.PaisVO;
import br.ufrj.dcc.impl.ActivityHandler;

public abstract class PaisHandler extends DataBase{
	protected PaisDAO paisDao = null;
	
	public PaisHandler(Context ctx){
		super(ctx);
		if (paisDao == null)
			paisDao = new PaisDAOImpl(ActivityHandler.activity);
	}
	
	protected abstract Collection handleFilter(PaisVO paisVO);
	protected abstract void handleInsert(PaisVO paisVO);
	protected abstract void handleExcluir(PaisVO paisVO);
	protected abstract void handleAtualizar(PaisVO paisVO);
	
	public Collection Filter(PaisVO paisVO){
		
		List listaPais = (List) handleFilter(paisVO);
		
		return listaPais;
		
		
		
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
