package br.gov.tutorial.cd;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import br.gov.tutorial.vo.PaisVO;

public class PaisDAOImpl extends PaisDAO {

	public PaisDAOImpl(Context ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
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
		 
	   public int excluir(long id){  
	       return db.delete("pais", "_id = ?",   
	           new String[]{ String.valueOf(id) });  
	   }  
	 
	   public List<Pais> buscarPais(PaisVO paisVO){  
		   //Inicia a transação
		   db.beginTransaction();
	       List<Pais> lista = new ArrayList<Pais>();  
	 
	       String[] columns = new String[]{  
	           "_id", "codigo", "codigoAuxiliar", "valor", "descricao"
	           };  
	       
	       String[] args = new String[]{
	    		   paisVO.getCodigo()+"%", paisVO.getCodigoAuxiliar()+"%", paisVO.getValor()+"%", paisVO.getDescricao()+"%"
	       };  
	       
	       Cursor c = db.query("pais", columns, "codigo like ? and codigoAuxiliar like ?  and valor like ? and descricao like ?", args, null, null, null);  
	 
	       c.moveToFirst();  
	       while(!c.isAfterLast()){  
	    	   Pais pais = fillPais(c);  
	           lista.add(pais);  
	           c.moveToNext();  
	       }  
	       db.setTransactionSuccessful();
	       db.endTransaction();
	       return lista;  
	   }  
	 
	   private Pais fillPais(Cursor c) {  
		   Pais pais = new PaisImpl();  
	       pais.setId(c.getInt(c.getColumnIndex("_id")));  
	       pais.setCodigo(c.getString(c.getColumnIndex("codigo")));  
	       pais.setCodigoAuxiliar(c.getString(c.getColumnIndex("codigoAuxiliar")));  
	       pais.setValor(c.getString(c.getColumnIndex("valor")));
	       pais.setDescricao(c.getString(c.getColumnIndex("descricao")));
	       return pais;  
	   } 

}
