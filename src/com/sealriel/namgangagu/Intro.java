package com.sealriel.namgangagu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro extends Activity{
	View mPage1, mPage2;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);

		mPage1 = findViewById(R.id.page1);
		mPage2 = findViewById(R.id.page2);

		findViewById(R.id.btnpage1).setOnClickListener(mClickListener);
		findViewById(R.id.btnpage2).setOnClickListener(mClickListener);
	}

	Button.OnClickListener mClickListener = new Button.OnClickListener() {
		public void onClick(View v) {
			mPage1.setVisibility(View.INVISIBLE);
			mPage2.setVisibility(View.INVISIBLE);
			
			switch (v.getId()) {
			case R.id.btnpage1:
				mPage1.setVisibility(View.VISIBLE);
				break;
			case R.id.btnpage2:
				mPage2.setVisibility(View.VISIBLE);
				break;
			}
		}
	};
}