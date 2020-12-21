package com.fathur.moviecatalog.ui.detail;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.fathur.moviecatalog.data.source.MovieRepository;
import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavModule;
import com.fathur.moviecatalog.data.source.local.entity.MovieWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TVWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavModule;
import com.fathur.moviecatalog.vo.Resource;

import java.util.Collections;

public class DetailMovieViewModel extends ViewModel {
    private static final String TAG = DetailMovieViewModel.class.getSimpleName();
    private MutableLiveData<String> movieId = new MutableLiveData<>();
    private MovieRepository detailMovies;

    public LiveData<Resource<MovieWithModule>> movieModuleId = Transformations.switchMap(movieId,
            mMovieId -> detailMovies.getModuleMovieById(mMovieId));

    public LiveData<Resource<MovieFavModule>> moviefavid = Transformations.switchMap(movieId,
            mMovieId -> detailMovies.getMovieFavId(mMovieId));

    public LiveData<Resource<TVWithModule>> tvmoduleId = Transformations.switchMap(movieId,
            mTVId -> detailMovies.getAllTVShowById(mTVId));

    public LiveData<Resource<TvShowFavModule>> tvshowfavid = Transformations.switchMap(movieId,
            mTVId -> detailMovies.getAllTvShowFavId(mTVId));

    public DetailMovieViewModel(MovieRepository mDetailMovies) {
        this.detailMovies = mDetailMovies;
    }

    public void setMovieId(String id) {
        this.movieId.setValue(id);
    }

    public void setTvId(String mvid) {
        this.movieId.setValue(mvid);
    }

    void setSelectMovies() {
        Resource<MovieWithModule> moduleResource = movieModuleId.getValue();
        if (moduleResource != null) {
            MovieWithModule MovieWithModule = moduleResource.data;
            if (MovieWithModule != null) {
                MovieEntity movies = MovieWithModule.mMovies;
                final boolean newState = !movies.isSelectMovie();
                detailMovies.setSelectMovie(movies, newState);
            }
        }
    }

    void setMovieFav(String mvId) {
        Resource<MovieFavModule> moduleResource = moviefavid.getValue();
        if (moduleResource != null) {
            MovieFavModule MovieWithModule = moduleResource.data;
            if (MovieWithModule != null) {
                MovieFavEntity movies = MovieWithModule.mdataMovieFav;
                final boolean newState = !movies.isSelectMovie();
                if (newState) {
                    detailMovies.setMovieFav(Collections.singletonList(movies));
                } else {
                    detailMovies.setMovieFavDel(String.valueOf(mvId));
                }
            }
        }
    }

    void setSelectTVShow() {
        Resource<TVWithModule> moduleResource = tvmoduleId.getValue();
        if (moduleResource != null) {
            TVWithModule tvshowwithmodule = moduleResource.data;
            if (tvshowwithmodule != null) {
                TvShowEntity tvshow = tvshowwithmodule.mdataTv;
                final boolean newState = !tvshow.isSelectTVShow();
                detailMovies.setSelectTV(tvshow, newState);

            }
        }
    }

    void setTVFav(String mvId) {
        Resource<TvShowFavModule> moduleResource = tvshowfavid.getValue();
        if (moduleResource != null) {
            TvShowFavModule tvShowFavModule = moduleResource.data;
            if (tvShowFavModule != null) {
                TvShowFavEntity tvshow = tvShowFavModule.mDataTvFav;
                final boolean newState = !tvshow.isSelectTVShow();
                Log.d(TAG, "status_Tv : " + newState);
                if (newState) {
                    detailMovies.setTvFav(Collections.singletonList(tvshow));
                } else {
                    detailMovies.setTvFavDel(String.valueOf(mvId));
                }
            }
        }
    }
}
