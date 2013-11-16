package com.example.picwars;

import android.widget.ListView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ViewGame extends Activity {
	
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
		ListView list = (ListView) findViewById(R.id.view_games);
		
		list.setAdapter( new ArrayAdapter<Entry>(this, android.R.layout.simple_list_item_1, entry);
	}
}
