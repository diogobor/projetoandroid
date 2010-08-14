package br.gov.tutorial.view.cadastroPais.consultaPais;

import java.util.ArrayList;
import java.util.Collection;

import android.util.Log;
import br.gov.tutorial.cd.Pais;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisForm;



public class ConsultaPaisControleImpl extends ConsultaPaisControle{

	@Override
	public Collection consultarPais(ConsultaPaisForm form) {
		// -- Nao faz parte desse metodo ---
		Pais pais = new Pais();
		pais.setCodigo(form.getCodigo());
		pais.setCodigoAuxiliar(form.getCodigoAuxiliar());
		pais.setDescricao(form.getDescricao());
		pais.setValor(form.getValor());
		
		dao.inserir(pais);
		
		// Termina aqui o inserir
		//Aqui chama um serviço para fazer a consulta
		Log.d("Application Debug", "Imprimindo campos");
		Log.d(form.getClass().toString(), form.getCodigo());
		Log.d(form.getClass().toString(), form.getCodigoAuxiliar());
		Log.d(form.getClass().toString(), form.getValor());
		Log.d(form.getClass().toString(), form.getDescricao());
		return new ArrayList();
		
	}


	
}
