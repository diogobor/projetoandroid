package br.gov.tutorial.controller;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import br.gov.tutorial.cd.Pais;


public class PaisDAO extends DataBase {	
	
	private static final String SCRIPT_DB_CREATE =  
	       "create table if not exists pais (_id integer primary "+  
	       "key autoincrement, codigo text not null, "+  
	       "codigoAuxiliar text not null, valor text not null,"+
		   "descricao text not null);";
	
	public PaisDAO(Context ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
		executeSQL(SCRIPT_DB_CREATE);
	}
	
	public long inserir(Pais pais){  
       ContentValues cv = new ContentValues();  
       cv.put("codigo", pais.getCodigo());  
       cv.put("codigoAuxiliar", pais.getCodigoAuxiliar());  
       cv.put("valor", pais.getValor());
       cv.put("descricao", pais.getDescricao());
       return db.insert("pais", null, cv);  
	}
	
	public long atualizar(Pais pais){  
	       ContentValues cv = new ContentValues();  
	       cv.put("codigo", pais.getCodigo());  
	       cv.put("codigoAuxiliar", pais.getCodigoAuxiliar());  
	       cv.put("valor", pais.getValor());
	       cv.put("descricao", pais.getDescricao()); 
	       return db.update("pais", cv, "_id = ?",   
	           new String[]{ String.valueOf(pais.getId())});  
	   }  
	 
   public int excluir(int id){  
       return db.delete("pais", "_id = ?",   
           new String[]{ String.valueOf(id) });  
   }  
 
   public List<Pais> buscarPais(String descricao){  
       List<Pais> lista = new ArrayList<Pais>();  
 
       String[] columns = new String[]{  
           "_id", "codigo", "codigoAuxiliar", "valor", "descricao"};  
       String[] args = new String[]{descricao+"%"};  
       
       Cursor c = db.query("pais", columns, "descricao like ?", args, null, null, null);  
 
       c.moveToFirst();  
       while(!c.isAfterLast()){  
    	   Pais pais = fillPais(c);  
           lista.add(pais);  
           c.moveToNext();  
       }  
       return lista;  
   }  
 
   private Pais fillPais(Cursor c) {  
	   Pais pais = new Pais();  
       pais.setId(c.getInt(c.getColumnIndex("_id")));  
       pais.setCodigo(c.getString(c.getColumnIndex("codigo")));  
       pais.setCodigoAuxiliar(c.getString(c.getColumnIndex("codigoAuxiliar")));  
       pais.setValor(c.getString(c.getColumnIndex("valor")));
       pais.setDescricao(c.getString(c.getColumnIndex("descricao")));
       return pais;  
   } 
}
