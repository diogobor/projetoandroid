package br.ufrj.dcc.impl.view;

import android.widget.EditText;
import br.ufrj.dcc.api.view.Button;
import br.ufrj.dcc.api.view.InputText;
import br.ufrj.dcc.api.view.PageFacade;
import br.ufrj.dcc.impl.ActivityHandler;

public class PageFacadeImpl implements PageFacade{

	
	public InputText getInputText(String id) {
		return new InputTextImpl((EditText)ActivityHandler.activity.findViewById(Integer.parseInt(id)));
	}


	public Button getButton(String id) {
		return new ButtonImpl((android.widget.Button)ActivityHandler.activity.findViewById(Integer.parseInt(id)));
	}

}
