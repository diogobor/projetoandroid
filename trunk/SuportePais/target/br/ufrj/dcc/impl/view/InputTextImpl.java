package br.ufrj.dcc.impl.view;

import android.widget.EditText;
import br.ufrj.dcc.api.view.InputText;

public class InputTextImpl implements InputText{
	private EditText source;
	public InputTextImpl(EditText source){
		this.source = source;
	}
	
	public String getValue() {
		return source.getText().toString();
	}

	public void setValue(String value) {
		source.setText(value);
	}
	
}
