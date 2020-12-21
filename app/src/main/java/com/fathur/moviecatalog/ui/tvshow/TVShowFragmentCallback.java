package com.fathur.moviecatalog.ui.tvshow;

import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;

public interface TVShowFragmentCallback {
    void onShareClick(TvShowEntity tvShowEntity);
}
