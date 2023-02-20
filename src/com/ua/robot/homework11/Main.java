package com.ua.robot.homework11;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        PassengerCar passengerCar1 = new PassengerCar("Red", 2000, 5, "Passenger Car");

        Truck truck1 = new Truck("White", 2019, 20, "Truck");

        System.out.println(truck1.toString());
        System.out.println(passengerCar1.toString());

    }
}
