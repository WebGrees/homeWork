package com.ua.robot.homework6;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        int num = 7;
        int i = 1;
        int fact = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + fact);

        int maxValue = 100;
        int a = 0;
        int b = 1;
        while (a <= maxValue) {
            System.out.print(a + " ");
            int sum = a+b;
            a=b;
            b=sum;
        }
    }
}
