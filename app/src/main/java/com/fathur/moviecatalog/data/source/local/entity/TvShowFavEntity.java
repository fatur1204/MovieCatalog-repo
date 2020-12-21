package com.fathur.moviecatalog.data.source.local.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tvshowfavorite")
public class TvShowFavEntity {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "tvid")
    private String tvid;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "writefilm")
    private String writeFilm;

    @ColumnInfo(name = "imagePath")
    private String imagePath;

    @ColumnInfo(name = "selectTVShow")
    private boolean selectTVShow = false;

    public TvShowFavEntity(String tvid, String title, String description, String writeFilm, String imagePath, Boolean selectTVShow) {
        this.tvid = tvid;
        this.title = title;
        this.description = description;
        this.writeFilm = writeFilm;
        this.imagePath = imagePath;
        if (selectTVShow != null) {
            this.selectTVShow = selectTVShow;
        }
    }

    public boolean isSelectTVShow() {
        return selectTVShow;
    }

    public String getTvid() {
        return tvid;
    }

    public String getWriteFilm() {
        return writeFilm;
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
