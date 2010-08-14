package br.gov.tutorial.view.cadastroPais.consultaPais;

import java.lang.reflect.Method;
import java.util.Collection;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import br.gov.tutorial.ActivityHandler;
import br.gov.tutorial.R;
import br.gov.tutorial.controller.PaisDAO;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisForm;

public abstract class ConsultaPaisControle {
	public PaisDAO dao;
	protected OnClickListener btnConsulta = new OnClickListener(){
		public void onClick(View v) {
			ConsultaPaisForm form = new ConsultaPaisForm();
			
			form.setCodigo(((EditText) ActivityHandler.atividade.findViewById(R.id.codigo)).getText().toString());
			form.setCodigoAuxiliar(((EditText) ActivityHandler.atividade.findViewById(R.id.codigoAuxiliar)).getText().toString());
			form.setDescricao(((EditText) ActivityHandler.atividade.findViewById(R.id.descricao)).getText().toString());
			form.setValor(((EditText) ActivityHandler.atividade.findViewById(R.id.valor)).getText().toString());
			
			form.setPaises(consultarPais(form));
			
			ActivityHandler.atividade.setContentView(
					R.layout.resultadodaconsultadepais_consultarpais);
			
			
			preencherResultadoDaConsultaDePais(form);
		}
	};
	public void iniciar(){
		dao = new PaisDAO(ActivityHandler.atividade);
		
		ActivityHandler.atividade.setContentView(
				R.layout.preenchaosdadosdaconsultadepais_consultarpais);
		((Button) ActivityHandler.atividade.findViewById(R.id.consulta)).setOnClickListener(btnConsulta);
		
	}
	private void preencherResultadoDaConsultaDePais(ConsultaPaisForm form){
		try {
			preencherGridPaises(form.getPaises());
		} catch (Exception e) {
			AlertDialog.Builder builder = new AlertDialog.Builder(ActivityHandler.atividade);
			builder.setMessage("Um erro foi encontrado na aplicação").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {/*Não faz nada*/}});
		}
		
	}
	public abstract Collection consultarPais(ConsultaPaisForm form);
	
	public void preencherGridPaises(Collection paises) throws Exception{
		TableLayout t = ((TableLayout)ActivityHandler.atividade.findViewById(R.id.Tabela01));
		for(Object pais : paises){
			TableRow coluna = new TableRow(ActivityHandler.atividade);
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
				TextView campo = new TextView(ActivityHandler.atividade);
				campo.setText((String)getCodigo.invoke(pais, params));
				coluna.addView(campo);				
			}
			if(getValor!=null){
				Object[]params=null;
				TextView campo = new TextView(ActivityHandler.atividade);
				campo.setText((String)getValor.invoke(pais, params));
				coluna.addView(campo);				
			}
			
			t.addView(coluna);
		}
	}
	
}
