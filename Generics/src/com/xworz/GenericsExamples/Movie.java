package com.xworz.GenericsExamples;

public class Movie<T, P, Y> {

    public T movieId;
    public P movieName;
    public Y rating;

    public Movie(T movieId, P movieName, Y rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.rating = rating;
    }

    void display() {
        System.out.println("Movie Id: " + movieId);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Rating: " + rating);
    }
}
