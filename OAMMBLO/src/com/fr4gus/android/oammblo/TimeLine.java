package com.fr4gus.android.oammblo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
//import android.widget.EditText;

public class TimeLine extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_time_line, menu);
        return true;
    }
    
    /**Llamado cuando se activa el bot�n send*/
    public void sendMessage(View view){
    	Intent intent = new Intent(this, Login.class);

    	//EditText editText = (EditText) findViewById(R.id.editText1);
    	//editText.setText("");
    	//editText= (EditText) findViewById(R.id.editUser);
    	//editText.setText("");
    	
    	startActivity(intent);
    	
    	

    	
    }
}
