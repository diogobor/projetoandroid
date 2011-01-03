package br.gov.tutorial.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {  
	private String scriptCreate;  
    private String[] scriptsCreate;
  
    public SQLiteHelper(Context ctx, String nomeBd, int versaoBanco) {  
    	  
		super(ctx, nomeBd, null, versaoBanco);  
    }
    
    public void insertSQL(SQLiteDatabase db, String scriptCreate){
		this.scriptCreate = scriptCreate;  
		onUpgrade(db,1,1);
    }
    
    public void insertSQL(SQLiteDatabase db, String[] scriptsCreate){
		this.scriptsCreate = scriptsCreate;  
		onUpgrade(db,1,1);
    }
 
    public void onCreate(SQLiteDatabase db) {
	   	if (scriptCreate != null)
	   		db.execSQL(scriptCreate); 
	   	if (scriptsCreate != null)
	   	{
			for (int i = 0; i < scriptsCreate.length; i++)
				db.execSQL(scriptsCreate[i]);
	   	}
		   
    } 
 
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {  
	   onCreate(db);  
    }  
}  

