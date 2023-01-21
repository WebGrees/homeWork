package com.ua.robot.homework3;

public class Main {
    public static void main(String[] args) {
        int age = 50;
        int ageChange = 2;

        int twiceYounger = age / ageChange;
        int twiceOlder = age * ageChange;

        System.out.println(age + ageChange);
        System.out.println(age - ageChange);
        System.out.println(twiceYounger);
        System.out.println(twiceOlder);
    }
}
