package com.ua.robot.homework15;

public class Main {
    public static void main(String[] args) {
        Human driver1 = new Driver();
        Human pilot1 = new Pilot();

        driveSomeone(driver1);
        flySomeone(pilot1);

    }

    private static void driveSomeone(Drivable drivable) {
        drivable.drive();
    }

    private static void flySomeone(Flyable flyable) {
        flyable.fly();
    }

}
