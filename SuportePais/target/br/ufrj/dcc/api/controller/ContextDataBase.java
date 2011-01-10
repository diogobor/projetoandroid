package br.ufrj.dcc.api.controller;

public interface ContextDataBase {
	 public void insertSQL(ConnectionDataBase db, String scriptCreate);  
	 public void insertSQL(ConnectionDataBase db, String[] scriptsCreate);
	 
}
