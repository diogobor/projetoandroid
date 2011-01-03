package br.gov.tutorial.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DataBase {
	
	private static final String NOME_BANCO = "SuportePaisDB";
	private static final int VERSAO_BANCO = 1;
	protected static SQLiteDatabase db;
	SQLiteHelper dbHelper;
	
	public DataBase (Context ctx){  
		dbHelper = new SQLiteHelper(ctx, NOME_BANCO, VERSAO_BANCO);
		db = dbHelper.getWritableDatabase();
	}
	
	public void executeSQL(String sql){
		dbHelper.insertSQL(db,sql);
		db = dbHelper.getWritableDatabase();
	}
}
