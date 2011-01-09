package br.gov.tutorial.controller;

import br.ufrj.dcc.api.controller.ConnDataBase;
import br.ufrj.dcc.api.controller.DatabaseHelper;
import br.ufrj.dcc.impl.ActivityHandler;
import br.ufrj.dcc.impl.controller.ConnDataBaseImpl;
import br.ufrj.dcc.impl.controller.DatabaseHelperImpl;
import br.ufrj.dcc.impl.controller.PersistenceValuesImpl;

public class DataBase{
	
	private static final String NOME_BANCO = "SuportePaisDB";
	private static final int VERSAO_BANCO = 1;
	private DatabaseHelper dbHelper;
	private ConnDataBase dbHelperTemp;
	protected static PersistenceValuesImpl db;
	//protected static SQLite db;
	
	public DataBase (){
		if (dbHelper == null)
			dbHelper = new DatabaseHelperImpl(ActivityHandler.activity, NOME_BANCO, VERSAO_BANCO);
		if (dbHelperTemp == null)
			dbHelperTemp = new ConnDataBaseImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
		if (db == null){
			db = new PersistenceValuesImpl(dbHelperTemp);
		}
	}
	
	public void executeSQL(String sql){
		//connDB = new ConnDataBaseImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
		dbHelperTemp = new ConnDataBaseImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
		dbHelper.insertSQL(dbHelperTemp,sql);
		//db = new SQLiteImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
		dbHelperTemp = new ConnDataBaseImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
		db = new PersistenceValuesImpl(dbHelperTemp);
	}
}