package com.fathur.moviecatalog.ui.detail;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.fathur.moviecatalog.R;
import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.databinding.ActivityDetailMovieBinding;
import com.fathur.moviecatalog.databinding.ContentDetailMoviesBinding;
import com.fathur.moviecatalog.ui.movies.viewmodel.ViewModelFactory;

public class DetailMovieActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIES = "extra_movies";
    public static final String EXTRA_VAL = "extra_val";
    private final String TAG = DetailMovieActivity.class.getCanonicalName();
    public boolean IsACTIVE = false;
    DetailMovieViewModel viewModel;
    DetailMovieAdapter adapter = new DetailMovieAdapter();
    ActivityDetailMovieBinding activityDetailMovieBinding;
    private ContentDetailMoviesBinding contentDetailMoviesBinding;
    private String extra_data;
    private Menu menu;
    private String movieId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        activityDetailMovieBinding = ActivityDetailMovieBinding.inflate(getLayoutInflater());
        contentDetailMoviesBinding = activityDetailMovieBinding.detailContent;

        setContentView(activityDetailMovieBinding.getRoot());

        setSupportActionBar(activityDetailMovieBinding.toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        extra_data = getIntent().getStringExtra(EXTRA_VAL);
        Log.d(TAG, "extra_val : " + extra_data);

        if (extra_data.length() < 1) {
            IsACTIVE = false;
        } else {
            IsACTIVE = true;
        }

        Log.d(TAG, "extra_val : " + IsACTIVE);
        ViewModelFactory factory = ViewModelFactory.getInstance(this);

        viewModel = new ViewModelProvider(this, factory).get(DetailMovieViewModel.class);

        adapter = new DetailMovieAdapter();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            movieId = extras.getString(EXTRA_MOVIES);
            Log.d(TAG, "data extra : " + movieId);

            if (movieId != null) {
                viewModel.setMovieId(movieId);
                activityDetailMovieBinding.content.setVisibility(View.GONE);

                if (!IsACTIVE) {
                    viewModel.movieModuleId.observe(this, moviewithModule -> {
                        if (moviewithModule != null) {
                            switch (moviewithModule.status) {
                                case LOADING:
                                    activityDetailMovieBinding.progressBar.setVisibility(View.VISIBLE);
                                    break;
                                case SUCCESS:
                                    if (moviewithModule.data != null) {
                                        activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                                        activityDetailMovieBinding.content.setVisibility(View.VISIBLE);
                                        adapter.setMovieDetail(moviewithModule.data.mModules);
                                        adapter.notifyDataSetChanged();
                                        populateMovie(moviewithModule.data.mMovies);
                                    }
                                    break;
                                case ERROR:
                                    activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                                    Toast.makeText(getApplicationContext(), "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                                    break;
                            }
                        }
                    });
                } else {
                    viewModel.tvmoduleId.observe(this, tvwithmodule -> {
                        if (tvwithmodule != null) {
                            switch (tvwithmodule.status) {
                                case LOADING:
                                    activityDetailMovieBinding.progressBar.setVisibility(View.VISIBLE);
                                    break;
                                case SUCCESS:
                                    if (tvwithmodule.data != null) {
                                        activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                                        activityDetailMovieBinding.content.setVisibility(View.VISIBLE);
                                        adapter.setTVShowDetail(tvwithmodule.data.mModulesTv);
                                        adapter.notifyDataSetChanged();
                                        populateTVShow(tvwithmodule.data.mdataTv);
                                    }
                                    break;
                                case ERROR:
                                    activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                                    Toast.makeText(getApplicationContext(), "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                                    break;
                            }
                        }
                    });
                }
            }
        }
    }

    private void populateMovie(MovieEntity movieEntity) {
        contentDetailMoviesBinding.textTitle.setText(movieEntity.getTitle());
        contentDetailMoviesBinding.textDescription.setText(movieEntity.getDescription());
        contentDetailMoviesBinding.txtWritername.setText(movieEntity.getWriterfilm());

        Glide.with(this)
                .load(movieEntity.getImagePath())
                .transform(new RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(contentDetailMoviesBinding.imagePoster);
    }

    private void populateTVShow(TvShowEntity tvShowEntity) {
        contentDetailMoviesBinding.textTitle.setText(tvShowEntity.getTitle());
        contentDetailMoviesBinding.textDescription.setText(tvShowEntity.getDescription());
        contentDetailMoviesBinding.txtWritername.setText(tvShowEntity.getWriteFilm());

        Glide.with(this)
                .load(tvShowEntity.getImagePath())
                .transform(new RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(contentDetailMoviesBinding.imagePoster);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        this.menu = menu;
        if (!IsACTIVE) {
            //Movie With Module
            viewModel.movieModuleId.observe(this, courseWithModule -> {
                if (courseWithModule != null) {
                    switch (courseWithModule.status) {
                        case LOADING:
                            activityDetailMovieBinding.progressBar.setVisibility(View.VISIBLE);
                            break;
                        case SUCCESS:
                            if (courseWithModule.data != null) {
                                activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                                boolean state = courseWithModule.data.mMovies.isSelectMovie();
                                setSelectedMovie(state);
                            }
                            break;
                        case ERROR:
                            activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                            Toast.makeText(getApplicationContext(), "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });

            //Movie with Favourite
            viewModel.moviefavid.observe(this, courseWithModule -> {
                Log.d(TAG, "data_movie_show : " + courseWithModule);
                if (courseWithModule != null) {
                    switch (courseWithModule.status) {
                        case LOADING:
                            activityDetailMovieBinding.progressBar.setVisibility(View.VISIBLE);
                            break;
                        case SUCCESS:
                            if (courseWithModule.data != null) {
                                activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                                boolean state = courseWithModule.data.mdataMovieFav.isSelectMovie();
                                setSelectedMovie(state);
                            }
                            break;
                        case ERROR:
                            activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                            Toast.makeText(getApplicationContext(), "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });
        } else {
            //tv with module
            viewModel.tvmoduleId.observe(this, tvmoduleid -> {
                if (tvmoduleid != null) {
                    switch (tvmoduleid.status) {
                        case LOADING:
                            activityDetailMovieBinding.progressBar.setVisibility(View.VISIBLE);
                            break;
                        case SUCCESS:
                            if (tvmoduleid.data != null) {
                                activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                                boolean state = tvmoduleid.data.mdataTv.isSelectTVShow();
                                setSelectedTVShow(state);
                            }
                            break;
                        case ERROR:
                            activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                            Toast.makeText(getApplicationContext(), "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });

            //tv fav module
            viewModel.tvshowfavid.observe(this, tvfavmodulid -> {
                Log.d(TAG, "data_Tv_show : " + tvfavmodulid);
                if (tvfavmodulid != null) {
                    switch (tvfavmodulid.status) {
                        case LOADING:
                            activityDetailMovieBinding.progressBar.setVisibility(View.VISIBLE);
                            break;
                        case SUCCESS:
                            if (tvfavmodulid.data != null) {
                                activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                                boolean state = tvfavmodulid.data.mDataTvFav.isSelectTVShow();
                                setSelectedTVShow(state);
                            }
                            break;
                        case ERROR:
                            activityDetailMovieBinding.progressBar.setVisibility(View.GONE);
                            Toast.makeText(getApplicationContext(), "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });
        }
        return true;
    }

    private void setSelectedTVShow(boolean state) {
        Log.d(TAG, "state_value : " + state);
        if (menu == null) return;
        MenuItem menuItem = menu.findItem(R.id.action_bookmark);
        if (state) {
            menuItem.setIcon(ContextCompat.getDrawable(this, R.drawable.ic_favourite_full));
        } else {
            menuItem.setIcon(ContextCompat.getDrawable(this, R.drawable.ic_favourite));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG, "STATUS_BUTTON : " + IsACTIVE);
        if (item.getItemId() == R.id.action_bookmark) {
            if (!IsACTIVE) {
                viewModel.setSelectMovies();
                viewModel.setMovieFav(movieId);
            } else {
                viewModel.setSelectTVShow();
                viewModel.setTVFav(movieId);
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        contentDetailMoviesBinding = null;
        activityDetailMovieBinding = null;
    }

    private void setSelectedMovie(boolean state) {
        Log.d(TAG, "state_value : " + state);
        if (menu == null) return;
        MenuItem menuItem = menu.findItem(R.id.action_bookmark);
        if (state) {
            menuItem.setIcon(ContextCompat.getDrawable(this, R.drawable.ic_favourite_full));
        } else {
            menuItem.setIcon(ContextCompat.getDrawable(this, R.drawable.ic_favourite));
        }
    }
}