package com.example.brunopereira.movies_app.Model;

/**
 * Created by bruno.pereira on 04/04/2018.
 */

public class Movie {
    private String name;
    private String genres;
    private int runtime;
    private int year;
    private String director;
    private String actors;
    private String plot;
    private String poster_url;


    public Movie(){

    }

    public Movie(String name, String genres, int runtime, int year, String director, String actors, String plot) {
        this.name = name;
        this.genres = genres;
        this.runtime = runtime;
        this.year = year;
        this.director = director;
        this.actors = actors;
        this.plot = plot;
        this.poster_url = poster_url;
    }

    ///////////GETTER/////////////


    public String getName() {
        return name;
    }

    public String getGenres() {
        return genres;
    }

    public int getRuntime() {
        return runtime;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public String getPlot() {
        return plot;
    }

    public String getPoster_url(){
        return poster_url;
    }

    ///////////SETTER////////////


    public void setName(String name) {
        this.name = name;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String setPoster_url(String poster_url){
        return poster_url;
    }
}
