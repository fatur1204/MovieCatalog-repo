package com.fathur.moviecatalog.ui.tvshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagedList;

import com.fathur.moviecatalog.data.source.MovieRepository;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.vo.Resource;

public class TVShowViewModel extends ViewModel {
    private MovieRepository tvShowRepository;

    public TVShowViewModel(MovieRepository mtvShowRepository) {
        this.tvShowRepository = mtvShowRepository;
    }

    public LiveData<Resource<PagedList<TvShowEntity>>> getTVShow(boolean newState) {
        return tvShowRepository.getAllTVShow(newState);
    }
}
