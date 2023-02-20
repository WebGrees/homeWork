package com.ua.robot.homework12;

public class Child extends Parent {

    static {
        System.out.println("3");
    }

    static {
        System.out.println("4");
    }

    {
        System.out.println("8");
    }

    {
        System.out.println("9");
    }

    public Child() {
        System.out.println("10");
    }

}
