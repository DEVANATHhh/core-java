package com.xworkz.interfaces;

public interface Clock {

    String brand = "Titan";
    int batteryLife = 12;

    void showTime();
    void setTime();
    void alarm();
}
