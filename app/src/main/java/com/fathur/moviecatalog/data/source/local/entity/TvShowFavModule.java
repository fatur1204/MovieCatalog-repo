package com.fathur.moviecatalog.data.source.local.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class TvShowFavModule {
    @Embedded
    public TvShowFavEntity mDataTvFav;
    @Relation(parentColumn = "tvid", entityColumn = "tvid")
    public List<TvShowFavEntity> mModuleTvFav;
}
