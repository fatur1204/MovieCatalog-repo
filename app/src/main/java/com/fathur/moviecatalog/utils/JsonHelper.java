package com.fathur.moviecatalog.utils;

import android.content.Context;

import com.fathur.moviecatalog.data.source.remote.response.MovieResponse;
import com.fathur.moviecatalog.data.source.remote.response.TVShowResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class JsonHelper {
    private final String TAG = JsonHelper.class.getSimpleName();
    private Context context;

    public JsonHelper(Context context) {
        this.context = context;
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private String parsingFileToString(String fileName) {
        try {
            InputStream is = context.getAssets().open(fileName);
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            is.close();
            return new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<MovieResponse> loadMovies() {
        ArrayList<MovieResponse> list = new ArrayList<>();

        try {
            String json = parsingFileToString("movies.json");
            if (json != null) {
                JSONObject responseObject = new JSONObject(json);
                JSONArray listArray = responseObject.getJSONArray("results");
                for (int i = 0; i < listArray.length(); i++) {
                    JSONObject course = listArray.getJSONObject(i);

                    String id = course.getString("id");
                    String title = course.getString("title");
                    String description = course.getString("overview");
                    String vote_value = course.getString("vote_average");
                    String imagePath = "https://image.tmdb.org/t/p/w600_and_h900_bestv2" + course.getString("poster_path");

                    MovieResponse movieResponse = new MovieResponse(id, title, description, vote_value, imagePath);
                    list.add(movieResponse);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<MovieResponse> loadMoviesById(String movidId) {
        ArrayList<MovieResponse> list = new ArrayList<>();

        try {
            String json = parsingFileToString("movies.json");
            if (json != null) {
                JSONObject responseObject = new JSONObject(json);
                JSONArray listArray = responseObject.getJSONArray("results");
                for (int i = 0; i < listArray.length(); i++) {
                    JSONObject course = listArray.getJSONObject(i);

                    String id = course.getString("id");
                    String title = course.getString("title");
                    String description = course.getString("overview");
                    String vote_value = course.getString("vote_average");
                    String imagePath = "https://image.tmdb.org/t/p/w600_and_h900_bestv2" + course.getString("poster_path");

                    MovieResponse movieResponse = new MovieResponse(id, title, description, vote_value, imagePath);
                    list.add(movieResponse);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<TVShowResponse> loadTVShow() {
        ArrayList<TVShowResponse> list = new ArrayList<>();

        try {
            String json = parsingFileToString("tvshow.json");
            if (json != null) {
                JSONObject responseObject = new JSONObject(json);
                JSONArray listArray = responseObject.getJSONArray("results");
                for (int i = 0; i < listArray.length(); i++) {
                    JSONObject course = listArray.getJSONObject(i);

                    String id = course.getString("id");
                    String title = course.getString("name");
                    String description = course.getString("overview");
                    String vote_value = course.getString("vote_average");
                    String imagePath = "https://image.tmdb.org/t/p/w600_and_h900_bestv2" + course.getString("poster_path");

                    TVShowResponse tvShowResponse = new TVShowResponse(id, title, description, vote_value, imagePath);
                    list.add(tvShowResponse);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<TVShowResponse> loadTVById(String tvId) {
        ArrayList<TVShowResponse> list = new ArrayList<>();

        try {
            String json = parsingFileToString("tvshow.json");
            if (json != null) {
                JSONObject responseObject = new JSONObject(json);
                JSONArray listArray = responseObject.getJSONArray("results");
                for (int i = 0; i < listArray.length(); i++) {
                    JSONObject course = listArray.getJSONObject(i);

                    String id = course.getString("id");
                    String title = course.getString("name");
                    String description = course.getString("overview");
                    String vote_value = course.getString("vote_average");
                    String imagePath = "https://image.tmdb.org/t/p/w600_and_h900_bestv2" + course.getString("poster_path");

                    TVShowResponse tvShowResponse = new TVShowResponse(id, title, description, vote_value, imagePath);
                    list.add(tvShowResponse);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }


}
