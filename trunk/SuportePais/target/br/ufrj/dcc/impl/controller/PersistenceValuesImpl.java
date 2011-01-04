package br.ufrj.dcc.impl.controller;

import android.content.ContentValues;
import br.ufrj.dcc.api.controller.PersistenceValues;

public class PersistenceValuesImpl implements PersistenceValues {
	
	private ContentValues value;
	
	public PersistenceValuesImpl (ContentValues value) {
		this.value = value;
	}
	
	public ContentValues getPersistenceValues(){
		return this.value;
	}
}
