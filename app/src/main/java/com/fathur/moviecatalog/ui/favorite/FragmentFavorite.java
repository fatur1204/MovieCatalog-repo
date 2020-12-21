package com.fathur.moviecatalog.ui.favorite;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.fathur.moviecatalog.R;
import com.fathur.moviecatalog.ui.movies.MovieFragment;
import com.fathur.moviecatalog.ui.tvshow.TVShowFragment;
import com.google.android.material.tabs.TabLayout;

public class FragmentFavorite extends Fragment {
    private static final String TAG = FragmentFavorite.class.getSimpleName();
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.movie, R.string.tvshow};
    Fragment fragment;
    private Bundle bundle = new Bundle();


    public FragmentFavorite() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_favorite, container, false);


        View rootView = inflater.inflate(R.layout.fragment_favorite, container, false);
        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.view_pager);
        TabLayout tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);

        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        Log.d(TAG, "fragment_movies");
                        return new MovieFragment();
                    case 1:
                        Log.d(TAG, "fragment_tvshow");
                        return new TVShowFragment();
                    default:
                        return new Fragment();
                }
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return getResources().getString(TAB_TITLES[position]);
            }

            @Override
            public int getCount() {
                return 2;
            }
        });

        tabLayout.setupWithViewPager(viewPager);
        return rootView;
    }
}