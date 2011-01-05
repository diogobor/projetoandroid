package br.gov.tutorial.view.cadastroPais.consultaPais;

import java.util.Collection;

import br.gov.tutorial.R;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisUCForm;
import br.ufrj.dcc.api.view.ActionCommander;
import br.ufrj.dcc.api.view.PageFacade;
import br.ufrj.dcc.impl.view.PageFacadeImpl;

public abstract class ConsultaPaisControle {
	protected ActionCommander btnConsulta = new ActionCommander(){
		public void action() {
			ConsultaPaisUCForm form = new ConsultaPaisUCForm();
			PageFacade page = new PageFacadeImpl();
			//TODO utilizar reflection na implementação pra pegar o id
			form.setCodigo(page.getInputText(String.valueOf(R.id.codigo)).getValue());
			form.setCodigoAuxiliar(page.getInputText(String.valueOf(R.id.codigoAuxiliar)).getValue());
			form.setDescricao(page.getInputText(String.valueOf(R.id.descricao)).getValue());
			form.setValor(page.getInputText(String.valueOf(R.id.valor)).getValue());
			
			form.setPaises(consultarPais(form));
			
			//TODO utilizar reflection na implementação pra pegar o id
			page.changePage(String.valueOf(
					R.layout.resultadodaconsultadepais_consultarpais));
			
			
			preencherResultadoDaConsultaDePais(form);
		}
	};
	public void iniciar(){
		preInit();
		PageFacade page = new PageFacadeImpl();
		//TODO utilizar reflection na implementação pra pegar o id
		page.changePage(String.valueOf(
				R.layout.preenchaosdadosdaconsultadepais_consultarpais));
		page.getButton(String.valueOf(R.id.consulta)).setAction(btnConsulta);
		posInit();
	}
	protected void preInit(){
	}
	protected void posInit(){
	}
	private void preencherResultadoDaConsultaDePais(ConsultaPaisUCForm form){
		try {
			preencherGridPaises(form.getPaises());
		} catch (Exception e) {
			//TODO passar a utilizar R.string ao invés de uma string hard coded
			PageFacade page = new PageFacadeImpl();
			page.showErrorMessage("Um erro foi encontrado na aplicação");
		}
		
	}
	public abstract Collection consultarPais(ConsultaPaisUCForm form);
	
	public void preencherGridPaises(Collection paises) throws Exception{
		//TODO
		PageFacade page = new PageFacadeImpl();
		page.createTable(String.valueOf(R.id.Tabela01)
				, paises, null, "valor","codigo");
		
		/*
		TableLayout t = ((TableLayout)ActivityHandler.activity.findViewById(R.id.Tabela01));
		for(Object pais : paises){
			//TODO
			
			TableRow coluna = new TableRow(ActivityHandler.activity);
			
			Method[] metodos  = pais.getClass().getMethods();
			Method getValor=null;
			Method getCodigo=null;
			
			for(int i=0;i<metodos.length;i++){
				if(metodos[i].getName().endsWith("getValor")){
					getValor = metodos[i];
				}else{
					if(metodos[i].getName().endsWith("getCodigo")){
						getCodigo=metodos[i];
					}
				}
			}
			if(getCodigo!=null){
				Object[]params=null;
				//TODO
				TextView campo = new TextView(ActivityHandler.activity);
				campo.setText((String)getCodigo.invoke(pais, params));
				coluna.addView(campo);
				campo.setClickable(true);
				campo.setOnClickListener(new OnClickListener(){
					public void onClick(View v){
						DetalhaPaisControle controle = new DetalhaPaisControleImpl();
						controle.iniciar();
					}
				});
			}
			if(getValor!=null){
				Object[]params=null;
				//TODO
				TextView campo = new TextView(ActivityHandler.activity);
				campo.setText((String)getValor.invoke(pais, params));
				coluna.addView(campo);				
			}
			
			t.addView(coluna);
		}*/
	}
	
}
