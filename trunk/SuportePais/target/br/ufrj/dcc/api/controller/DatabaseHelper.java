package br.ufrj.dcc.api.controller;


public interface DatabaseHelper {
	 public void insertSQL(SQLite db, String scriptCreate);
	    
	 public void insertSQL(SQLite db, String[] scriptsCreate);
	 
	 public SQLite getWritableDb();
	 
}
