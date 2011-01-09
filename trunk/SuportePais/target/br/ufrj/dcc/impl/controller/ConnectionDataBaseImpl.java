package br.ufrj.dcc.impl.controller;

import br.ufrj.dcc.api.controller.ConnectionDataBase;

public class ConnectionDataBaseImpl implements ConnectionDataBase{
	
	private android.database.sqlite.SQLiteDatabase db;
    
    public ConnectionDataBaseImpl (android.database.sqlite.SQLiteDatabase database){
            this.db = database;
    }
    
    public android.database.sqlite.SQLiteDatabase getConnDataBase(){
            return this.db;
    }

	
}
