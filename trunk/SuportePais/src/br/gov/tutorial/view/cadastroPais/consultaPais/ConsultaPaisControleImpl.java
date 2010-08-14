package br.gov.tutorial.view.cadastroPais.consultaPais;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import android.util.Log;
import br.gov.tutorial.cs.PaisBeanImpl;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisForm;



public class ConsultaPaisControleImpl extends ConsultaPaisControle{

	@Override
	public Collection consultarPais(ConsultaPaisForm form) {
		
		PaisBeanImpl paisService = new PaisBeanImpl();
		
		//metodo teste de insercao
		paisService.handleInsert(form);
		
		//Aqui chama um serviço para fazer a consulta
		List result = (List) paisService.handleFilter(form);
		Log.d("Application Debug", "Imprimindo campos");
		Log.d(form.getClass().toString(), form.getCodigo());
		Log.d(form.getClass().toString(), form.getCodigoAuxiliar());
		Log.d(form.getClass().toString(), form.getValor());
		Log.d(form.getClass().toString(), form.getDescricao());
		return new ArrayList();
		
	}


	
}
