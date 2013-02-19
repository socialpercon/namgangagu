package com.sealriel.namgangagu;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class NamgangActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.btnnamgang).setOnClickListener(mClickListener);
        findViewById(R.id.btntel).setOnClickListener(mClickListener);
        findViewById(R.id.btneffect).setOnClickListener(mClickListener);
        findViewById(R.id.btnsocial).setOnClickListener(mClickListener);
        findViewById(R.id.btnnotify).setOnClickListener(mClickListener);
        findViewById(R.id.btncome).setOnClickListener(mClickListener);
        findViewById(R.id.btnmenu).setOnClickListener(mClickListener);
        
    }
    
    Button.OnClickListener mClickListener = new Button.OnClickListener() {
    	public void onClick(View v) {
    		Intent intent;
    		switch(v.getId()){
    		case R.id.btnnamgang:
        		intent = new Intent(NamgangActivity.this, Intro.class);
        		startActivityForResult(intent,0);    
    			break;
    		case R.id.btntel:
                intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+"0557423188"));
                startActivity(intent);
    			break;
    		case R.id.btneffect:
    			intent = new Intent(NamgangActivity.this, CustomWebView.class);
        		startActivityForResult(intent,0);  
    			break;
    		case R.id.btnsocial:
        		intent = new Intent(NamgangActivity.this, CustomWebView.class);
        		startActivityForResult(intent,0);    			
    			break;
    		case R.id.btnnotify:
        		intent = new Intent(NamgangActivity.this, CustomWebView.class);
        		startActivityForResult(intent,0);
    			break;
    		case R.id.btncome:
    			intent = new Intent(NamgangActivity.this, Find.class);
        		startActivityForResult(intent,0);    
    			break;
    		case R.id.btnmenu:
    			intent = new Intent(NamgangActivity.this, CustomWebView.class);
        		startActivityForResult(intent,0); 
    			break;
    		}
    	}
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    

}

