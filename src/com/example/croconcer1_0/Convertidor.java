package com.example.croconcer1_0;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.os.Bundle;

public class Convertidor extends Activity{
	
	ListView list1;
	ListView list2;
	ListView list3;
	String[] medida ={"CENTIMETROS - METROS","METROS - KILOMETROS"
			,"CENTIMETROS - KILOMETROS","KILOMETROS - METROS","PULGADAS - CENTIMETROS"};
	String[] temperatura ={"FARENHEITH - CELSIUS","CELSIUS - FARENHEITH"
			,"CELSIUS - KELVIN","KELVIN - FARENHEITH"};
	String[] masa ={"KILOGRAMO - GRAMO","GRAMO - KILOGRAMO"
			,"MILIGRAMO - KILOGRAMO","KILOGRAMO - MILIGRAMO"};
	
		@SuppressWarnings("unchecked")
		public void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.convertidor_menu);
			
			
			Resources res = getResources();
			 
			TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
			tabs.setup();
			 
			TabHost.TabSpec 
			spec=tabs.newTabSpec("mitab1");
			spec.setContent(R.id.tab1);
			spec.setIndicator("MEDIDA",
			    res.getDrawable(android.R.drawable.ic_menu_help));
			tabs.addTab(spec);
			 
			spec=tabs.newTabSpec("mitab2");
			spec.setContent(R.id.tab2);
			spec.setIndicator("TEMPERATURA",
			    res.getDrawable(android.R.drawable.ic_menu_help));
			tabs.addTab(spec);
			
			spec=tabs.newTabSpec("mitab3");
			spec.setContent(R.id.tab3);
			spec.setIndicator("MASA",
			    res.getDrawable(android.R.drawable.ic_dialog_alert));
			tabs.addTab(spec);
			 
			tabs.setCurrentTab(0);
			
			list1 = (ListView) findViewById(R.id.listView1);
			
			list1.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,medida));
			list1.setOnItemClickListener(new OnItemClickListener(){
				public void onItemClick(AdapterView<?> parent,View view,
						int position,long id){
					switch(position){
					
					case 0:	
							lanzarConvertidorOperaciones("m1");
							break;
					case 1:
							lanzarConvertidorOperaciones("m2");
							break;
					case 2: 
							lanzarConvertidorOperaciones("m3");
							break;
					case 3: 
							lanzarConvertidorOperaciones("m4");
							break;
					case 4:	
							break;
					}
					System.out.println("posicion:" + position +" ID:"+ id);
					
				}		
			});
			
			list2 = (ListView) findViewById(R.id.listView2);
			list2.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,temperatura));
			list2.setOnItemClickListener(new OnItemClickListener(){
				public void onItemClick(AdapterView<?> parent,View view,
						int position,long id){
					switch(position){
					
					case 0:	
							lanzarConvertidorOperaciones("t1");
							break;
					case 1:
							lanzarConvertidorOperaciones("t2");
							break;
					case 2: 
							lanzarConvertidorOperaciones("t3");
							break;
					case 3: 
							lanzarConvertidorOperaciones("t4");
							break;
					case 4:	
							break;
					}
				}		
			});
			
			
			list3 = (ListView) findViewById(R.id.listView3);
			list3.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,masa));
			list3.setOnItemClickListener(new OnItemClickListener(){
				public void onItemClick(AdapterView<?> parent,View view,
						int position,long id){
					switch(position){
					
					case 0:	
							lanzarConvertidorOperaciones("ma1");
							break;
					case 1:
							lanzarConvertidorOperaciones("ma2");
							break;
					case 2: 
							lanzarConvertidorOperaciones("ma3");
							break;
					case 3: 
							lanzarConvertidorOperaciones("ma4");
							break;
					case 4:	
							break;
					}
				}		
			});
			
		}
		
		public void lanzarConvertidorOperaciones(String ope){
			Intent i = new Intent(this,OperacionesConvertidor.class);
			i.putExtra("operacion", ope);
			startActivity(i);
		}
		
		
}
