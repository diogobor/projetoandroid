package br.ufrj.dcc.api.view;

public interface Button {
	public void setAction(final ActionCommander action);
	public ActionCommander getAction();
	public String getText();
}
