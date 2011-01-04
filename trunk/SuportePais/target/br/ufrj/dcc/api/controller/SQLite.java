package br.ufrj.dcc.api.controller;

public interface SQLite
{
	public Long insert(String table,String nullColumnHack,PersistenceValues value);
	public int update(String table, PersistenceValues value,String whereClause, String[] whereArgs);
	public int delete(String table,String whereClause,String[] whereArgs);
	public ResultDataBase query(String table,String[] columns,String selection,String[] selectionArgs,String groupBy, String having,String orderBy);
	public void beginTransaction();
	public void setTransactionSuccessful();
	public void endTransaction();
}
