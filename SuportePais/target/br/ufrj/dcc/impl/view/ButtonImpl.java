package br.ufrj.dcc.impl.view;

import android.view.View;
import android.view.View.OnClickListener;
import br.ufrj.dcc.api.view.ActionCommander;
import br.ufrj.dcc.api.view.Button;

public class ButtonImpl implements Button{
	private android.widget.Button source;
	private ActionCommander action;
	public ButtonImpl(android.widget.Button source){
		this.source = source;
		this.initialize();
	}
	private void initialize(){
		OnClickListener listener = new OnClickListener(){
			public void onClick(View v) {
				action.action();
			}
		};
		this.source.setOnClickListener(listener);
	}
	
	public void setAction(ActionCommander action) {
		this.action = action;
		
	}
	public android.widget.Button getSource(){
		return source;
	}
	

}
