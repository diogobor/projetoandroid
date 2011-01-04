package br.ufrj.dcc.api.controller;

public interface DatabaseHelper {
	 public void insertSQL(android.database.sqlite.SQLiteDatabase db, String scriptCreate);
	    
	 public void insertSQL(android.database.sqlite.SQLiteDatabase db, String[] scriptsCreate);
	 
}
