package com.fathur.moviecatalog.data.source;

import androidx.lifecycle.LiveData;
import androidx.paging.PagedList;

import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavModule;
import com.fathur.moviecatalog.data.source.local.entity.MovieWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TVWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavModule;
import com.fathur.moviecatalog.vo.Resource;

import java.util.List;

public interface MovieDataSource {

    LiveData<Resource<PagedList<MovieEntity>>> getAllMovies(boolean newState);

    LiveData<Resource<PagedList<MovieEntity>>> getAllMoviesById(String mvId);

    LiveData<Resource<MovieWithModule>> getModuleMovieById(String courseId);

    LiveData<Resource<MovieFavModule>> getMovieFavId(String tvId);

    LiveData<Resource<PagedList<TvShowEntity>>> getAllTVShow(boolean newState);

    LiveData<Resource<TVWithModule>> getAllTVShowById(String mvId);

    LiveData<Resource<TvShowFavModule>> getAllTvShowFavId(String tvId);

    void setSelectMovie(MovieEntity movies, boolean state);

    void setSelectTV(TvShowEntity tvshow, boolean state);

    void setMovieFav(List<MovieFavEntity> movieFav);

    void setMovieFavDel(String movieFav);

    void setTvFav(List<TvShowFavEntity> movieFav);

    void setTvFavDel(String movieFav);
}
