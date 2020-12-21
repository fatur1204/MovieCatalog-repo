package com.fathur.moviecatalog.data.source.local.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class TVWithModule {
    @Embedded
    public TvShowEntity mdataTv;
    @Relation(parentColumn = "tvid", entityColumn = "tvid")
    public List<TvShowEntity> mModulesTv;
}

