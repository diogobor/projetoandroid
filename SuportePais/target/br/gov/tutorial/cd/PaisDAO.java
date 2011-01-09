package br.gov.tutorial.cd;

import java.util.List;

import br.gov.tutorial.vo.PaisVO;


public abstract class PaisDAO extends DAO {	
	
	private static final String SCRIPT_DB_CREATE =  
	       "create table if not exists pais (_id integer primary "+  
	       "key autoincrement, codigo text not null, "+  
	       "codigoAuxiliar text not null, valor text not null,"+
		   "descricao text not null);";
	
	public PaisDAO() {
		// TODO Auto-generated constructor stub
		executeSQL(SCRIPT_DB_CREATE);
	}

	public abstract long insert(Pais pais);
	
	public abstract long update(Pais pais);
	 
    public abstract int delete(long id); 
 
    public abstract List<Pais> findPais(PaisVO paisVO); 
 
}