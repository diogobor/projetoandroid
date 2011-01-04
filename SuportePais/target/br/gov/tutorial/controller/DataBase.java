package br.gov.tutorial.controller;

import android.content.Context;
import br.ufrj.dcc.api.controller.ConnDataBase;
import br.ufrj.dcc.api.controller.DatabaseHelper;
import br.ufrj.dcc.api.controller.SQLite;
import br.ufrj.dcc.impl.controller.ConnDataBaseImpl;
import br.ufrj.dcc.impl.controller.DatabaseHelperImpl;
import br.ufrj.dcc.impl.controller.SQLiteImpl;

public class DataBase{
	
	private static final String NOME_BANCO = "SuportePaisDB";
	private static final int VERSAO_BANCO = 1;
	private DatabaseHelper dbHelper;
	private ConnDataBase connDB;
	protected static SQLite db;
	
	public DataBase (Context ctx){
		if (dbHelper == null)
		{
			dbHelper = new DatabaseHelperImpl(ctx, NOME_BANCO, VERSAO_BANCO);
		}
		if (db == null) 
		{
			db = new SQLiteImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
		}
	}
	
	public void executeSQL(String sql){
		connDB = new ConnDataBaseImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
		dbHelper.insertSQL(connDB,sql);
		db = new SQLiteImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
	}
}