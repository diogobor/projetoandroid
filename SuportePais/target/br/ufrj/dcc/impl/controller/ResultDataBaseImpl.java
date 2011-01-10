package br.ufrj.dcc.impl.controller;

import android.database.Cursor;
import br.ufrj.dcc.api.controller.ResultDataBase;

public class ResultDataBaseImpl implements ResultDataBase {

	private Cursor cursor;
	
	public ResultDataBaseImpl(Cursor cursor){
		this.cursor = cursor;
	}
	
	public Cursor getResultDataBase(){
		return this.cursor;
	}
}
