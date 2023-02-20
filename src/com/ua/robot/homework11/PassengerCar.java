package com.ua.robot.homework11;

public class PassengerCar extends Vehicle {
    private int passengerCapacity;
    private String vehicleType;

    public PassengerCar(String color, int year, int passengerCapacity, String vehicleType) {
        super(color, year);
        this.passengerCapacity = passengerCapacity;
        this.vehicleType = vehicleType;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
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
