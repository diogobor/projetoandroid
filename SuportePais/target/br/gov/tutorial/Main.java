package br.gov.tutorial;

import android.app.Activity;
import android.os.Bundle;
import br.gov.tutorial.view.cadastroPais.consultaPais.ConsultaPaisControle;
import br.gov.tutorial.view.cadastroPais.consultaPais.ConsultaPaisControleImpl;
import br.ufrj.dcc.impl.ActivityHandler;

public class Main extends Activity {
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	ActivityHandler.activity=this;  	
    	
        ConsultaPaisControle main = new ConsultaPaisControleImpl();
        main.iniciar();
    }
}