package br.gov.tutorial.controller;

import br.gov.tutorial.SQLiteHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DataBase {
	
	private static final String NOME_BANCO = "SuportePaisDB";
	private static final int VERSAO_BANCO = 1;
	SQLiteDatabase db;
	SQLiteHelper dbHelper;
	
	public DataBase (Context ctx){  
		dbHelper = new SQLiteHelper(ctx, NOME_BANCO, VERSAO_BANCO);
		db = dbHelper.getWritableDatabase();
	}
	
	public void executeSQL(String sql){
		dbHelper.insertSQL(sql,null);
		dbHelper.onUpgrade(db, 1, 1);
		db = dbHelper.getWritableDatabase();
	}
}
