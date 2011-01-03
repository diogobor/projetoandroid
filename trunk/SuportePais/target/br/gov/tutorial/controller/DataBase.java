package br.gov.tutorial.controller;

import br.ufrj.dcc.api.controller.DatabaseHelper;
import br.ufrj.dcc.api.controller.SQLite;
import br.ufrj.dcc.impl.controller.DatabaseHelperImpl;
import android.content.Context;

public class DataBase {
	
	private static final String NOME_BANCO = "SuportePaisDB";
	private static final int VERSAO_BANCO = 1;
	protected static SQLite db;
	DatabaseHelper dbHelper;
	
	public DataBase (Context ctx){  
		dbHelper = (DatabaseHelper) new DatabaseHelperImpl(ctx, NOME_BANCO, VERSAO_BANCO);
		db = dbHelper.getWritableDb();
	}
	
	public void executeSQL(String sql){
		dbHelper.insertSQL(db,sql);
		db = dbHelper.getWritableDb();
	}
}
