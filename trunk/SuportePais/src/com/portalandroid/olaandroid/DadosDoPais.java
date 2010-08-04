package com.portalandroid.olaandroid;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class DadosDoPais extends Activity {
	private SQLiteDatabase banco = null;
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	      
			
	        try {
	         String textoTela = (String) getIntent().getExtras().get("android.app.Activity.Texto");
	         banco = openOrCreateDatabase("banco", MODE_PRIVATE, null);
	        
	         banco.execSQL("CREATE TABLE IF NOT EXISTS "
	           + "pais"
	           + " (nome VARCHAR);");
	        
	         Cursor c = banco.rawQuery("SELECT * FROM pais where nome='"+textoTela+"'" , null);
	        
	         int Column1 = c.getColumnIndex("nome");
	         String Name = "";

	         
	         c.moveToFirst();
	         if (c != null) {
	         
	          do {
	           Name= (Name+"\n"+c.getString(Column1));
	     
	           
	          }while(c.moveToNext());
	         }
	        TextView tv = new TextView(this);
	        tv.setText(Name);
	        setContentView(tv);

	        } catch(Exception e) {
	         Log.e("Error", "Error", e);
	        } finally {
	         if (banco != null)
	          banco.close();
	        }
	         
	    }

}
