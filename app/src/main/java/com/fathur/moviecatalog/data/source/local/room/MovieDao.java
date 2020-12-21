package com.fathur.moviecatalog.data.source.local.room;

import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavModule;
import com.fathur.moviecatalog.data.source.local.entity.MovieWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TVWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavModule;

import java.util.List;

@Dao
public interface MovieDao {
    //------------------------------------------------------ moviesentities

    @Query("SELECT * FROM moviesentities")
    DataSource.Factory<Integer, MovieEntity> getMovies();

    @Query("SELECT * FROM moviefavourite")
    DataSource.Factory<Integer, MovieEntity> getMoviesFav();

    @Query("SELECT * FROM moviesentities where selectMovie = 1")
    DataSource.Factory<Integer, MovieEntity> getSelectMovies();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMovie(List<MovieEntity> courses);

    @Transaction
    @Query("SELECT * FROM moviesentities WHERE mvid = :courseId")
    LiveData<MovieWithModule> getMovieWithModuleId(String courseId);

    @Transaction
    @Query("SELECT * FROM moviesentities WHERE mvid = :courseId")
    LiveData<MovieFavModule> getMovieFavId(String courseId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertModules(List<MovieEntity> module);

    @Update
    void updateMovie(MovieEntity movie);

    //------------------------------------------------------ tvshowentities

    @Query("SELECT * FROM tvshowentities")
    DataSource.Factory<Integer, TvShowEntity> getTVShow();

    @Query("SELECT * FROM tvshowfavorite")
    DataSource.Factory<Integer, TvShowEntity> getTVShowFav();

    @Query("SELECT * FROM tvshowentities where selectTVShow = 1")
    DataSource.Factory<Integer, TvShowEntity> getSelectTvShow();

    @Transaction
    @Query("SELECT * FROM tvshowentities WHERE tvid = :courseId")
    LiveData<TVWithModule> getTVWithModuleId(String courseId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTVShow(List<TvShowEntity> tvshow);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTVModules(List<TvShowEntity> module);

    @Update
    void updateTVShow(TvShowEntity tvshow);

    @Transaction
    @Query("SELECT * FROM tvshowentities WHERE tvid = :courseId")
    LiveData<TvShowFavModule> getTvFavModule(String courseId);

    //------------------------------------------------------ moviefavourite

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMovieFav(List<MovieFavEntity> module);

    @Query("DELETE FROM moviefavourite WHERE mvid = :id")
    void deleteMovieFavById(String id);

    //------------------------------------------------------ tvshowfavorite

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTvFav(List<TvShowFavEntity> module);

    @Query("DELETE FROM tvshowfavorite WHERE tvid = :id")
    void deleteTvShowById(String id);


}
