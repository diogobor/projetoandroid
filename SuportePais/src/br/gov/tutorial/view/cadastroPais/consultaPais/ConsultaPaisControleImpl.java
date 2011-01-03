package br.gov.tutorial.view.cadastroPais.consultaPais;

import java.util.ArrayList;
import java.util.Collection;

import br.gov.tutorial.cd.Pais;
import br.gov.tutorial.cd.PaisImpl;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisUCForm;



public class ConsultaPaisControleImpl extends ConsultaPaisControle{

	@Override
	public Collection consultarPais(ConsultaPaisUCForm form) {
		/*
		PaisBeanImpl paisService = new PaisBeanImpl();
		
		//metodo teste de insercao
		paisService.handleInsert(form);
		
		//Aqui chama um serviço para fazer a consulta
		List result = (List) paisService.handleFilter(form);
		Log.d("Application Debug", "Imprimindo campos");
		Log.d(form.getClass().toString(), form.getCodigo());
		Log.d(form.getClass().toString(), form.getCodigoAuxiliar());
		Log.d(form.getClass().toString(), form.getValor());
		Log.d(form.getClass().toString(), form.getDescricao());*/
		Collection a = new ArrayList();
		Pais p = new PaisImpl();
		p.setCodigo("c");
		p.setCodigoAuxiliar("ca");
		p.setDescricao("d");
		p.setValor("aa");
		
		a.add(p);
		
		p = new PaisImpl();
		p.setCodigo("c1");
		p.setCodigoAuxiliar("ca1");
		p.setDescricao("d1");
		p.setValor("aa1");
		
		a.add(p);
 		return a;
		
	}


	
}
