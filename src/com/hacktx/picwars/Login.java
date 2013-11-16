package com.hacktx.picwars;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.hacktx.fragments.LoginFragment;
import com.parse.Parse;
import com.parse.ParseAnalytics;

<<<<<<< HEAD
public class Login extends FragmentActivity {
	
	private LoginFragment mainFragment;
=======
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class Login extends Activity {
>>>>>>> f4a1c5d7c7c9ede21dabe63721f418b7325c077c

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    if (savedInstanceState == null) {
	        // Add the fragment on initial activity setup
	        mainFragment = new LoginFragment();
	        getSupportFragmentManager()
	        .beginTransaction()
	        .add(android.R.id.content, mainFragment)
	        .commit();
	    } else {
	        // Or set the fragment from restored state info
	        mainFragment = (LoginFragment) getSupportFragmentManager()
	        .findFragmentById(android.R.id.content);
	    }
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
	
	public void test(View view){
		Intent intent = new Intent(this, AllGames.class);
		startActivity(intent);
	}

}
