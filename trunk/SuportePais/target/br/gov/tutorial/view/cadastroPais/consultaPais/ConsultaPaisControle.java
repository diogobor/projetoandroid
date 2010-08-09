package br.gov.tutorial.view.cadastroPais.consultaPais;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import br.gov.tutorial.ActivityHandler;
import br.gov.tutorial.R;
import br.gov.tutorial.view.cadastroPais.consultaPais.form.ConsultaPaisForm;

public abstract class ConsultaPaisControle {
	protected OnClickListener btnConsulta = new OnClickListener(){
		public void onClick(View v) {
			ConsultaPaisForm form = new ConsultaPaisForm();
			
			form.setCodigo(((EditText) ActivityHandler.atividade.findViewById(R.id.codigo)).getText().toString());
			form.setCodigoAuxiliar(((EditText) ActivityHandler.atividade.findViewById(R.id.codigoAuxiliar)).getText().toString());
			form.setDescricao(((EditText) ActivityHandler.atividade.findViewById(R.id.descricao)).getText().toString());
			form.setValor(((EditText) ActivityHandler.atividade.findViewById(R.id.valor)).getText().toString());
			
			consultarPais(form);
			
			ActivityHandler.atividade.setContentView(
					R.layout.resultadodaconsultadepais_consultarpais);
			preencherResultadoDaConsultaDePais(form);
		}
	};
	public void iniciar(){
		ActivityHandler.atividade.setContentView(
				R.layout.preenchaosdadosdaconsultadepais_consultarpais);
		((Button) ActivityHandler.atividade.findViewById(R.id.consulta)).setOnClickListener(btnConsulta);
		
	}
	private void preencherResultadoDaConsultaDePais(ConsultaPaisForm form){
		((TextView) ActivityHandler.atividade.findViewById(R.id.codigo)).setText(form.getCodigo());
		((TextView) ActivityHandler.atividade.findViewById(R.id.codigoAuxiliar)).setText(form.getCodigoAuxiliar());
		((TextView) ActivityHandler.atividade.findViewById(R.id.valor)).setText(form.getValor());
		((TextView) ActivityHandler.atividade.findViewById(R.id.descricao)).setText(form.getDescricao());
		
	}
	public abstract void consultarPais(ConsultaPaisForm form);
	
}
