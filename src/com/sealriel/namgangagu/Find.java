package com.sealriel.namgangagu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Find extends Activity {
	View mBus, mTrain,mCar,mTourism;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.find);

		mBus = findViewById(R.id.bus);
		mTrain = findViewById(R.id.train);
		mCar = findViewById(R.id.car);
		mTourism = findViewById(R.id.tourism);
		
		findViewById(R.id.btnbus).setOnClickListener(mClickListener);
		findViewById(R.id.btntrain).setOnClickListener(mClickListener);
		findViewById(R.id.btncar).setOnClickListener(mClickListener);
		findViewById(R.id.btntourism).setOnClickListener(mClickListener);
	}

	Button.OnClickListener mClickListener = new Button.OnClickListener() {
		public void onClick(View v) {
			mBus.setVisibility(View.INVISIBLE);
			mTrain.setVisibility(View.INVISIBLE);
			mCar.setVisibility(View.INVISIBLE);
			mTourism.setVisibility(View.INVISIBLE);
			switch (v.getId()) {
			case R.id.btnbus:
				mBus.setVisibility(View.VISIBLE);
				break;
			case R.id.btntrain:
				mTrain.setVisibility(View.VISIBLE);
				break;
			case R.id.btncar:
				mCar.setVisibility(View.VISIBLE);
				break;
			case R.id.btntourism:
				mTourism.setVisibility(View.VISIBLE);
				break;
			}
		}
	};
}