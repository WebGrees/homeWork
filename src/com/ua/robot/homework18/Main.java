package com.ua.robot.homework18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Beyonce", 20, "A");
        Student student2 = new Student("Shakira", 21, "B");
        Student student3 = new Student("Rihana", 23, "C");

        ArrayList<Student> list1 = new ArrayList<Student>();
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);

        System.out.println(list1.toString());

        ArrayList<Integer> list2 = new ArrayList<Integer>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list2.add(random.nextInt(25));
        }

        System.out.println(list2.toString());

        LinkedList<Integer> list3 = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            list3.add(random.nextInt(1));
        }

        System.out.println(list3.toString());

    }
}
