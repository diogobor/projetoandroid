package br.ufrj.dcc.impl.view;

import java.util.HashMap;
import java.util.Map;

import br.ufrj.dcc.api.view.Session;

public class SessionImpl implements Session{
	private static SessionImpl instance;
	private Map map;
	private SessionImpl( ){
		map = new HashMap();
	}
	public static SessionImpl instance(){
		if(instance==null){
			instance = new SessionImpl();
		}
		return instance;
	}
	
	public Object get(Object key) {
		return map.get(key);
		
	}
	
	public void put(Object key, Object value) {
		map.put(key, value);
		
	}
	
	public void remove(Object key) {
		map.remove(key);
		
	}
}
