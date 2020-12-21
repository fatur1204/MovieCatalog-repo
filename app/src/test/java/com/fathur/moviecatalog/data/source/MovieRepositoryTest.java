package com.fathur.moviecatalog.data.source;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.paging.DataSource;
import androidx.paging.PagedList;

import com.fathur.moviecatalog.data.source.local.LocalDataSource;
import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.data.source.remote.RemoteDataSource;
import com.fathur.moviecatalog.data.source.remote.response.MovieResponse;
import com.fathur.moviecatalog.data.source.remote.response.TVShowResponse;
import com.fathur.moviecatalog.utils.AppExecutors;
import com.fathur.moviecatalog.utils.DataDummy;
import com.fathur.moviecatalog.utils.PagedListUtil;
import com.fathur.moviecatalog.vo.Resource;

import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MovieRepositoryTest {
    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    //private RemoteDataSource remote = Mockito.mock(RemoteDataSource.class);
    private RemoteDataSource remote = mock(RemoteDataSource.class);

    private LocalDataSource local = mock(LocalDataSource.class);
    private AppExecutors appExecutors = mock(AppExecutors.class);
    private FakeMovieRepository academyRepository = new FakeMovieRepository(remote, local, appExecutors);

    private List<MovieResponse> movieresponse = DataDummy.generateRemoteDummyMovies();
    private String mvid = movieresponse.get(0).getMvid();
    private ArrayList<TVShowResponse> tvresponse = DataDummy.generateRemoteDummyTvShow();
    private String tvid = tvresponse.get(0).getMvid();

    @Test
    public void getAllMovies() {
        DataSource.Factory<Integer, MovieEntity> dataSourceFactory = mock(DataSource.Factory.class);
        when(local.getAllMovie(true)).thenReturn(dataSourceFactory);
        academyRepository.getAllMovies(true);
        Resource<PagedList<MovieEntity>> movieEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyMovies()));

        verify(local).getAllMovie(true);
        assertNotNull(movieEntities.data);
        assertEquals(movieresponse.size(), movieEntities.data.size());
    }

    @Test
    public void getAllTVShow() {
        DataSource.Factory<Integer, TvShowEntity> dataSourceFactory = mock(DataSource.Factory.class);
        when(local.getAllTVShow(true)).thenReturn(dataSourceFactory);
        academyRepository.getAllTVShow(true);
        Resource<PagedList<TvShowEntity>> tvShowEntities = Resource.success(PagedListUtil.mockPagedList(DataDummy.generateDummyTvShow()));


        verify(local).getAllTVShow(true);
        assertNotNull(tvShowEntities.data);
        assertEquals(tvresponse.size(), tvShowEntities.data.size());
    }

}