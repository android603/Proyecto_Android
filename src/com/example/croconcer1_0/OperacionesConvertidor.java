package com.example.croconcer1_0;

import android.app.Activity;
import android.os.Bundle;

public class OperacionesConvertidor extends Activity{


	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.convertidor_operacion);
		Bundle extras = getIntent().getExtras();
		String operacion;
		//EditText text = findViewById(R.id.editText1);

	}
	
	public float centimetrosMetros(float cantidad){
		float metros = cantidad / 100;
		return metros;
	}
	
	public float metrosKilometros(float cantidad){
			float kilometros = cantidad / 1000;
			return kilometros;
		}
	
	public float centimetrosKilometros(float cantidad){
		float centimetros = cantidad / 10000;
		return centimetros;
	}
	
	public float kilometrosMetros(float cantidad){
			float kilometros = cantidad * 1000;
			return kilometros;
	}
	
	public float pulgadasCentimetros(float cantidad){
		return 0;
	}
	
	public float farenheithCensius(){
		return 0;
	}
	

}
