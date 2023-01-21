package com.ua.robot.homework4;

public class Main {
    public static void main(String[] args) {
        String love = "I love Java";
        System.out.println(love.toUpperCase() + ", " + love.toLowerCase());

        char firstChar = love.charAt(0);
        System.out.println("First character is: " + firstChar);

        int length = love.length();
        int lastIndex = length - 1;
        char lastChar = love.charAt(lastIndex);
        System.out.println("Last character is: " + lastChar);
    }
}
