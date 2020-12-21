package com.fathur.moviecatalog.data.source;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

import com.fathur.moviecatalog.data.NetworkBoundResource;
import com.fathur.moviecatalog.data.source.local.LocalDataSource;
import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.MovieFavModule;
import com.fathur.moviecatalog.data.source.local.entity.MovieWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TVWithModule;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowFavModule;
import com.fathur.moviecatalog.data.source.remote.ApiResponse;
import com.fathur.moviecatalog.data.source.remote.RemoteDataSource;
import com.fathur.moviecatalog.data.source.remote.response.MovieResponse;
import com.fathur.moviecatalog.data.source.remote.response.TVShowResponse;
import com.fathur.moviecatalog.utils.AppExecutors;
import com.fathur.moviecatalog.vo.Resource;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements MovieDataSource {

    private volatile static MovieRepository INSTANCE = null;
    private final RemoteDataSource remoteDataSource;
    private final String TAG = MovieRepository.class.getSimpleName();
    private final LocalDataSource localDataSource;
    private final AppExecutors appExecutors;

    private MovieRepository(@NonNull RemoteDataSource remoteDataSource, @NonNull LocalDataSource localDataSource, AppExecutors appExecutors) {
        this.remoteDataSource = remoteDataSource;
        this.localDataSource = localDataSource;
        this.appExecutors = appExecutors;
    }

    public static MovieRepository getInstance(RemoteDataSource remoteData, LocalDataSource localDataSource, AppExecutors appExecutors) {
        if (INSTANCE == null) {
            synchronized (MovieRepository.class) {
                if (INSTANCE == null) {
                    //INSTANCE = new MovieRepository(remoteData);
                    INSTANCE = new MovieRepository(remoteData, localDataSource, appExecutors);
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public LiveData<Resource<PagedList<MovieEntity>>> getAllMovies(boolean newState) {
        return new NetworkBoundResource<PagedList<MovieEntity>, List<MovieResponse>>(appExecutors) {
            @Override

            public LiveData<PagedList<MovieEntity>> loadFromDB() {
                PagedList.Config config = new PagedList.Config.Builder()
                        .setEnablePlaceholders(false)
                        .setInitialLoadSizeHint(4)
                        .setPageSize(4)
                        .build();
                if (newState) {
                    return new LivePagedListBuilder<>(localDataSource.getAllMovie(newState), config).build();
                } else {
                    return new LivePagedListBuilder<>(localDataSource.getAllMovie(newState), config).build();
                }
            }

            @Override
            public Boolean shouldFetch(PagedList<MovieEntity> data) {
                return (data == null) || (data.size() == 0);
            }

            @Override
            public LiveData<ApiResponse<List<MovieResponse>>> createCall() {
                return remoteDataSource.getAllMovies();
            }


            @Override
            public void saveCallResult(List<MovieResponse> movieResponses) {
                ArrayList<MovieEntity> movieList = new ArrayList<>();
                for (MovieResponse response : movieResponses) {
                    MovieEntity movie = new MovieEntity(response.getMvid(),
                            response.getTitle(),
                            response.getDescription(),
                            response.getWriterfilm(),
                            response.getImagePath(),
                            false);

                    movieList.add(movie);
                }

                localDataSource.insertMovie(movieList);
            }
        }.asLiveData();
    }

    @Override
    public LiveData<Resource<PagedList<MovieEntity>>> getAllMoviesById(final String mvId) {
        return new NetworkBoundResource<PagedList<MovieEntity>, List<MovieResponse>>(appExecutors) {
            @Override
            public LiveData<PagedList<MovieEntity>> loadFromDB() {
                PagedList.Config config = new PagedList.Config.Builder()
                        .setEnablePlaceholders(false)
                        .setInitialLoadSizeHint(4)
                        .setPageSize(4)
                        .build();
                return new LivePagedListBuilder<>(localDataSource.getAllMovie(false), config).build();
            }

            @Override
            public Boolean shouldFetch(PagedList<MovieEntity> data) {
                return (data == null) || (data.size() == 0);
            }

            @Override
            public LiveData<ApiResponse<List<MovieResponse>>> createCall() {
                return remoteDataSource.getAllMovies();
            }

            @Override
            protected void saveCallResult(List<MovieResponse> movieResponses) {
                ArrayList<MovieEntity> movieList = new ArrayList<>();
                for (MovieResponse response : movieResponses) {
                    MovieEntity movie = new MovieEntity(response.getMvid(),
                            response.getTitle(),
                            response.getDescription(),
                            response.getWriterfilm(),
                            response.getImagePath(),
                            false);
                    movieList.add(movie);
                }

                localDataSource.insertMovie(movieList);
            }
        }.asLiveData();
    }

    @Override
    public LiveData<Resource<MovieWithModule>> getModuleMovieById(final String courseId) {
        return new NetworkBoundResource<MovieWithModule, List<MovieResponse>>(appExecutors) {
            @Override
            protected LiveData<MovieWithModule> loadFromDB() {
                return localDataSource.getMovieWithModule(courseId);
            }

            @Override
            protected Boolean shouldFetch(MovieWithModule movieWithModule) {
                return (movieWithModule == null || movieWithModule.mModules == null) || (movieWithModule.mModules.size() == 0);
            }

            @Override
            protected LiveData<ApiResponse<List<MovieResponse>>> createCall() {
                return remoteDataSource.getAllMoviesId(courseId);
            }

            @Override
            protected void saveCallResult(List<MovieResponse> moduleResponses) {
                ArrayList<MovieEntity> moduleList = new ArrayList<>();
                for (MovieResponse response : moduleResponses) {
                    MovieEntity course = new MovieEntity(response.getMvid(),
                            response.getTitle(),
                            response.getDescription(),
                            response.getWriterfilm(),
                            response.getImagePath(),
                            false);
                    moduleList.add(course);
                }

                localDataSource.insertModules(moduleList);
            }
        }.asLiveData();
    }

    @Override
    public LiveData<Resource<MovieFavModule>> getMovieFavId(final String tvId) {
        return new NetworkBoundResource<MovieFavModule, List<MovieResponse>>(appExecutors) {
            @Override
            protected LiveData<MovieFavModule> loadFromDB() {
                return localDataSource.getMovieFavId(tvId);
            }

            @Override
            protected Boolean shouldFetch(MovieFavModule movieFavModule) {
                return (movieFavModule == null || movieFavModule.mModuleMovieFav == null) || (movieFavModule.mModuleMovieFav.size() == 0);
            }

            @Override
            protected LiveData<ApiResponse<List<MovieResponse>>> createCall() {
                return remoteDataSource.getAllMoviesId(tvId);
            }

            @Override
            protected void saveCallResult(List<MovieResponse> moduleResponses) {
                ArrayList<MovieFavEntity> moduleList = new ArrayList<>();
                for (MovieResponse response : moduleResponses) {
                    MovieFavEntity course = new MovieFavEntity(response.getMvid(),
                            response.getTitle(),
                            response.getDescription(),
                            response.getWriterfilm(),
                            response.getImagePath(),
                            false);
                    moduleList.add(course);
                }

                //localDataSource.insertMovieFav(moduleList);
            }
        }.asLiveData();
    }

    @Override
    public LiveData<Resource<PagedList<TvShowEntity>>> getAllTVShow(boolean newState) {
        return new NetworkBoundResource<PagedList<TvShowEntity>, List<TVShowResponse>>(appExecutors) {
            @Override
            public LiveData<PagedList<TvShowEntity>> loadFromDB() {
                PagedList.Config config = new PagedList.Config.Builder()
                        .setEnablePlaceholders(false)
                        .setInitialLoadSizeHint(4)
                        .setPageSize(4)
                        .build();
                return new LivePagedListBuilder<>(localDataSource.getAllTVShow(newState), config).build();
            }

            @Override
            public Boolean shouldFetch(PagedList<TvShowEntity> data) {
                return (data == null) || (data.size() == 0);
            }

            @Override
            public LiveData<ApiResponse<List<TVShowResponse>>> createCall() {
                return remoteDataSource.getAllTVShow();
            }


            @Override
            public void saveCallResult(List<TVShowResponse> tvShowResponses) {
                ArrayList<TvShowEntity> tvList = new ArrayList<>();
                for (TVShowResponse response : tvShowResponses) {
                    TvShowEntity tvshow = new TvShowEntity(response.getMvid(),
                            response.getTitle(),
                            response.getDescription(),
                            response.getVoteaverage(),
                            response.getImagePath(),
                            false);

                    tvList.add(tvshow);
                }

                localDataSource.insertTv(tvList);
            }
        }.asLiveData();
    }

    @Override
    public LiveData<Resource<TVWithModule>> getAllTVShowById(final String tvId) {
        return new NetworkBoundResource<TVWithModule, List<TVShowResponse>>(appExecutors) {
            @Override
            protected LiveData<TVWithModule> loadFromDB() {
                return localDataSource.getTvWithModule(tvId);
            }

            @Override
            protected Boolean shouldFetch(TVWithModule tvWithModule) {
                return (tvWithModule == null || tvWithModule.mModulesTv == null) || (tvWithModule.mModulesTv.size() == 0);
            }

            @Override
            protected LiveData<ApiResponse<List<TVShowResponse>>> createCall() {
                return remoteDataSource.getAllTVId(tvId);
            }

            @Override
            protected void saveCallResult(List<TVShowResponse> moduleResponses) {
                ArrayList<TvShowEntity> moduleList = new ArrayList<>();
                for (TVShowResponse response : moduleResponses) {
                    TvShowEntity course = new TvShowEntity(response.getMvid(),
                            response.getTitle(),
                            response.getDescription(),
                            response.getVoteaverage(),
                            response.getImagePath(),
                            false);
                    moduleList.add(course);
                }

                localDataSource.insertTVModule(moduleList);
            }
        }.asLiveData();
    }

    @Override
    public LiveData<Resource<TvShowFavModule>> getAllTvShowFavId(final String tvId) {
        return new NetworkBoundResource<TvShowFavModule, List<TVShowResponse>>(appExecutors) {
            @Override
            protected LiveData<TvShowFavModule> loadFromDB() {
                return localDataSource.getTvFavModule(tvId);
            }

            @Override
            protected Boolean shouldFetch(TvShowFavModule tvWithModule) {
                return (tvWithModule == null || tvWithModule.mModuleTvFav == null) || (tvWithModule.mModuleTvFav.size() == 0);
            }

            @Override
            protected LiveData<ApiResponse<List<TVShowResponse>>> createCall() {
                return remoteDataSource.getAllTVId(tvId);
            }

            @Override
            protected void saveCallResult(List<TVShowResponse> moduleResponses) {
                ArrayList<TvShowEntity> moduleList = new ArrayList<>();
                for (TVShowResponse response : moduleResponses) {
                    TvShowEntity course = new TvShowEntity(response.getMvid(),
                            response.getTitle(),
                            response.getDescription(),
                            response.getVoteaverage(),
                            response.getImagePath(),
                            false);
                    moduleList.add(course);
                }

                //localDataSource.insertTVModule(moduleList);
            }
        }.asLiveData();
    }


    @Override
    public void setSelectMovie(MovieEntity movies, boolean state) {
        appExecutors.diskIO().execute(() -> localDataSource.setSelectMovie(movies, state));
    }

    @Override
    public void setSelectTV(TvShowEntity tvshow, boolean state) {
        appExecutors.diskIO().execute(() -> localDataSource.setSelectTv(tvshow, state));
    }

    @Override
    public void setMovieFav(List<MovieFavEntity> movieFav) {
        appExecutors.diskIO().execute(() -> localDataSource.setMovieFav(movieFav));
    }

    @Override
    public void setMovieFavDel(String movieFav) {
        appExecutors.diskIO().execute(() -> localDataSource.setMovieFavDel(movieFav));
    }


    @Override
    public void setTvFav(List<TvShowFavEntity> movieFav) {
        appExecutors.diskIO().execute(() -> localDataSource.setTvFav(movieFav));
    }

    @Override
    public void setTvFavDel(String movieFav) {
        appExecutors.diskIO().execute(() -> localDataSource.setTvFavDel(movieFav));
    }
}
