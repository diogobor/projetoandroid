package br.gov.tutorial.cs;

import java.util.Collection;

import br.gov.tutorial.ActivityHandler;
import br.gov.tutorial.controller.PaisDAO;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisForm;

public abstract class PaisBean {
	protected PaisDAO dao = new PaisDAO(ActivityHandler.atividade);
	public abstract Collection handleFilter(ConsultaPaisForm form);
	public abstract void handleInsert(ConsultaPaisForm form);
}
