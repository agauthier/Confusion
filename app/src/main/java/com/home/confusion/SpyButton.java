package com.home.confusion;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SpyButton extends LinearLayout {

	public SpyButton(Context context, String text) {
		super(context);
		LayoutInflater.from(context).inflate(R.layout.spy_letter, this);
		final TextView textView = (TextView) findViewById(R.id.letter);
		textView.setText(text);
		textView.setTextColor(Color.WHITE);
		textView.setTypeface(Typeface.create(Typeface.SERIF, Typeface.BOLD));
	}

	public SpyButton(Context context, int backgroundResId) {
		super(context);
		LayoutInflater.from(context).inflate(R.layout.spy_button, this);
		final Button button = (Button) findViewById(R.id.button);
		button.setBackgroundResource(backgroundResId);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (button.isSelected()) {
					button.setSelected(false);
					setAlpha(1.0f);
				} else {
					button.setSelected(true);
					setAlpha(0.5f);
				}
			}
		});
	}
}
