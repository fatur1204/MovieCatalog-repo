package com.fathur.moviecatalog.data.source.local.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class MovieFavModule {
    @Embedded
    public MovieFavEntity mdataMovieFav;
    @Relation(parentColumn = "mvid", entityColumn = "mvid")
    public List<MovieFavEntity> mModuleMovieFav;
}
