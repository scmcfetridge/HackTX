package com.hacktx.picwars;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AllGames extends Activity {
	ArrayList<Game> games;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all_games);
		loadListData();
		setListData();
	}
	
	private void loadListData(){
		//load previously existing data from parse
		games = new ArrayList<Game>();
	}

	//take loaded data and push to front end
	private void setListData(){
		//find list view
		ListView lv = (ListView) findViewById(R.id.all_games);
		
		//create an adapter to insert data and listen for clicks
		lv.setAdapter(new ArrayAdapter<Game>(this, android.R.layout.simple_list_item_1, games));
		
		
	}
	

}
