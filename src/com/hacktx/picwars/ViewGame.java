package com.hacktx.picwars;

import java.util.ArrayList;
import java.util.List;
import com.parse.*;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ViewGame extends Activity {
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

	}
	
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
		ListView list = (ListView) findViewById(R.id.all_entries);
		
		list.setAdapter( new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, entries));
	}
}
