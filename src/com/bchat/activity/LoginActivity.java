package com.bchat.activity;

import java.io.InputStream;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.bchat.R;
import com.bchat.service.Chatter;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends ActionBarActivity implements View.OnClickListener {
	private final String TAG = "Login activity";
	//private Toolbar toolbar;
	private EditText username;
	private EditText password;
	private Button login;
	private TextView forgotPassword;
	private TextView signup;
	private TextView noInternet;
	
	private Chatter.Client client;
	private TTransport transport;
	private final int SERVER_PORT = 3333;
	private final String SERVER_IP = "localhost";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		//get view
		username = (EditText)findViewById(R.id.editTextID);
		password = (EditText)findViewById(R.id.editTextPass);
		login = (Button)findViewById(R.id.buttonLogin);
		forgotPassword = (TextView)findViewById(R.id.textViewForgotPassword);
		signup = (TextView)findViewById(R.id.textViewSignup);
		noInternet = (TextView)findViewById(R.id.textViewNoInternet);
		
		//set listener
		login.setOnClickListener((View.OnClickListener)this);
		forgotPassword.setOnClickListener((View.OnClickListener)this);
		signup.setOnClickListener((View.OnClickListener)this);
		
		//init connect to server
		//if (hasConnectToInternet())
			//initConnection();
		
		
		
		// Creating The Toolbar and setting it as the Toolbar for the activity
		 
        //toolbar = (Toolbar) findViewById(R.id.tool_bar);
        //setSupportActionBar(toolbar);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void initConnection(){
		try {
			transport = new TSocket(SERVER_IP , SERVER_PORT);
			transport.open();
			
			TProtocol protocol = new  TBinaryProtocol(transport);
			client = new Chatter.Client(protocol);
			
			Log.e(TAG, "connect ok");
		}
		catch (TTransportException e){
			Log.e(TAG, "connect fail");
		}
	}
	
	public void btnLogin_onClick(View view){
		
		if(!hasConnectToInternet()){
			new AlertDialog.Builder(this)
		    .setTitle("No Internet Connection")
		    .setMessage("Please enable your internet connection!")
		    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) { 
		        	
		        }
		     })
		     .setIcon(android.R.drawable.ic_dialog_alert).show();
			return;
		}
		
		final ProgressDialog progressDialog = new ProgressDialog(this, R.style.Base_Theme_AppCompat_Dialog);
		progressDialog.setMessage("Authenticating...");
		//progressDialog.setIndeterminate(true);
		progressDialog.show();
		
		
		
		
		new android.os.Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Log.e(TAG, "close loading");
				progressDialog.dismiss();
			}
		}, 6000);
		
				
		while (true){
			if (!progressDialog.isShowing())
				break;
		}
		
//		String username = this.username.getText().toString();
//		String pass = this.password.getText().toString();
//		boolean loginStatus;
//		try {
//			loginStatus = client.login(username, pass);
//		} catch (TException e) {
//			// TODO Auto-generated catch block
//			Log.e(TAG, "login fail");
//			loginStatus = false;
//			e.printStackTrace();
//		}
//		
//		if (loginStatus){
//			Intent intent = new Intent(this, MainActivity.class);
//			startActivity(intent);
//		}
//			
		
		
		Log.e(TAG, "sign-in done");
		
		
		//finish();
	}
	
	public void btnSignup_onClick(View v){
		Intent intent = new Intent(this, ChatActivity.class);
		startActivity(intent);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.buttonLogin:
			btnLogin_onClick(v);
			break;

		case R.id.textViewForgotPassword:			
			break;
			
		case R.id.textViewSignup:
			btnSignup_onClick(v);
			break;
			
		default:
			break;
		}
		
	}
	
	public boolean hasConnectToInternet(){
		boolean status = false;
		ConnectivityManager connMgr = (ConnectivityManager) 
		        getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
	    if (networkInfo != null && networkInfo.isConnected()) {
	        // has internet
	    	noInternet.setVisibility(View.GONE);
	    	status = true;
	    } else {
	        // no internet
	    	noInternet.setVisibility(View.VISIBLE);    	
	    	
	    	status = false;
	    }
		return status;
	}
}
