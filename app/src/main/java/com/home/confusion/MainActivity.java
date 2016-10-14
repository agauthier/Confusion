package com.home.confusion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	public static enum Country {
		US, RUSSIA;
	}

	public static final String COUNTRY = "com.home.confusion.Country";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initButton(R.id.play_us_button, Country.US);
		initButton(R.id.play_russia_button, Country.RUSSIA);
	}

	private void initButton(int buttonResId, final Country country) {
		View button = findViewById(buttonResId);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startGridActivity(country);
			}
		});
	}

	private void startGridActivity(Country country) {
		Intent intent = new Intent(this, GridActivity.class);
		intent.putExtra(COUNTRY, country);
		startActivity(intent);
	}
}
