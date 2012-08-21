package com.fr4gus.android.oammblo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class LoginActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }
    
    /**Llamado cuando se activa el botón send*/
    public void conectarseTwitter(View view){
    	Intent intent = new Intent(this, TimeLineActivity.class);

    	//EditText editText = (EditText) findViewById(R.id.editText1);
    	//editText.setText("");
    	//editText= (EditText) findViewById(R.id.editUser);
    	//editText.setText("");
    	startActivity(intent);	
    }
    
}
