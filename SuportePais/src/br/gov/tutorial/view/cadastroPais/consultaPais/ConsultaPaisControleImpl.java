package br.gov.tutorial.view.cadastroPais.consultaPais;

import android.util.Log;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisForm;



public class ConsultaPaisControleImpl extends ConsultaPaisControle{

	@Override
	public void consultarPais(ConsultaPaisForm form) {
		
		//Aqui chama um serviço para fazer a consulta
		Log.d("Application Debug", "Imprimindo campos");
		Log.d(form.getClass().toString(), form.getCodigo());
		Log.d(form.getClass().toString(), form.getCodigoAuxiliar());
		Log.d(form.getClass().toString(), form.getValor());
		Log.d(form.getClass().toString(), form.getDescricao());
		
	}


	
}
