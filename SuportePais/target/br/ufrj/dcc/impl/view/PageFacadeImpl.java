package br.ufrj.dcc.impl.view;

import java.lang.reflect.Method;
import java.util.Collection;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import br.ufrj.dcc.api.view.ActionCommander;
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


	@Override
	public void changePage(String id) {
		ActivityHandler.activity.setContentView(Integer.parseInt(id));
	}


	@Override
	public void showErrorMessage(String message) {
		AlertDialog.Builder builder = new AlertDialog.Builder(ActivityHandler.activity);
		builder.setMessage(message).setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {/*N�o faz nada*/}});
		builder.show();
		
	}


	@Override
	public void createTable(String tableId ,Collection elements,Collection<Button> buttons, String ... fields) throws Exception {
		TableLayout t = ((TableLayout)ActivityHandler.activity.findViewById(Integer.parseInt(tableId)));
		for(Object element : elements){
			//TODO
			TableRow row = new TableRow(ActivityHandler.activity);
			Method[] methods  = element.getClass().getMethods();
			Method[] getters=new Method[fields.length];
			int methodIndex=0;
			for(int i=0;i<methods.length;i++){
				for(int j=0;j<fields.length;j++){
					if(methods[i].getName().endsWith("get"+capitalize(fields[j]))){
						getters[methodIndex++]=methods[i];
					}
				}
			}
			for(int i=0;i<getters.length;i++){
				if(getters[i]!=null){
					Object[]params=null;
					TextView campo=new TextView(ActivityHandler.activity);
					campo.setText((String)getters[i].invoke(element, params));
					row.addView(campo);
				}
			}
			if(buttons!=null){
				for(Button button : buttons){
					ButtonImpl but = (ButtonImpl)createButton(button.getText());
					but.setAction(button.getAction());
					row.addView(but.getSource());
				}
			}
			t.addView(row);
		}
		
	}
	
	public Button createButton(String label){
		android.widget.Button source = new android.widget.Button(ActivityHandler.activity);
		source.setText(label);
		return new ButtonImpl(source);
	}
	private static String capitalize(String s) {
        if (s.length() == 0) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
