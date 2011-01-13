package br.gov.tutorial.controller;

import br.ufrj.dcc.api.controller.ConnectionDataBase;
import br.ufrj.dcc.api.controller.ContextDataBase;
import br.ufrj.dcc.api.view.PageFacade;
import br.ufrj.dcc.impl.controller.ConnectionDataBaseImpl;
import br.ufrj.dcc.impl.controller.ContextDataBaseImpl;
import br.ufrj.dcc.impl.controller.PersistenceValuesImpl;
import br.ufrj.dcc.impl.view.PageFacadeImpl;

public class DataBase{
	
	private static final String NOME_BANCO = "SuportePaisDB";
	private static final int VERSAO_BANCO = 1;
	private ConnectionDataBase connection;
	private ContextDataBase context;
	protected static PersistenceValuesImpl db;
	
	public DataBase (){
		
		if (context == null){
			try {
				context = new ContextDataBaseImpl(NOME_BANCO, VERSAO_BANCO);	
			} catch (Exception e) {
				PageFacade page = new PageFacadeImpl();
				page.showErrorMessage("Erro ao criar o Banco!");
			}
		}
		if (connection == null){
			try {
				connection = new ConnectionDataBaseImpl(((ContextDataBaseImpl)context));
			} catch (Exception e) {
				PageFacade page = new PageFacadeImpl();
				page.showErrorMessage("Erro ao conectar ao Banco!");
			}
		}
		if (db == null){
			db = new PersistenceValuesImpl(connection);
		}
	}
	
	public void executeSQL(String sql){
		if (connection == null){
			try {
				connection = new ConnectionDataBaseImpl(((ContextDataBaseImpl)context));
			} catch (Exception e) {
				PageFacade page = new PageFacadeImpl();
				page.showErrorMessage("Erro ao conectar ao Banco!");
			}
		}
		
		context.insertSQL(connection,sql);
		
		if (connection == null){
			try {
				connection = new ConnectionDataBaseImpl(((ContextDataBaseImpl)context));
			} catch (Exception e) {
				PageFacade page = new PageFacadeImpl();
				page.showErrorMessage("Erro ao conectar ao Banco!");
			}
		}
		db = new PersistenceValuesImpl(connection);
	}
}