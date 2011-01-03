package br.ufrj.dcc.impl.controller;

import br.ufrj.dcc.api.controller.SQLite;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelperImpl extends SQLiteOpenHelper{
	
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
	
	 public void insertSQL(SQLite db, String scriptCreate){
			this.scriptCreate = scriptCreate;
			SQLiteDatabase sqlite = (SQLiteDatabase) db;
			onUpgrade(sqlite,1,1);
	    }
	    
	    public void insertSQL(SQLite db, String[] scriptsCreate){
			this.scriptsCreate = scriptsCreate;  
			SQLiteDatabase sqlite = (SQLiteDatabase) db;
			onUpgrade(sqlite,1,1);
	    }
	    
	    public SQLite getWritableDb(){
	    	return (SQLite) this.getWritableDatabase();
	    }
	 

}
