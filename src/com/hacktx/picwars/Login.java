package com.hacktx.picwars;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.parse.Parse;
import com.parse.ParseAnalytics;

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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		parseSetup();
		
		// Add code to print out the key hash
	    try {
	        PackageInfo info = getPackageManager().getPackageInfo(
	                "com.hacktx.picwars", 
	                PackageManager.GET_SIGNATURES);
	        for (Signature signature : info.signatures) {
	            MessageDigest md = MessageDigest.getInstance("SHA");
	            md.update(signature.toByteArray());
	            Log.d("KeyHash", "TESTING");
	            Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
	            }
	    } catch (NameNotFoundException e) {

	    } catch (NoSuchAlgorithmException e) {

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
