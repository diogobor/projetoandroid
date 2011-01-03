package br.gov.tutorial.view.cadastroPais.consultaPais;

import java.lang.reflect.Method;
import java.util.Collection;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import br.gov.tutorial.R;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisUCForm;
import br.gov.tutorial.view.cadastroPais.detalhaPais.DetalhaPaisControle;
import br.gov.tutorial.view.cadastroPais.detalhaPais.DetalhaPaisControleImpl;
import br.ufrj.dcc.api.view.ActionCommander;
import br.ufrj.dcc.api.view.PageFacade;
import br.ufrj.dcc.impl.ActivityHandler;
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
			
			//TODO
			ActivityHandler.activity.setContentView(
					R.layout.resultadodaconsultadepais_consultarpais);
			
			
			preencherResultadoDaConsultaDePais(form);
		}
	};
	public void iniciar(){
		preInit();
		PageFacade page = new PageFacadeImpl();
		//TODO
		ActivityHandler.activity.setContentView(
				R.layout.preenchaosdadosdaconsultadepais_consultarpais);
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
			//TODO
			AlertDialog.Builder builder = new AlertDialog.Builder(ActivityHandler.activity);
			builder.setMessage("Um erro foi encontrado na aplicação").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {/*Não faz nada*/}});
		}
		
	}
	public abstract Collection consultarPais(ConsultaPaisUCForm form);
	
	public void preencherGridPaises(Collection paises) throws Exception{
		//TODO
		TableLayout t = ((TableLayout)ActivityHandler.activity.findViewById(R.id.Tabela01));
		for(Object pais : paises){
			//TODO
			TableRow coluna = new TableRow(ActivityHandler.activity);
			/*fazer isso para cada campo de pais, neste caso codigo/valor*/
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
		}
	}
	
}
