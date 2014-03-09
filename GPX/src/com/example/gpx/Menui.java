package com.example.gpx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menui extends Activity implements OnClickListener{
	
	Button num1, num2, num3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.num_menu);
		
		num1 = (Button) findViewById(R.id.num1); 
        num1.setOnClickListener(this);
        
        num2 = (Button) findViewById(R.id.num2); 
        num2.setOnClickListener(this);
        
        //num3 = (Button) findViewById(R.id.num3); 
       // num3.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId() == R.id.num1){
			Intent in1 =new Intent ("com.example.gpx.HELLO");
			startActivity(in1);
			}
		
		if(v.getId() == R.id.num2){
			Intent in2 =new Intent ("com.example.gpx.MAINACTIVITY");
			startActivity(in2);
			}
		
		
	}

}
