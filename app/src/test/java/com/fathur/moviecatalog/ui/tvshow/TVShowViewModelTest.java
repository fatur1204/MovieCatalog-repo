package com.fathur.moviecatalog.ui.tvshow;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.paging.PagedList;

import com.fathur.moviecatalog.data.source.MovieRepository;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.vo.Resource;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TVShowViewModelTest {
    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();
    private TVShowViewModel viewModel;
    @Mock
    private MovieRepository movieRepository;

    @Mock
    private Observer<Resource<PagedList<TvShowEntity>>> observer;

    @Mock
    private PagedList<TvShowEntity> pagedList;

    @Before
    public void setUp() {
        viewModel = new TVShowViewModel(movieRepository);
    }

    @Test
    public void getTvShow() {
        Resource<PagedList<TvShowEntity>> dummytv = Resource.success(pagedList);
        when(dummytv.data.size()).thenReturn(20);

        MutableLiveData<Resource<PagedList<TvShowEntity>>> tvshow = new MutableLiveData<>();
        tvshow.setValue(dummytv);

        when(movieRepository.getAllTVShow(true)).thenReturn(tvshow);
        List<TvShowEntity> tvShowEntities = viewModel.getTVShow(true).getValue().data;
        verify(movieRepository).getAllTVShow(true);
        assertNotNull(tvShowEntities);
        assertEquals(20, tvShowEntities.size());

        viewModel.getTVShow(true).observeForever(observer);
        verify(observer).onChanged(dummytv);
    }
}