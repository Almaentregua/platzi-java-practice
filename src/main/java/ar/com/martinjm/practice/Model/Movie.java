package ar.com.martinjm.practice.Model;

import ar.com.martinjm.practice.dao.MovieDao;

import java.util.ArrayList;

public class Movie implements MovieDao {
    private String title;
    private String genre;
    private String creator;
    private String duration;
    private String year;

    public Movie(){}

    public Movie(String title, String genre, String creator, String duration, String year) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
        this.year = year;
    }

    public Movie(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        Movie  movie = new Movie();
        this.year = year;
    }

    public static ArrayList<Movie> getMovies(){
        Movie  movie = new Movie();
        return movie.readMovies();
    }
}
