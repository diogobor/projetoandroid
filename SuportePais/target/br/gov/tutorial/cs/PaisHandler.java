package br.gov.tutorial.cs;

import java.util.Collection;
import java.util.List;

import br.gov.tutorial.cd.PaisDAO;
import br.gov.tutorial.cd.PaisDAOImpl;
import br.gov.tutorial.controller.DataBase;
import br.gov.tutorial.vo.PaisVO;

public abstract class PaisHandler extends DataBase{
	protected PaisDAO paisDao = null;
	
	protected abstract Collection handleFilter(PaisVO paisVO);
	protected abstract void handleInsert(PaisVO paisVO);
	protected abstract void handleDelete(PaisVO paisVO);
	protected abstract void handleUpdate(PaisVO paisVO);
	
	public PaisHandler(){
		if (paisDao == null)
			paisDao = new PaisDAOImpl();
	}	
	public Collection Filter(PaisVO paisVO){	
		List listaPais = (List) handleFilter(paisVO);
		return listaPais;
	}
	public void Insert(PaisVO paisVO){
		db.beginTransaction();
		try {
			handleInsert(paisVO);
			db.setTransactionSuccessful();
		} catch (Exception e) {
			System.out.println("Transaction Error: " + e.toString());
		} finally {
			db.endTransaction();
		}		
	}
	public void Delete(PaisVO paisVO){
		db.beginTransaction();
		try {
			handleDelete(paisVO);
			db.setTransactionSuccessful();
		} catch (Exception e) {
			System.out.println("Transaction Error: " + e.toString());
		} finally {
			db.endTransaction();
		}
	}
	public void Update(PaisVO paisVO){
		db.beginTransaction();
		try {
			handleUpdate(paisVO);
			db.setTransactionSuccessful();
		} catch (Exception e) {
			System.out.println("Transaction Error: " + e.toString());
		} finally {
			db.endTransaction();
		}
	}
}
