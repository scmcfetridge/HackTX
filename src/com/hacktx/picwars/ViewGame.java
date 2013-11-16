package com.hacktx.picwars;

import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class ViewGame extends Activity implements OnItemClickListener {
	ArrayList<String> entries;
	String userid = "tester";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_game);
		loadDummyList();
		setListData();
	}
	
	private void loadDummyList(){
		entries = new ArrayList<String>();
		entries.add("one");
		entries.add("two");
		entries.add("three");
	}
	
	@SuppressWarnings("unused")
	private void loadList(){
//		//load previously existing data from parse
//		ParseQuery<ParseObject> query = ParseQuery.getQuery("PuzzleData");
//		 query.findInBackground(new FindCallback<ParseObject>() {
//
//			@Override
//			public void done(List<ParseObject> objects, ParseException e) {
//				if (e == null){
//					System.out.println("Query Succeded");
//					for(ParseObject obj: objects)
//						entries = obj.get("GamesList");
//				}
//				else
//					System.out.println("Query unsuccessful");
//				
//			}
//		 });
		
	}
	
	private void setListData(){
		//take loaded data and push to front end
		ListView lv = (ListView) findViewById(R.id.all_entries);
		
		lv.setAdapter( new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, entries));
		lv.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		System.out.println("Clicked!!!!!!!!!!!!!!!!!!");
		
	}
}
