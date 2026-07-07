package com.Xworkz.filter.City;
import java.util.ArrayList;

public class CityPincodeFilter {

    public static void main(String[] args) {


    ArrayList<City> cities = new ArrayList<>();

        cities.add(new City("Agra", 280001L));
        cities.add(new City("Delhi", 110001L));
        cities.add(new City("Mumbai", 400001L));
        cities.add(new City("Bangalore", 560001L));
        cities.add(new City("Hyderabad", 500001L));
        cities.add(new City("Chennai", 600001L));
        cities.add(new City("Kolkata", 700001L));
        cities.add(new City("Surat", 395001L));
        cities.add(new City("Pune", 411001L));
        cities.add(new City("Ahmedabad", 380001L));
        cities.add(new City("Jaipur", 302001L));
        cities.add(new City("Lucknow", 226001L));
        cities.add(new City("Thane", 400601L));
        cities.add(new City("Nagpur", 440001L));
        cities.add(new City("Visakhapatnam", 530001L));
        cities.add(new City("Kanpur", 208001L));
        cities.add(new City("Ludhiana", 141001L));
        cities.add(new City("Chandigarh", 160001L));
        cities.add(new City("Ranchi", 834001L));
        cities.add(new City("Patna", 800001L));
        cities.add(new City("Meerut", 250001L));
        cities.add(new City("Vadodara", 390001L));
        cities.add(new City("Jalandhar", 144001L));
        cities.add(new City("Gwalior", 474001L));
        cities.add(new City("Gurgaon", 122001L));
        cities.add(new City("Noida", 201001L));
        cities.add(new City("Bhopal", 462001L));
        cities.add(new City("Indore", 452001L));
        cities.add(new City("Guwahati", 781001L));
        cities.add(new City("Vijayawada", 520001L));
        cities.add(new City("Kochi", 682001L));
        cities.add(new City("Madurai", 625001L));
        cities.add(new City("Nashik", 422001L));
        cities.add(new City("Jamshedpur", 831001L));


    // a. Cities with pincodes between 500000 - 599999
        System.out.println(" Pincode between 500000 - 599999");

        cities.stream()
                .filter(city -> city.getPincode() >= 500000L &&
            city.getPincode() <= 599999L)
            .forEach(city ->
            System.out.println(city.getName() + " : " + city.getPincode()));


    // b. City names longer than 6 characters
        System.out.println("\n----- City names longer than 6 characters -----");

        cities.stream()
                .filter(city -> city.getName().length() > 6)
            .forEach(city ->
            System.out.println(city.getName()));


    // c. Pincode contains digit '1'
        System.out.println("\n----- Pincode contains digit 1 -----");

        cities.stream()
                .filter(city -> String.valueOf(city.getPincode()).contains("1"))
            .forEach(city ->
            System.out.println(city.getName() + " : " + city.getPincode()));


    // d. Even pincodes
        System.out.println("\n----- Even Pincodes -----");

        cities.stream()
                .filter(city -> city.getPincode() % 2 == 0)
            .forEach(city ->
            System.out.println(city.getName() + " : " + city.getPincode()));


    // e. Odd pincodes
        System.out.println("\n----- Odd Pincodes -----");

        cities.stream()
                .filter(city -> city.getPincode() % 2 != 0)
            .forEach(city ->
            System.out.println(city.getName() + " : " + city.getPincode()));


    // f. City starting with M or D
        System.out.println("\n----- City starting with M or D -----");

        cities.stream()
                .filter(city -> city.getName().startsWith("M") ||
            city.getName().startsWith("D"))
            .forEach(city ->
            System.out.println(city.getName()));


    // g. Pincode divisible by 3
        System.out.println("\n----- Pincode divisible by 3 -----");

        cities.stream()
                .filter(city -> city.getPincode() % 3 == 0)
            .forEach(city ->
            System.out.println(city.getName() + " : " + city.getPincode()));


    // h. Sum of pincode digits greater than 20
        System.out.println("\n----- Pincode digit sum greater than 20 -----");

        cities.stream()
                .filter(city -> sumOfDigits(city.getPincode()) > 20)
            .forEach(city ->
            System.out.println(city.getName() + " : " + city.getPincode()));


    // i. City containing letter 'a'
        System.out.println("\n----- City containing letter 'a' -----");

        cities.stream()
                .filter(city -> city.getName()
            .toLowerCase()
                        .contains("a"))
            .forEach(city ->
            System.out.println(city.getName()));


    // j. Pincode ending with '001'
        System.out.println("\n----- Pincode ending with 001 -----");

        cities.stream()
                .filter(city -> String.valueOf(city.getPincode())
            .endsWith("001"))
            .forEach(city ->
            System.out.println(city.getName() + " : " + city.getPincode()));
}


// Sum of digits of pincode
public static int sumOfDigits(long number) {

    int sum = 0;

    while (number > 0) {
        sum += number % 10;
        number = number / 10;
    }

    return sum;


}
}
