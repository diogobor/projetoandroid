package br.gov.tutorial.view.cadastroPais.detalhaPais;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import br.gov.tutorial.ActivityHandler;
import br.gov.tutorial.R;
import br.gov.tutorial.view.cadastroPais.detalhaPais.form.DetalhaPaisUCForm;

public abstract class DetalhaPaisControle {
	protected OnClickListener btnNovaConsulta = new OnClickListener(){
		public void onClick(View v) {
			
			ActivityHandler.atividade.setContentView(
					R.layout.preenchaosdadosdaconsultadepais_consultarpais);
		}
	};
	public void iniciar(){
		preInit();
		ActivityHandler.atividade.setContentView(
				R.layout.detalhamentodopais_detalhapais);
		((Button) ActivityHandler.atividade.findViewById(R.id.novaconsulta)).setOnClickListener(btnNovaConsulta);
		recuperaPais(new DetalhaPaisUCForm());
		posInit();
	}
	protected void preInit(){
	}
	protected void posInit(){
	}
	public abstract void recuperaPais(DetalhaPaisUCForm form);
}
