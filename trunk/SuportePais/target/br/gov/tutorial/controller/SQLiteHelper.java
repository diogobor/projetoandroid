package br.gov.tutorial.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {  
	private String scriptCreate;  
    private String scriptDelete;
    private String[] scriptsCreate;
  
    public SQLiteHelper(Context ctx, String nomeBd, int versaoBanco) {  
    	  
		super(ctx, nomeBd, null, versaoBanco);  
    }
    
    public void insertSQL(String scriptCreate, String scriptDelete){
		this.scriptCreate = scriptCreate;  
		this.scriptDelete = scriptDelete;  
    }
    
    public void insertSQL(String[] scriptsCreate, String scriptDelete){
		this.scriptsCreate = scriptsCreate;  
		this.scriptDelete = scriptDelete;  
    }
 
    public void onCreate(SQLiteDatabase db) {
	   	if (scriptDelete != null)
	   		db.execSQL(scriptDelete);
	   	if (scriptCreate != null)
	   		db.execSQL(scriptCreate); 
	   	if (scriptsCreate != null)
	   	{
			for (int i = 0; i < scriptsCreate.length; i++)
				db.execSQL(scriptsCreate[i]);
	   	}
		   
    } 
 
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {  
	   if (scriptDelete != null)
	       db.execSQL(scriptDelete);  
	   onCreate(db);  
    }  
}  

