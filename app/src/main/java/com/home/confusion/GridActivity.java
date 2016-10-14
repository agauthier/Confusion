package com.home.confusion;

import com.home.confusion.GridPageFragment.SpiesSide;
import com.home.confusion.MainActivity.Country;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;

public class GridActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setTitle(SpiesSide.MY_SPIES.getString());
		setContentView(R.layout.activity_grids);
		Bundle extras = getIntent().getExtras();
		initPages((Country) extras.get(MainActivity.COUNTRY));
	}
	
	private <T extends Fragment> void initPages(Country country) {
		final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
		if (viewPager != null) {
			viewPager.setAdapter(new PagesAdapter(getSupportFragmentManager(), country));
			viewPager.addOnPageChangeListener(new SimpleOnPageChangeListener() {
				@Override public void onPageSelected(int position) {
					super.onPageSelected(position);
					getActionBar().setTitle(viewPager.getAdapter().getPageTitle(position));
				}
			});
		}
	}
}
