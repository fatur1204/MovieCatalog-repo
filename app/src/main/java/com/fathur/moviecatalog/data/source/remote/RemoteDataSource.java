package com.fathur.moviecatalog.data.source.remote;

import android.os.Handler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.fathur.moviecatalog.data.source.remote.response.MovieResponse;
import com.fathur.moviecatalog.data.source.remote.response.TVShowResponse;
import com.fathur.moviecatalog.utils.EspressoIdlingResource;
import com.fathur.moviecatalog.utils.JsonHelper;

import java.util.List;

public class RemoteDataSource {
    private static RemoteDataSource INSTANCE;
    private final long SERVICE_LATENCY_IN_MILLIS = 1000;
    private JsonHelper jsonHelper;
    private Handler handler = new Handler();

    private RemoteDataSource(JsonHelper jsonHelper) {
        this.jsonHelper = jsonHelper;
    }

    public static RemoteDataSource getInstance(JsonHelper helper) {
        if (INSTANCE == null) {
            INSTANCE = new RemoteDataSource(helper);
        }
        return INSTANCE;
    }

    public LiveData<ApiResponse<List<MovieResponse>>> getAllMovies() {
        EspressoIdlingResource.increment();
        MutableLiveData<ApiResponse<List<MovieResponse>>> resultMovies = new MutableLiveData<>();
        handler.postDelayed(() -> {
            resultMovies.setValue(ApiResponse.success(jsonHelper.loadMovies()));
            EspressoIdlingResource.decrement();
        }, SERVICE_LATENCY_IN_MILLIS);
        return resultMovies;
    }


    public LiveData<ApiResponse<List<MovieResponse>>> getAllMoviesId(String moviesId) {
        EspressoIdlingResource.increment();
        MutableLiveData<ApiResponse<List<MovieResponse>>> resultMovieId = new MutableLiveData<>();
        handler.postDelayed(() -> {
            resultMovieId.setValue(ApiResponse.success(jsonHelper.loadMoviesById(moviesId)));
            EspressoIdlingResource.decrement();
        }, SERVICE_LATENCY_IN_MILLIS);
        return resultMovieId;
    }


    public LiveData<ApiResponse<List<TVShowResponse>>> getAllTVShow() {
        EspressoIdlingResource.increment();
        MutableLiveData<ApiResponse<List<TVShowResponse>>> resultTVShow = new MutableLiveData<>();
        handler.postDelayed(() -> {
            resultTVShow.setValue(ApiResponse.success(jsonHelper.loadTVShow()));
            EspressoIdlingResource.decrement();
        }, SERVICE_LATENCY_IN_MILLIS);
        return resultTVShow;
    }

    public LiveData<ApiResponse<List<TVShowResponse>>> getAllTVId(String moviesId) {
        EspressoIdlingResource.increment();
        MutableLiveData<ApiResponse<List<TVShowResponse>>> resultTVId = new MutableLiveData<>();
        handler.postDelayed(() -> {
            resultTVId.setValue(ApiResponse.success(jsonHelper.loadTVById(moviesId)));
            EspressoIdlingResource.decrement();
        }, SERVICE_LATENCY_IN_MILLIS);
        return resultTVId;
    }

}
