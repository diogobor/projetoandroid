package br.ufrj.dcc.impl.controller;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import br.ufrj.dcc.api.controller.ConnectionDataBase;
import br.ufrj.dcc.api.controller.ContextDataBase;
import br.ufrj.dcc.impl.ActivityHandler;

public class ContextDataBaseImpl extends SQLiteOpenHelper implements ContextDataBase{

	private String scriptCreate;  
    private String[] scriptsCreate;
  
    public ContextDataBaseImpl(String dbName,int dbVersion) throws Exception {
		super(ActivityHandler.activity, dbName,null, dbVersion);		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		if (scriptCreate != null)
			try {
				db.execSQL(scriptCreate);	
			} catch (Exception e) {
				Log.e("DataBase error: ", e.toString());
				System.exit(0);
			}
	   		 
	   	if (scriptsCreate != null)
	   	{
	   		try {
	   			for (int i = 0; i < scriptsCreate.length; i++)
					db.execSQL(scriptsCreate[i]);	
			} catch (Exception e) {
				Log.e("DataBase error: ", e.toString());
				System.exit(0);
			}
			
	   	}
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		onCreate(db);  		
	}

	public void insertSQL(ConnectionDataBase db, String scriptCreate) {
		this.scriptCreate = scriptCreate;
		SQLiteDatabase sqlite = ((ConnectionDataBaseImpl)db).getConnDataBase();
		onUpgrade(sqlite,1,1);
		
	}

	public void insertSQL(ConnectionDataBase db, String[] scriptsCreate) {
		this.scriptsCreate = scriptsCreate;  
		SQLiteDatabase sqlite = ((ConnectionDataBaseImpl)db).getConnDataBase();
		onUpgrade(sqlite,1,1);
		
	}
}
