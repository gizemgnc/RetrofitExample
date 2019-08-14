package com.example.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Repo {

    @SerializedName("title")
    @Expose
    public String title;

    @SerializedName("image")
    @Expose
    public String image;

    @SerializedName("rating")
    @Expose
    public Float rating;

    @SerializedName("releaseYear")
    @Expose
    public Integer releaseYear;

    @SerializedName("genre")
    @Expose
    public List<String> genre = null;

    public Repo(String title, String image, Float rating, Integer releaseYear, List<String> genre) {
        this.title = title;
        this.image = image;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Float getRating() {
        return rating;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public List<String> getGenre() {
        return genre;
    }
}

