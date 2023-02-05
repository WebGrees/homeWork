package com.ua.robot.homework7;

public class Main {
    public static void main(String[] args) {
        int number = 2;
        int cubedNumber = getCubedNumber(number);
        System.out.println(cubedNumber);

        printSymbolNTimes(5);
        printSymbolNTimes(10,"=)");
    }

    static int getCubedNumber(int numberValue)  {
        int result = numberValue * numberValue * numberValue;
        return result;
    }

    static void printSymbolNTimes(int symbolQuantity) {
        printSymbolNTimes(symbolQuantity, "*");

    }

    static void printSymbolNTimes(int symbolQuantity, String symbol) {
        for (int i = 0; i < symbolQuantity; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

}
