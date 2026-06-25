package com.xworz.GenericsExamples;

public class Vehicle<T, P, Y> {

    public T vehicleId;
    public P vehicleName;
    public Y mileage;

    public Vehicle(T vehicleId, P vehicleName, Y mileage) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Vehicle Id: " + vehicleId);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Mileage: " + mileage);
    }
}