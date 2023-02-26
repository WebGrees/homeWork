package com.ua.robot.homework14;

public class Main {
    public static void main(String[] args) {
        Person student1 = new Student("Elon", "Mask", 4.5);
        Person teacher1 = new Teacher("Java", 31, 1000.45);

        printInfo(student1);
        printInfo(teacher1);
    }

    public static void printInfo(Person person) {
        System.out.println(person.getInfo());
    }

}
