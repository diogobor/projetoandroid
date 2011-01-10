package br.gov.tutorial.controller;

import br.ufrj.dcc.api.controller.ConnectionDataBase;
import br.ufrj.dcc.api.controller.ContextDataBase;
import br.ufrj.dcc.impl.ActivityHandler;
import br.ufrj.dcc.impl.controller.ConnectionDataBaseImpl;
import br.ufrj.dcc.impl.controller.ContextDataBaseImpl;
import br.ufrj.dcc.impl.controller.PersistenceValuesImpl;

public class DataBase{
	
	private static final String NOME_BANCO = "SuportePaisDB";
	private static final int VERSAO_BANCO = 1;
	private ConnectionDataBase connection;
	private ContextDataBase context;
	protected static PersistenceValuesImpl db;
	
	public DataBase (){
		
		if (context == null)
			context = new ContextDataBaseImpl(ActivityHandler.activity, NOME_BANCO, VERSAO_BANCO);
		if (connection == null)
			connection = new ConnectionDataBaseImpl(((ContextDataBaseImpl)context).getWritableDatabase());
		if (db == null){
			db = new PersistenceValuesImpl(connection);
		}
	}
	
	public void executeSQL(String sql){
		//connDB = new ConnDataBaseImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
		connection = new ConnectionDataBaseImpl(((ContextDataBaseImpl)context).getWritableDatabase());
		context.insertSQL(connection,sql);
		//db = new SQLiteImpl(((DatabaseHelperImpl)dbHelper).getWritableDatabase());
		connection = new ConnectionDataBaseImpl(((ContextDataBaseImpl)context).getWritableDatabase());
		db = new PersistenceValuesImpl(connection);
	}
}