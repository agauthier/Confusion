package com.home.confusion;

import com.home.confusion.GridPageFragment.SpiesSide;
import com.home.confusion.MainActivity.Country;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagesAdapter extends FragmentPagerAdapter {

	private static final int NB_PAGES = 2;
	private final Country country;
	
	public <T extends Fragment> PagesAdapter(FragmentManager fragmentManager, Country country) {
		super(fragmentManager);
		this.country = country;
	}

	@Override
	public Fragment getItem(int position) {
		return new GridPageFragment(country, SpiesSide.get(position));
	}

	@Override
	public int getCount() {
		return NB_PAGES;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return SpiesSide.get(position).getString();
	}
}
