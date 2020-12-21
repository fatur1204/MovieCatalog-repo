package com.fathur.moviecatalog.ui.movies;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagedList;

import com.fathur.moviecatalog.data.source.MovieRepository;
import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.vo.Resource;

import java.util.List;

public class MovieViewModel extends ViewModel {
    private static final String TAG = MovieViewModel.class.getSimpleName();
    private MovieRepository movieRepository;
    private MutableLiveData<List<MovieEntity>> movies;

    public MovieViewModel(MovieRepository mMovieRepository) {
        this.movieRepository = mMovieRepository;
    }

    public LiveData<Resource<PagedList<MovieEntity>>> getMovies(boolean newState) {
        return movieRepository.getAllMovies(newState);
    }
}
