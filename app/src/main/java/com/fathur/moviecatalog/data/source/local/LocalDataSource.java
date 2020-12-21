package com.fathur.moviecatalog.data.source.local;

import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;

import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavModule;
import com.fathur.moviecatalog.data.source.local.entity.MovieWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TVWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavModule;
import com.fathur.moviecatalog.data.source.local.room.MovieDao;

import java.util.List;

public class LocalDataSource {
    private static LocalDataSource INSTANCE;
    private final MovieDao mMovieDao;

    private LocalDataSource(MovieDao mMovieDao) {
        this.mMovieDao = mMovieDao;
    }

    public static LocalDataSource getInstance(MovieDao movieDao) {
        if (INSTANCE == null) {
            INSTANCE = new LocalDataSource(movieDao);
        }
        return INSTANCE;
    }

    public DataSource.Factory<Integer, MovieEntity> getAllMovie(boolean newState) {
        if (newState) {
            return mMovieDao.getMoviesFav();
        } else {
            return mMovieDao.getMovies();
        }
    }

    public LiveData<MovieWithModule> getMovieWithModule(final String movieId) {
        return mMovieDao.getMovieWithModuleId(movieId);
    }

    public LiveData<MovieFavModule> getMovieFavId(final String movieId) {
        return mMovieDao.getMovieFavId(movieId);
    }

    public LiveData<TVWithModule> getTvWithModule(final String tvId) {
        return mMovieDao.getTVWithModuleId(tvId);
    }

    public LiveData<TvShowFavModule> getTvFavModule(final String tvId) {
        return mMovieDao.getTvFavModule(tvId);
    }

    public void insertModules(List<MovieEntity> modules) {
        mMovieDao.insertModules(modules);
    }

    public DataSource.Factory<Integer, TvShowEntity> getAllTVShow(boolean newState) {
        if (newState) {
            return mMovieDao.getTVShowFav();
        } else {
            return mMovieDao.getTVShow();
        }
    }


    public DataSource.Factory<Integer, MovieEntity> getSelectMovies() {
        return mMovieDao.getSelectMovies();
    }

    public void insertMovie(List<MovieEntity> movies) {
        mMovieDao.insertMovie(movies);
    }

    public void insertTVModule(List<TvShowEntity> tvshow) {
        mMovieDao.insertTVModules(tvshow);
    }

    public void insertMovieFav(List<MovieFavEntity> movies) {
        mMovieDao.insertMovieFav(movies);
    }

    public void insertTv(List<TvShowEntity> tvShowEntities) {
        mMovieDao.insertTVShow(tvShowEntities);
    }


    public void setSelectMovie(MovieEntity movie, boolean newState) {
        movie.setSelectMovie(newState);
        mMovieDao.updateMovie(movie);
    }

    public void setSelectTv(TvShowEntity tvShowEntity, boolean newState) {
        tvShowEntity.setSelectTVShow(newState);
        mMovieDao.updateTVShow(tvShowEntity);
    }

    public void setMovieFav(List<MovieFavEntity> movieFavEntity) {
        mMovieDao.insertMovieFav(movieFavEntity);
    }

    public void setMovieFavDel(String movieFavEntity) {
        mMovieDao.deleteMovieFavById(movieFavEntity);
    }

    public void setTvFav(List<TvShowFavEntity> movieFavEntity) {
        mMovieDao.insertTvFav(movieFavEntity);
    }

    public void setTvFavDel(String movieFavEntity) {
        mMovieDao.deleteTvShowById(movieFavEntity);
    }

}
