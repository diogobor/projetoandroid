package br.ufrj.dcc.api.controller;

import android.content.ContentValues;
import android.database.Cursor;


public interface SQLite
{
	public Long insert(String table,String nullColumnHack,ContentValues value);
	public int update(String table, ContentValues values,String whereClause, String[] whereArgs);
	public int delete(String table,String whereClause,String[] whereArgs);
	public Cursor query(String table,String[] columns,String selection,String[] selectionArgs,String groupBy, String having,String orderBy);
	public void beginTransaction();
	public void setTransactionSuccessful();
	public void endTransaction();
}
