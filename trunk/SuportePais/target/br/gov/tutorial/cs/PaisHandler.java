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
		db.beginTransaction();
		handleInsert(paisVO);
		db.setTransactionSuccessful();
		db.endTransaction();
	}
	public void Excluir(PaisVO paisVO){
		db.beginTransaction();
		handleExcluir(paisVO);
		db.setTransactionSuccessful();
		db.endTransaction();
	}
	public void Atualizar(PaisVO paisVO){
		db.beginTransaction();
		handleAtualizar(paisVO);
		db.setTransactionSuccessful();
		db.endTransaction();
	}
}
