package com.ua.robot.homework12;

public class Parent {

    static {
        System.out.println("1");
    }

    static {
        System.out.println("2");
    }

    {
        System.out.println("5");
    }

    {
        System.out.println("6");
    }

    public Parent() {
        System.out.println("7");
    }

}
