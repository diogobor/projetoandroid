package br.ufrj.dcc.impl.controller;

import android.content.ContentValues;
import br.ufrj.dcc.api.controller.ConnectionDataBase;
import br.ufrj.dcc.api.controller.PersistenceValues;
import br.ufrj.dcc.api.controller.ResultDataBase;

public class PersistenceValuesImpl implements PersistenceValues {
	
	private ContentValues value;
	private android.database.sqlite.SQLiteDatabase db;
	
	public PersistenceValuesImpl (ContentValues value) {
		this.value = value;
	}
	
	public PersistenceValuesImpl (ConnectionDataBase db) {
		this.db = ((ConnectionDataBaseImpl)db).getConnDataBase();
	}
	
	public ContentValues getPersistenceValues(){
		return this.value;
	}

	public Long insert(String table, String nullColumnHack, PersistenceValues value) {
		ContentValues contentValue = ((PersistenceValuesImpl)value).getPersistenceValues();
		return this.db.insert(table, nullColumnHack, contentValue);
	}
	public int update(String table, PersistenceValues value,String whereClause, String[] whereArgs)
	{
		ContentValues contentValue = ((PersistenceValuesImpl)value).getPersistenceValues();
		return this.db.update(table, contentValue, whereClause, whereArgs);
	}
	public int delete(String table,String whereClause,String[] whereArgs)
	{
		return this.db.delete(table, whereClause, whereArgs);
	}
	public ResultDataBase query(String table,String[] columns,String selection,String[] selectionArgs,String groupBy, String having,String orderBy){
		ResultDataBase resultDB = new ResultDataBaseImpl(this.db.query(table, columns, selection, selectionArgs, groupBy, having, orderBy));
		return resultDB;
	}
	public void beginTransaction()
	{
		this.db.beginTransaction();
	}
	public void setTransactionSuccessful()
	{
		this.db.setTransactionSuccessful();
	}
	public void endTransaction()
	{
		db.endTransaction();
	}
}
