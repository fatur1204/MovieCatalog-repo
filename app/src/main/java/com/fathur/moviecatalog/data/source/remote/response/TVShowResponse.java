package com.fathur.moviecatalog.data.source.remote.response;

import android.os.Parcel;
import android.os.Parcelable;

public class TVShowResponse implements Parcelable {
    public static final Creator<TVShowResponse> CREATOR = new Creator<TVShowResponse>() {
        @Override
        public TVShowResponse createFromParcel(Parcel in) {
            return new TVShowResponse(in);
        }

        @Override
        public TVShowResponse[] newArray(int size) {
            return new TVShowResponse[size];
        }
    };
    private String mvid;
    private String title;
    private String description;
    private String voteaverage;
    private String imagePath;

    public TVShowResponse(String mvid, String title, String description, String voteaverage, String imagePath) {
        this.mvid = mvid;
        this.title = title;
        this.description = description;
        this.voteaverage = voteaverage;
        this.imagePath = imagePath;
    }

    protected TVShowResponse(Parcel in) {
        mvid = in.readString();
        title = in.readString();
        description = in.readString();
        voteaverage = in.readString();
        imagePath = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mvid);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeString(voteaverage);
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

    public String getVoteaverage() {
        return voteaverage;
    }

    public String getImagePath() {
        return imagePath;
    }
}
