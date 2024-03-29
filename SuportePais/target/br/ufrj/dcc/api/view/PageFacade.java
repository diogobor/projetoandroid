package br.ufrj.dcc.api.view;

import java.util.Collection;
import java.util.List;

public interface PageFacade {
	public static final String TABLE_ACTION_KEY="table_action_key";
	public InputText getInputText(String id);
	public Button getButton(String id);
	public void changePage(String id);
	public void showErrorMessage(String message);
	public void createTable(String tableId ,Collection elements,List<Button[]> Buttons, String ... fields)throws Exception;
	public Button createButton(String label);
	public void setLabel(String id, String valor );
}
