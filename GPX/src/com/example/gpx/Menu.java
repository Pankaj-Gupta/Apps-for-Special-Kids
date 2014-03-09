package com.example.gpx;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class Menu extends ListActivity {

	String classes[] = { "Level1", "Level2", "Level3" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this,
				android.R.layout.simple_list_item_1, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	// here position refers to the index of array classes[]
	{
		// TODO Auto-generated method stub

		super.onListItemClick(l, v, position, id);
		
		String cheese = classes[position];
		// different method for Intent using Class variable
		if (cheese == classes[0] ) {

				Intent in = new Intent("com.example.gpx.HELLO");
				startActivity(in);
		}
		
		if(cheese == classes[1])
		{
			Intent in1 =new Intent ("com.example.gpx.MAINACTIVITY");
			startActivity(in1);
		}
		
		

	}

}