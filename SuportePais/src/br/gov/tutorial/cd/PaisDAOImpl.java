package br.gov.tutorial.cd;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.database.Cursor;
import br.gov.tutorial.vo.PaisVO;
import br.ufrj.dcc.api.controller.PersistenceValues;
import br.ufrj.dcc.api.controller.ResultDataBase;
import br.ufrj.dcc.impl.controller.PersistenceValuesImpl;
import br.ufrj.dcc.impl.controller.ResultDataBaseImpl;

public class PaisDAOImpl extends PaisDAO {

	public PaisDAOImpl(){
	}

	public long insert(Pais pais){  
	       ContentValues cv = new ContentValues();  
	       cv.put("codigo", pais.getCodigo());  
	       cv.put("codigoAuxiliar", pais.getCodigoAuxiliar());  
	       cv.put("valor", pais.getValor());
	       cv.put("descricao", pais.getDescricao());
	       PersistenceValues pv = new PersistenceValuesImpl(cv);
	       return db.insert("pais", null, pv);  
		}
		
		public long update(Pais pais){  
		       ContentValues cv = new ContentValues();  
		       cv.put("codigo", pais.getCodigo());  
		       cv.put("codigoAuxiliar", pais.getCodigoAuxiliar());  
		       cv.put("valor", pais.getValor());
		       cv.put("descricao", pais.getDescricao());
		       PersistenceValues pv = new PersistenceValuesImpl(cv);
		       return db.update("pais", pv, "_id = ?",   
		           new String[]{ String.valueOf(pais.getId())});  
		   }  
		 
	   public int delete(long id){  
	       return db.delete("pais", "_id = ?",   
	           new String[]{ String.valueOf(id) });  
	   }  
	 
	   public List<Pais> findPais(PaisVO paisVO){  
		   
		   
	       List<Pais> lista = new ArrayList<Pais>();  
	 
	       String[] columns = new String[]{  
	           "_id", "codigo", "codigoAuxiliar", "valor", "descricao"
	           };  
	       
	       String[] args = new String[]{
	    		   paisVO.getCodigo()+"%", paisVO.getCodigoAuxiliar()+"%", paisVO.getValor()+"%", paisVO.getDescricao()+"%"
	       };  
	       
	       ResultDataBase resultDB = db.query("pais", columns, "codigo like ? and codigoAuxiliar like ?  and valor like ? and descricao like ?", args, null, null, null);
	       Cursor c = ((ResultDataBaseImpl)resultDB).getResultDataBase();
	       
	       c.moveToFirst();  
	       while(!c.isAfterLast()){  
	    	   Pais pais = fillPais(c);  
	           lista.add(pais);  
	           c.moveToNext();  
	       }  
	      
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
