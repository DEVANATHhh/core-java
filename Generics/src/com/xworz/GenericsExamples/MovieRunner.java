package com.xworz.GenericsExamples;

public class MovieRunner {

    public static void main(String[] args) {

        Movie<Integer, String, Double> movie1 =
                new Movie<>(1, "Kantara", 9.3);

        Movie<String, String, Float> movie2 =
                new Movie<>("M102", "KGF Chapter 2", 8.9f);

        movie1.display();
        System.out.println("----------------");
        movie2.display();
    }
}