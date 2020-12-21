package com.fathur.moviecatalog.home;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.fathur.moviecatalog.R;
import com.fathur.moviecatalog.ui.favorite.FragmentFavorite;
import com.fathur.moviecatalog.ui.movies.MovieFragment;
import com.fathur.moviecatalog.ui.tvshow.TVShowFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Bundle bundle = new Bundle();
    private BottomNavigationView navigation;


    private boolean loadFragment(Fragment fragment) {
        Log.d(TAG, "frag_name : " + fragment);
        fragment.setArguments(bundle);
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
            return true;
        }
        return false;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bundle.putInt("message", 0);
        loadFragment(new MovieFragment());

        navigation = findViewById(R.id.navigationView);
        navigation.setOnNavigationItemSelectedListener(this);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
            getSupportActionBar().setTitle("Movie");
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.navigation_movies:
                bundle.putInt("message", 0);
                getSupportActionBar().setTitle("Movie");
                fragment = new MovieFragment();
                break;

            case R.id.navigation_tvshow:
                bundle.putInt("message", 0);
                getSupportActionBar().setTitle("TV Show");
                fragment = new TVShowFragment();
                break;

            case R.id.navigation_favorite:
                getSupportActionBar().setTitle("Favorite");
                fragment = new FragmentFavorite();
                break;
        }


        return loadFragment(fragment);
    }
}