package com.fathur.moviecatalog.data.source.local.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class MovieWithModule {
    @Embedded
    public MovieEntity mMovies;
    @Relation(parentColumn = "mvid", entityColumn = "mvid")
    public List<MovieEntity> mModules;
}
