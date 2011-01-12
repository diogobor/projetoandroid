package br.ufrj.dcc.api.view;

public interface Session {
	public void put(Object key ,Object value);
	public void remove(Object key);
	public Object get(Object key);
}
