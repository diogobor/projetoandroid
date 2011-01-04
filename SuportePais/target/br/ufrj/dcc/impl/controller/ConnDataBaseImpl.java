package br.ufrj.dcc.impl.controller;

import android.database.sqlite.SQLiteDatabase;
import br.ufrj.dcc.api.controller.ConnDataBase;

public class ConnDataBaseImpl implements ConnDataBase{
	
	private SQLiteDatabase database;
	
	public ConnDataBaseImpl (SQLiteDatabase database){
		this.database = database;
	}
	
	public SQLiteDatabase getConnDataBase(){
		return this.database;
	}
}
