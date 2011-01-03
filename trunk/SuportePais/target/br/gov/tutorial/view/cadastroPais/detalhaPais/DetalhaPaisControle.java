package br.gov.tutorial.view.cadastroPais.detalhaPais;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import br.gov.tutorial.R;
import br.gov.tutorial.view.cadastroPais.detalhaPais.form.DetalhaPaisUCForm;
import br.ufrj.dcc.impl.ActivityHandler;

public abstract class DetalhaPaisControle {
	protected OnClickListener btnNovaConsulta = new OnClickListener(){
		public void onClick(View v) {
			//TODO
			ActivityHandler.activity.setContentView(
					R.layout.preenchaosdadosdaconsultadepais_consultarpais);
		}
	};
	public void iniciar(){
		preInit();
		//TODO
		ActivityHandler.activity.setContentView(
				R.layout.detalhamentodopais_detalhapais);
		//TODO
		((Button) ActivityHandler.activity.findViewById(R.id.novaconsulta)).setOnClickListener(btnNovaConsulta);
		recuperaPais(new DetalhaPaisUCForm());
		posInit();
	}
	protected void preInit(){
	}
	protected void posInit(){
	}
	public abstract void recuperaPais(DetalhaPaisUCForm form);
}
