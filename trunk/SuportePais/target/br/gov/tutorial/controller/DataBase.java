package br.gov.tutorial.controller;

import br.ufrj.dcc.api.controller.ConnectionDataBase;
import br.ufrj.dcc.api.controller.ContextDataBase;
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
			context = new ContextDataBaseImpl(NOME_BANCO, VERSAO_BANCO);
		if (connection == null)
			connection = new ConnectionDataBaseImpl(((ContextDataBaseImpl)context));
		if (db == null){
			db = new PersistenceValuesImpl(connection);
		}
	}
	
	public void executeSQL(String sql){
		connection = new ConnectionDataBaseImpl(((ContextDataBaseImpl)context));
		context.insertSQL(connection,sql);
		connection = new ConnectionDataBaseImpl(((ContextDataBaseImpl)context));
		db = new PersistenceValuesImpl(connection);
	}
}