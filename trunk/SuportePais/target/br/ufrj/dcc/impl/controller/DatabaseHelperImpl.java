package br.ufrj.dcc.impl.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import br.ufrj.dcc.api.controller.DatabaseHelper;


public class DatabaseHelperImpl extends SQLiteOpenHelper implements DatabaseHelper{
	
	private String scriptCreate;  
    private String[] scriptsCreate;
    
	public DatabaseHelperImpl(Context context, String dbName,int dbVersion) {
		super(context, dbName,null, dbVersion);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		if (scriptCreate != null)
	   		db.execSQL(scriptCreate); 
	   	if (scriptsCreate != null)
	   	{
			for (int i = 0; i < scriptsCreate.length; i++)
				db.execSQL(scriptsCreate[i]);
	   	}
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		onCreate(db);  		
	}
	
	 public void insertSQL(SQLiteDatabase db, String scriptCreate){
			this.scriptCreate = scriptCreate;
			SQLiteDatabase sqlite = db;
			onUpgrade(sqlite,1,1);
	    }
	    
	    public void insertSQL(SQLiteDatabase db, String[] scriptsCreate){
			this.scriptsCreate = scriptsCreate;  
			SQLiteDatabase sqlite = db;
			onUpgrade(sqlite,1,1);
	    }	 

}
