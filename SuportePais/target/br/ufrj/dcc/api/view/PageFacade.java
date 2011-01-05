package br.ufrj.dcc.api.view;

import java.util.Collection;

public interface PageFacade {
	public InputText getInputText(String id);
	public Button getButton(String id);
	public void changePage(String id);
	public void showErrorMessage(String message);
	public void createTable(String id ,Collection elements,Collection Buttons, String ... fields)throws Exception;
}
