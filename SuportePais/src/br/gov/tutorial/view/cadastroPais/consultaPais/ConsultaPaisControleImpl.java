package br.gov.tutorial.view.cadastroPais.consultaPais;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import android.util.Log;
import br.gov.tutorial.cd.Pais;
import br.gov.tutorial.cs.PaisHandler;
import br.gov.tutorial.cs.PaisHandlerImpl;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisForm;
import br.gov.tutorial.vo.PaisVO;



public class ConsultaPaisControleImpl extends ConsultaPaisControle{

	@Override
	public Collection consultarPais(ConsultaPaisForm form) {
		
		PaisHandler paisService = new PaisHandlerImpl();
		
		//metodo teste de insercao
		PaisVO paisVo = new PaisVO();
		paisVo.setCodigo(form.getCodigo());
		paisVo.setCodigoAuxiliar(form.getCodigoAuxiliar());
		paisVo.setDescricao(form.getDescricao());
		paisVo.setValor(form.getValor());
		//paisService.handleInsert(paisVo);
		
		//Aqui chama um serviço para fazer a consulta
		Collection<Pais> result = (Collection<Pais>) paisService.handleFilter(paisVo);

		Log.d("Application Debug", "Banco de Dados");
		for (Pais pais : result) {
			Log.d("---- Pais ----", "---- Pais ----");
			Log.d("Codigo Banco", pais.getCodigo());
			Log.d("Codigo Auxiliar Banco", pais.getCodigoAuxiliar());
			Log.d("Valor Banco", pais.getValor());
			Log.d("Descricao Banco", pais.getDescricao());
		}
		
		return result;
		
	}


	
}
