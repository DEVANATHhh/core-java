package com.Xworkz.filter.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryFilter {

    public static void main(String[] args) {


        List<String> countries = new ArrayList<>();
        countries.add("india");
        countries.add("america");
        countries.add("pakistan");
        countries.add("south africa");
        countries.add("australia");
        countries.add("china");
        countries.add("japan");


        //country starting with i
        countries.stream().filter(countrys->countrys.startsWith("i")).forEach(System.out::println);

        // Filter countries ending with A
        countries.stream().filter(country -> country.endsWith("a")).forEach(System.out::println);

        // Filter countries with two or more words
        countries.stream().filter(country -> country.split(" ").length >= 2).forEach(System.out::println);

        // Filter countries with length greater than 10
        countries.stream().filter(country -> country.length() > 10).forEach(System.out::println);

        // Filter countries with length less than or equal to 5
        countries.stream().filter(country -> country.length() <= 5).forEach(System.out::println);

        // Print all countries
        countries.forEach(System.out::println);

    }
}