package br.ufrj.dcc.impl.controller;

import java.util.HashMap;

import android.database.Cursor;
import br.ufrj.dcc.api.controller.ResultDataBase;

public class ResultDataBaseImpl implements ResultDataBase {

	private Cursor cursor;
	
	public ResultDataBaseImpl(Cursor cursor){
		this.cursor = cursor;
	}
	
	public HashMap<Object,HashMap<Object,Object>> getResultDataBase(){
		return fillCursor(this.cursor);
	}
	
	private HashMap<Object, HashMap<Object,Object>> fillCursor(Cursor cursor){
		HashMap<Object,  HashMap<Object,Object>> returnMap = new HashMap<Object,HashMap<Object,Object>>();
		cursor.moveToFirst();  
		while(!cursor.isAfterLast()){
			HashMap<Object,Object> subMap = new HashMap<Object, Object>();
			for(int i = 0; i < cursor.getColumnCount(); i++){
				if (cursor.getColumnName(i).equals("_id"))
					subMap.put(cursor.getColumnName(i), cursor.getInt(cursor.getColumnIndex(cursor.getColumnName(i))));
				else
					subMap.put(cursor.getColumnName(i), cursor.getString(cursor.getColumnIndex(cursor.getColumnName(i))));
			}
			returnMap.put(cursor.getInt(cursor.getColumnIndex("_id")), subMap);
			cursor.moveToNext();  
		}  
		return returnMap;
	}
}
