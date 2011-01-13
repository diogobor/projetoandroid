package br.ufrj.dcc.impl.controller;

import br.ufrj.dcc.api.controller.ConnectionDataBase;

public class ConnectionDataBaseImpl implements ConnectionDataBase{
	
	private android.database.sqlite.SQLiteDatabase db;
    
	public ConnectionDataBaseImpl(br.ufrj.dcc.impl.controller.ContextDataBaseImpl context ) throws Exception{
            this.db = context.getWritableDatabase();
    }
    public android.database.sqlite.SQLiteDatabase getConnDataBase(){
            return this.db;
    }

	
}
