package br.gov.tutorial.cd;

import java.util.List;

import br.gov.tutorial.vo.PaisVO;


public abstract class PaisDAO extends DAO {	
	
//	private static final String SCRIPT_DB_CREATE =  
//	       "create table if not exists pais (_id integer primary "+  
//	       "key autoincrement, codigo text not null, "+  
//	       "codigoAuxiliar text not null, valor text not null,"+
//		   "descricao text not null);";
	private static final String SCRIPT_DB_CREATE =  
	       "create table if not exists pais (_id integer primary "+  
	       "key autoincremento, " + getAttributes();
	
	public PaisDAO() {
		executeSQL(SCRIPT_DB_CREATE);
	}

	public abstract long insert(Pais pais);
	
	public abstract long update(Pais pais);
	 
    public abstract int delete(long id); 
 
    public abstract List<Pais> findPais(PaisVO paisVO); 
    
    private static String getAttributes(){
 		String returnSQL = "";
 		
 		returnSQL += "codigo text not null,";
		
		
		returnSQL += "codigoAuxiliar text not null,";
			
			
		returnSQL += "valor text not null,";
		
		
		returnSQL += "descricao text not null,";
			
			
		 	
		if (returnSQL.length() > 0)  
		returnSQL = returnSQL.substring (0,returnSQL.length() - 1);
		return returnSQL + ");";
	
    }
 
}
