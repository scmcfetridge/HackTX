package com.hacktx.picwars;

import java.util.ArrayList;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ViewGame extends Activity {
	ArrayList<Entry> entries;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_game);
		loadList();
		setListData();
	}
	
	private void loadList(){
		//load previously existing data from parse
		
	}
	
	private void setListData(){
		//take loaded data and push to front end
		ListView list = (ListView) findViewById(R.id.all_entries);
		
		list.setAdapter( new ArrayAdapter<Entry>(this, android.R.layout.simple_list_item_1, entries));
	}
}
