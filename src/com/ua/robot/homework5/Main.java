package com.ua.robot.homework5;

public class Main {
    public static void main(String[] args) {
        int number1 = 30;
        int number2 = 30;

        if (number1 > number2) {
            System.out.println(number1 + " is grater than " + number2);
        }
        if (number1 == number2) {
            System.out.println(number1 + " is equal " + number2);
        }
        if (number2 > number1) {
            System.out.println(number2 + " is grater than " + number1);
        }

        if (number1 < number2) {
            System.out.println(number1 + " is less than " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " is equal " + number2);
        } else {
            System.out.println(number2 + " is less than " + number1);
        }

        if (number1 %2 == 0) {
            System.out.println(number1 + " is even");
        } else {
            System.out.println(number1 + " is odd");
        }

        if (number1 == number2) {
            System.out.println("");
        } else if (number2 %2 == 0) {
            System.out.println(number2 + " is even");
        } else {
            System.out.println(number2 + " is odd");
        }
    }
}
