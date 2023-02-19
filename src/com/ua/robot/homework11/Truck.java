package com.ua.robot.homework11;

public class Truck extends Vehicle {
    private int loadCapacity;
    private String vehicleType;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public Truck(String color, int year, int loadCapacity, String vehicleType) {
        super(color, year);
        this.loadCapacity = loadCapacity;
        this.vehicleType = vehicleType;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle type is: " + vehicleType;
    }
}
