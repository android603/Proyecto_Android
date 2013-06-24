package com.example.croconcer1_0;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.*;
import android.view.View.*;
import android.widget.Button;

public class Principal extends Activity {

	private Button btnConvertidor;
	private Button btnCronometro;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
	
		btnConvertidor =(Button) findViewById(R.id.button1);
		btnConvertidor.setOnClickListener(new  OnClickListener(){
			public void onClick(View view){
				lanzarConvertidor();
			}
		});
		
		
		
		btnCronometro =(Button) findViewById(R.id.button2);
		btnCronometro.setOnClickListener(new  OnClickListener(){
			public void onClick(View view){
				lanzarCronometro();
			}
		});
	}
	
	public void lanzarCronometro(){
		Intent i = new Intent(this,Cronometro.class);
		startActivity(i);
	}
	
	public void lanzarConvertidor(){
		Intent i = new Intent(this,Convertidor.class);
		startActivity(i);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}
	
	
	
	
	

}
