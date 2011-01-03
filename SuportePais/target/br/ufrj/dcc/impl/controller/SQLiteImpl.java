package br.ufrj.dcc.impl.controller;

import android.content.ContentValues;
import android.database.Cursor;
import br.ufrj.dcc.api.controller.SQLite;

public class SQLiteImpl implements SQLite
{
	private android.database.sqlite.SQLiteDatabase db;
	public SQLiteImpl(android.database.sqlite.SQLiteDatabase db){
		this.db = db;
	}
	
	public Long insert(String table,String nullColumnHack,ContentValues value)
	{
		return this.db.insert(table, nullColumnHack, value);
	}
	public int update(String table, ContentValues values,String whereClause, String[] whereArgs)
	{
		return this.db.update(table, values, whereClause, whereArgs);
	}
	public int delete(String table,String whereClause,String[] whereArgs)
	{
		return this.db.delete(table, whereClause, whereArgs);
	}

	public Cursor query(String table,String[] columns,String selection,String[] selectionArgs,String groupBy, String having,String orderBy){
		return this.db.query(table, columns, selection, selectionArgs, groupBy, having, orderBy);
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
		this.db.endTransaction();
	}
}
