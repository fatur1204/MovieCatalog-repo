package com.fathur.moviecatalog.ui.movies.di;

import android.content.Context;

import com.fathur.moviecatalog.data.source.MovieRepository;
import com.fathur.moviecatalog.data.source.local.LocalDataSource;
import com.fathur.moviecatalog.data.source.local.room.MovieDatabase;
import com.fathur.moviecatalog.data.source.remote.RemoteDataSource;
import com.fathur.moviecatalog.utils.AppExecutors;
import com.fathur.moviecatalog.utils.JsonHelper;

public class Injection {
    public static MovieRepository provideRepository(Context context) {

        /*RemoteDataSource remoteDataSource = RemoteDataSource.getInstance(new JsonHelper(context));

        return MovieRepository.getInstance(remoteDataSource);*/

        MovieDatabase database = MovieDatabase.getInstance(context);

        RemoteDataSource remoteDataSource = RemoteDataSource.getInstance(new JsonHelper(context));
        LocalDataSource localDataSource = LocalDataSource.getInstance(database.movieDao());
        AppExecutors appExecutors = new AppExecutors();

        return MovieRepository.getInstance(remoteDataSource, localDataSource, appExecutors);
    }
}
