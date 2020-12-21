package com.fathur.moviecatalog.ui.detail;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.fathur.moviecatalog.data.source.MovieRepository;
import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieWithModule;
import com.fathur.moviecatalog.utils.DataDummy;
import com.fathur.moviecatalog.vo.Resource;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DetailMovieViewModelTest {
    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();
    private DetailMovieViewModel viewModel;
    private MovieEntity dummymovie = DataDummy.generateDummyMovies().get(0);
    private String mvid = dummymovie.getMvid();
    private ArrayList<MovieEntity> dummyModules = DataDummy.generateDummyMoviesById(mvid);
    @Mock
    private MovieRepository movieRepository;

    @Mock
    private Observer<Resource<MovieWithModule>> observermovie;

    @Before
    public void setUp() {
        viewModel = new DetailMovieViewModel(movieRepository);
        viewModel.setMovieId(mvid);
    }


    @Test
    public void getDataById() {
        Resource<MovieWithModule> dummyMoviesWithModule = Resource.success(DataDummy.generateDummyMovieWithModules(dummymovie, true));
        MutableLiveData<Resource<MovieWithModule>> movies = new MutableLiveData<>();
        movies.setValue(dummyMoviesWithModule);
        when(movieRepository.getModuleMovieById(mvid)).thenReturn(movies);
        viewModel.movieModuleId.observeForever(observermovie);
        verify(observermovie).onChanged(dummyMoviesWithModule);
    }
}