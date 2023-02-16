package com.ua.robot.homework8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int [length];

        fillArrayWithRandomNumbers(arr,10);
        printArray(arr);
        System.out.println(getMinValue(arr));
        System.out.println(getMaxValue(arr));
        System.out.println(getAverageValue(arr));
        System.out.println(getSum(arr));
    }

    static void fillArrayWithRandomNumbers(int[] arr, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxValue);
        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int getMinValue(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

   static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
   }

    static double getAverageValue(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
