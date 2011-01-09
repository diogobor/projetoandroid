package br.ufrj.dcc.impl.controller;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import br.ufrj.dcc.api.controller.ConnectionDataBase;
import br.ufrj.dcc.api.controller.ContextDataBase;

public class ContextDataBaseImpl extends SQLiteOpenHelper implements ContextDataBase{

	private String scriptCreate;  
    private String[] scriptsCreate;
    
    public ContextDataBaseImpl(android.content.Context activity, String dbName,int dbVersion) {
		super(activity, dbName,null, dbVersion);		
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
