package com.fr4gus.android.oammblo.ui;

import android.content.Intent;
import android.os.Bundle;

import com.fr4gus.android.oammblo.LoginActivity;
import com.fr4gus.android.oammblo.R;


/**
 * Shows App logo for few seconds.
 * 
 * @author Franklin Garcia
 * Created Mar 25, 2012
 */
public class SplashActivity extends OammbloActivity {

	 protected boolean active = true;
	 protected int splashTime = 2000;
	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        Thread splashThread = new Thread(){
            @Override
            public void run(){
             try{
              int waited = 0;
              while(active && (waited < splashTime)){
               sleep(100);
               if(active){
                waited += 100;
               }
               
              }
             } catch(InterruptedException e){
              
             } finally{
              openApp();
             // stop();
             }
             
            }
           };
           splashThread.start();
       }
    
    private void openApp(){
        finish();
        startActivity(new Intent(this,LoginActivity.class));
       }

}
