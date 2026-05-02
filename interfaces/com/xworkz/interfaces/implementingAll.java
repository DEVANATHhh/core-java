package com.xworkz.interfaces;

public class implementingAll implements Helmet, Bottle, Chair, Clock, Door, Engine, Fan, Backpack, Table, Window {

    // Helmet
    public void durability() {
        System.out.println("Helmet durability is good");
    }

    public void qualityTestResult() {
        System.out.println("Helmet quality test passed");
    }

    public void CustomDesign() {
        System.out.println("Helmet has custom design");
    }

    // Bottle & Table (same method name: clean)
    public void clean() {
        System.out.println("Cleaning bottle/table");
    }

    // Bottle
    public void fill() {
        System.out.println("Bottle filled");
    }

    public void pour() {
        System.out.println("Bottle pouring");
    }

    // Chair & Table (same method name: move)
    public void move() {
        System.out.println("Moving chair/table");
    }

    // Chair
    public void sitOn() {
        System.out.println("Sitting on chair");
    }

    public void fold() {
        System.out.println("Chair folded");
    }

    // Clock
    public void showTime() {
        System.out.println("Showing time");
    }

    public void setTime() {
        System.out.println("Setting time");
    }

    public void alarm() {
        System.out.println("Alarm set");
    }

    // Door
    public void open() {
        System.out.println("Door opened");
    }

    public void close() {
        System.out.println("Door closed");
    }

    public void lock() {
        System.out.println("Door locked");
    }

    // Engine
    public void start() {
        System.out.println("Engine started");
    }

    public void stop() {
        System.out.println("Engine stopped");
    }

    public void accelerate() {
        System.out.println("Engine accelerating");
    }

    // Fan
    public void switchOn() {
        System.out.println("Fan ON");
    }

    public void switchOff() {
        System.out.println("Fan OFF");
    }

    public void changeSpeed() {
        System.out.println("Fan speed changed");
    }

    // Backpack
    public void carry() {
        System.out.println("Backpack carried");
    }

    public void zip() {
        System.out.println("Backpack zipped");
    }

    public void adjustStrap() {
        System.out.println("Strap adjusted");
    }

    // Table
    public void placeItems() {
        System.out.println("Items placed on table");
    }

    // Window
    public void slide() {
        System.out.println("Window sliding");
    }
}

