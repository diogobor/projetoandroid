package com.portalandroid.olaandroid;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.database.Cursor;
import android.database.DatabaseUtils;;


public class MinhaAtividade extends Activity {
	
	public Intent classeDados;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        classeDados = new Intent(this, DadosDoPais.class);
        
        
        Button ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(okListener);
        Button cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(cancelListener);
        Button inserir = (Button) findViewById(R.id.inserir);
        inserir.setOnClickListener(inserirListener);
       
        
       



    }
    private OnClickListener inserirListener = new OnClickListener()
    {
        
    	private SQLiteDatabase banco = null;
		@Override
		public void onClick(View v) {
			
			
				/* Cria o banco se nao existir */
		        try {
		        
		        //Recupera o valor digitado no edit
		        EditText edit = (EditText) findViewById(R.id.entry);
		        String valor = edit.getText().toString();
		         banco = openOrCreateDatabase("bancoPais", MODE_PRIVATE, null);

		         /* Cria a tabela se nao existir */
		         banco.execSQL("CREATE TABLE IF NOT EXISTS "
		           + "pais"
		           + " (nome VARCHAR);");
		         
		         banco.execSQL("CREATE TABLE IF NOT EXISTS "
				           + "pais"
				           + " (nome VARCHAR);");
		         /* Insere o valor digitado na tabela*/
			        banco.execSQL("INSERT INTO "
			           + "pais"
			           + " (nome)"
			           + " VALUES ('"+valor+"');");

		        } catch(Exception e) {
		         Log.e("Error", "Error", e);
		        } finally {
		         if (banco != null)
		          banco.close();
		        }
		        
		        
		         
			setResult(RESULT_OK);
            finish();
		}
    };
    
    private OnClickListener cancelListener = new OnClickListener()
    {
        

		@Override
		public void onClick(View v) {
			
			
			setResult(RESULT_OK);
            finish();
		}
    };
    
    private OnClickListener okListener = new OnClickListener()
    {
        

		@Override
		public void onClick(View v) {
			
			 EditText edit = (EditText) findViewById(R.id.entry);
		     String valor = edit.getText().toString();
	         classeDados.putExtra("android.app.Activity.Texto", valor);
	        //Chama a classe dados do pais
			startActivity(classeDados);
			setResult(RESULT_OK);
            finish();
		}
    };
    
   
}
