package br.gov.tutorial.view.cadastroPais.consultaPais;

import java.util.Collection;

import android.util.Log;
import br.gov.tutorial.cd.Pais;
import br.gov.tutorial.cs.PaisHandler;
import br.gov.tutorial.cs.PaisHandlerImpl;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisUCForm;
import br.gov.tutorial.vo.PaisVO;
import br.ufrj.dcc.impl.ActivityHandler;



public class ConsultaPaisControleImpl extends ConsultaPaisControle{

	@Override
	public Collection consultarPais(ConsultaPaisUCForm form) {
		PaisHandler paisService = new PaisHandlerImpl();
		PaisVO paisVo = new PaisVO();
		paisVo.setCodigo(form.getCodigo());
		paisVo.setCodigoAuxiliar(form.getCodigoAuxiliar());
		paisVo.setDescricao(form.getDescricao());
		paisVo.setValor(form.getValor());
		//paisService.Insert(paisVo);
		
		//Aqui chama um serviço para fazer a consulta
		Collection<Pais> result = (Collection<Pais>) paisService.Filter(paisVo);
		
		//Aqui chama um serviço para fazer a consulta
		Log.d("Application Debug", "Imprimindo campos");
		Log.d(form.getClass().toString(), form.getCodigo());
		Log.d(form.getClass().toString(), form.getCodigoAuxiliar());
		Log.d(form.getClass().toString(), form.getValor());
		Log.d(form.getClass().toString(), form.getDescricao());
//		Collection a = new ArrayList();
//		Pais p = new PaisImpl();
//		p.setCodigo("c");
//		p.setCodigoAuxiliar("ca");
//		p.setDescricao("d");
//		p.setValor("aa");
//		
//		a.add(p);
//		
//		p = new PaisImpl();
//		p.setCodigo("c1");
//		p.setCodigoAuxiliar("ca1");
//		p.setDescricao("d1");
//		p.setValor("aa1");
//		
//		a.add(p);
// 		return a;
		return result;
		
	}


	
}
