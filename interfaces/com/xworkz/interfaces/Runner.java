
    package com.xworkz.interfaces;

    public class Runner {

        public static void main(String[] args) {

            implementingAll obj = new implementingAll();

            // Helmet
            obj.durability();
            obj.qualityTestResult();
            obj.CustomDesign();

            // Bottle
            obj.fill();
            obj.pour();
            obj.clean();

            // Chair
            obj.sitOn();
            obj.move();
            obj.fold();

            // Clock
            obj.showTime();
            obj.setTime();
            obj.alarm();

            // Door
            obj.open();
            obj.close();
            obj.lock();

            // Engine
            obj.start();
            obj.stop();
            obj.accelerate();

            // Fan
            obj.switchOn();
            obj.switchOff();
            obj.changeSpeed();

            // Backpack
            obj.carry();
            obj.zip();
            obj.adjustStrap();

            // Table
            obj.placeItems();

            // Window
            obj.slide();

            // Accessing interface variables (constants)
            System.out.println("Helmet price: " + Helmet.price);
            System.out.println("Bottle capacity: " + Bottle.capacity);
            System.out.println("Chair legs: " + Chair.legs);
            System.out.println("Clock brand: " + Clock.brand);
            System.out.println("Door material: " + Door.material);
            System.out.println("Engine horsepower: " + Engine.horsepower);
            System.out.println("Fan speed levels: " + Fan.speedLevels);
            System.out.println("Backpack color: " + Backpack.color);
            System.out.println("Table shape: " + Table.shape);
            System.out.println("Window panes: " + Window.panes);
        }
    }

