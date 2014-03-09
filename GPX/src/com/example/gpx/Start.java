package com.example.gpx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Start extends Activity implements OnClickListener{
	
	Button num1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.num_main);
		
		num1 = (Button) findViewById(R.id.num1); 
        num1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v.getId() == R.id.num1){
		Intent in1 = new Intent ("com.example.gpx.MENUI");
		startActivity(in1);
		}
		
	}

	

}
