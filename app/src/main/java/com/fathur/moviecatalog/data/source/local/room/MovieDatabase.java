package com.fathur.moviecatalog.data.source.local.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavEntity;

@Database(entities = {MovieEntity.class, TvShowEntity.class, MovieFavEntity.class, TvShowFavEntity.class},
        version = 1,
        exportSchema = false)
public abstract class MovieDatabase extends RoomDatabase {
    private static volatile MovieDatabase INSTANCE;

    public static MovieDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (MovieDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            MovieDatabase.class, "Moviesdatabase.db")
                            .build();
                }

            }
        }
        return INSTANCE;
    }

    public abstract MovieDao movieDao();
}
