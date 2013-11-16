package com.hacktx.picwars;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AllGames extends Activity implements OnItemClickListener {
	ArrayList<String> games;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all_games);
		loadListData();
		setListData();
	}
	
	private void loadListData(){
		//load previously existing data from parse
		games = new ArrayList<String>();
		games.add("Tacos");
		games.add("Ugly Face");
		games.add("Dogs");
	}

	//take loaded data and push to front end
	private void setListData(){
		//find list view
		ListView lv = (ListView) findViewById(R.id.all_games);
		
		//create an adapter to insert data and listen for clicks
		lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, games));
		lv.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		Intent intent = new Intent(this, ViewGame.class);
		startActivity(intent);
	}
	
	
}
