package com.hacktx.picwars;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Login extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		parseSetup();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}
	
	private void parseSetup(){
		Parse.initialize(this, "6xMmCvXeB12R6L2p9DvoYbUnHHMITaPuz0PM1Jrx", "m2Qka0510lN2c6MwFy4m1CRGAOFXb2XYRBJXzlJU");

		ParseAnalytics.trackAppOpened(getIntent());
	}

}
