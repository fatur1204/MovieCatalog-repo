package com.fathur.moviecatalog.data.source.local.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "moviefavourite")
public class MovieFavEntity {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "mvid")
    private String mvid;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "writefilm")
    private String writerfilm;

    @ColumnInfo(name = "imagePath")
    private String imagePath;

    @ColumnInfo(name = "selectMovie")
    private boolean selectMovie = false;

    public MovieFavEntity(String mvid, String title, String description, String writerfilm, String imagePath, Boolean selectMovie) {
        this.mvid = mvid;
        this.title = title;
        this.description = description;
        this.writerfilm = writerfilm;
        this.imagePath = imagePath;
        if (selectMovie != null) {
            this.selectMovie = selectMovie;
        }
    }

    public boolean isSelectMovie() {
        return selectMovie;
    }

    public void setSelectMovie(boolean selectMovie) {
        this.selectMovie = selectMovie;
    }

    public String getMvid() {
        return mvid;
    }

    public String getWriterfilm() {
        return writerfilm;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }
}
