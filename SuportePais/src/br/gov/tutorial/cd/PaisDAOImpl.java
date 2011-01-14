package br.gov.tutorial.cd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import br.gov.tutorial.vo.PaisVO;
import br.ufrj.dcc.api.controller.PersistenceValues;
import br.ufrj.dcc.api.controller.ResultDataBase;
import br.ufrj.dcc.impl.controller.PersistenceValuesImpl;
import br.ufrj.dcc.impl.controller.ResultDataBaseImpl;

public class PaisDAOImpl extends PaisDAO {

	public PaisDAOImpl(){
	}

	public long insert(Pais pais){  
	   HashMap<Object,Object> value = new HashMap<Object,Object>();
       value.put("codigo", pais.getCodigo());  
       value.put("codigoAuxiliar", pais.getCodigoAuxiliar());  
       value.put("valor", pais.getValor());
       value.put("descricao", pais.getDescricao());
       PersistenceValues pv = new PersistenceValuesImpl(value);
       return db.insert("pais", null, pv);  
	}
		
	public long update(Pais pais){ 
	   HashMap<Object,Object> value = new HashMap<Object,Object>();
       value.put("codigo", pais.getCodigo());  
       value.put("codigoAuxiliar", pais.getCodigoAuxiliar());  
       value.put("valor", pais.getValor());
       value.put("descricao", pais.getDescricao());
       PersistenceValues pv = new PersistenceValuesImpl(value);
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
       HashMap<Object,HashMap<Object,Object>> map = ((ResultDataBaseImpl)resultDB).getResultDataBase();
       
       for (Iterator<Object> it = map.keySet().iterator(); it.hasNext();) {  
    	   Object key = it.next();  
    	   Pais pais = fillPais(key,map);
    	   lista.add(pais);
       }
       return lista;  
   }  
 
   private Pais fillPais(Object key, HashMap<Object,HashMap<Object,Object>> map) {  
	   Pais pais = new PaisImpl();
	   HashMap<Object,Object> item = map.get(key);
	   pais.setId((Integer)item.get("_id"));
	   pais.setCodigo(item.get("codigo").toString());
	   pais.setCodigoAuxiliar(item.get("codigoAuxiliar").toString());
	   pais.setValor(item.get("valor").toString());
	   pais.setDescricao(item.get("descricao").toString());
       return pais;  
   } 

}
