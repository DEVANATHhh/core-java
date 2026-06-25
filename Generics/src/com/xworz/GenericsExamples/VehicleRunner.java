package com.xworz.GenericsExamples;

public class VehicleRunner {
    public static void main(String[] args) {

        Vehicle<Integer, String, Double> vehicle1 =
                new Vehicle<>(101, "Honda City", 18.5);

        Vehicle<String, String, Integer> vehicle2 =
                new Vehicle<>("V102", "Royal Enfield", 35);

        vehicle1.display();
        System.out.println("----------------");
        vehicle2.display();
    }
}
