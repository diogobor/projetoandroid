package br.ufrj.dcc.impl.controller;

import android.database.sqlite.SQLiteDatabase;
import br.ufrj.dcc.api.controller.ConnDataBase;

public class ConnDataBaseImpl implements ConnDataBase{
	
	private android.database.sqlite.SQLiteDatabase db;
	
	public ConnDataBaseImpl (SQLiteDatabase database){
		this.db = database;
	}
	
	public SQLiteDatabase getConnDataBase(){
		return this.db;
	}
	
}
