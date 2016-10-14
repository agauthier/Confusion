package com.home.confusion;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;

public class SpreadedGridLayout extends LinearLayout {

	private final List<LinearLayout> buttons = new ArrayList<LinearLayout>();

	public SpreadedGridLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		int width = getMeasuredWidth();
		int height = getMeasuredHeight();
		createGridLayout(width, height, 14, 13);
		setMeasuredDimension(width, height);
	}

	private void createGridLayout(int width, int height, int nbColumns, int nbRows) {
		transferButtonsToList();
		int colWidth = width / nbColumns;
		int rowHeight = height / nbRows;
		LinearLayout newLinearLayout = null;
		for (int i = 0; i < buttons.size(); i++) {
			if (i % nbColumns == 0) {
				newLinearLayout = new LinearLayout(getContext());
				measureLayout(newLinearLayout, width, rowHeight, Gravity.LEFT);
				addView(newLinearLayout);
			}
			measureLayout(buttons.get(i), colWidth, rowHeight, Gravity.CENTER);
			newLinearLayout.addView(buttons.get(i));
		}
	}

	private void transferButtonsToList() {
		if (buttons.size() == 0) {
			for (int i = 0; i < getChildCount(); i++) {
				buttons.add((LinearLayout) getChildAt(i));
			}
		} else {
			for (int i = 0; i < getChildCount(); i++) {
				((LinearLayout) getChildAt(i)).removeAllViews();;
			}
		}
		removeAllViews();
	}

	private void measureLayout(LinearLayout layout, int width, int height, int gravity) {
		layout.measure(MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY));
		layout.setGravity(gravity);
	}
}
