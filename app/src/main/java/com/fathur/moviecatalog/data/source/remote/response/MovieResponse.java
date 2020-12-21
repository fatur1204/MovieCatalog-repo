package com.fathur.moviecatalog.data.source.remote.response;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieResponse implements Parcelable {
    public static final Creator<MovieResponse> CREATOR = new Creator<MovieResponse>() {
        @Override
        public MovieResponse createFromParcel(Parcel in) {
            return new MovieResponse(in);
        }

        @Override
        public MovieResponse[] newArray(int size) {
            return new MovieResponse[size];
        }
    };
    private String mvid;
    private String title;
    private String description;
    private String writerfilm;
    private String imagePath;

    public MovieResponse() {

    }

    public MovieResponse(String mvid, String title, String description, String writerfilm, String imagePath) {
        this.mvid = mvid;
        this.title = title;
        this.description = description;
        this.writerfilm = writerfilm;
        this.imagePath = imagePath;
    }

    public MovieResponse(Parcel in) {
        mvid = in.readString();
        title = in.readString();
        description = in.readString();
        writerfilm = in.readString();
        imagePath = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mvid);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeString(writerfilm);
        dest.writeString(imagePath);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getMvid() {
        return mvid;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getWriterfilm() {
        return writerfilm;
    }

    public String getImagePath() {
        return imagePath;
    }
}
