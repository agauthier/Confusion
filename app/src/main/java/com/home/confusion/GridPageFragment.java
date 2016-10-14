package com.home.confusion;

import com.home.confusion.MainActivity.Country;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GridPageFragment extends Fragment {

	private static final String[] letters = {"A", "C", "E", "H", "K", "L", "N", "O", "P", "S", "T", "V", "X"};
	
	public static enum SpiesSide {
		MY_SPIES(0, "My Spies"), OPPONENTS_SPIES(1, "Opponent's Spies");
		
		private final int index;
		private final String string;
		
		private SpiesSide(int index, String string) {
			this.index = index;
			this.string = string;
		}
		
		public String getString() {
			return string;
		}
		
		public static SpiesSide get(int index) {
			for (SpiesSide value : values()) {
				if (value.index == index) {
					return value;
				}
			}
			throw new IllegalArgumentException("Invalid index: " + index);
		}
	}
	
	private final Country country;
	private final SpiesSide spiesSide;
	
	public GridPageFragment(Country country, SpiesSide spiesSide) {
		this.country = country;
		this.spiesSide = spiesSide;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.grid_page, container, false);
		SpreadedGridLayout grid = (SpreadedGridLayout) view.findViewById(R.id.grid);
		if (country == Country.US) {
			if (spiesSide == SpiesSide.MY_SPIES) {
				fillGridUSMine(grid);
			} else {
				fillGridUSOpponent(grid);
			}
		} else {
			if (spiesSide == SpiesSide.MY_SPIES) {
				fillGridRussiaMine(grid);
			} else {
				fillGridRussiaOpponent(grid);
			}
		}
		return view;
	}

	private void fillGridUSMine(SpreadedGridLayout grid) {
		for (String letter : letters) {
			grid.addView(new SpyButton(getContext(), letter));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy01));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy02));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy03));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy04));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy05));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy06));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy07));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy08));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy09));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy10));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy11));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy12));
			grid.addView(new SpyButton(getContext(), R.drawable.us_my_spy13));
		}
	}

	private void fillGridUSOpponent(SpreadedGridLayout grid) {
		for (String letter : letters) {
			grid.addView(new SpyButton(getContext(), letter));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy01));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy02));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy03));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy04));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy05));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy06));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy07));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy08));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy09));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy10));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy11));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy12));
			grid.addView(new SpyButton(getContext(), R.drawable.us_opp_spy13));
		}
	}

	private void fillGridRussiaMine(SpreadedGridLayout grid) {
		for (String letter : letters) {
			grid.addView(new SpyButton(getContext(), letter));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy01));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy02));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy03));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy04));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy05));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy06));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy07));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy08));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy09));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy10));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy11));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy12));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_my_spy13));
		}
	}

	private void fillGridRussiaOpponent(SpreadedGridLayout grid) {
		for (String letter : letters) {
			grid.addView(new SpyButton(getContext(), letter));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy01));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy02));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy03));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy04));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy05));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy06));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy07));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy08));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy09));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy10));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy11));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy12));
			grid.addView(new SpyButton(getContext(), R.drawable.rus_opp_spy13));
		}
	}
}
