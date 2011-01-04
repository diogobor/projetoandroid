package br.ufrj.dcc.api.controller;

public interface DatabaseHelper {
	 public void insertSQL(ConnDataBase db, String scriptCreate);  
	 public void insertSQL(ConnDataBase db, String[] scriptsCreate);
	 
}
