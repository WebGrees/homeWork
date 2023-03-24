package com.ua.robot.homework19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(1, 51);
            hashSet.add(randomNumber);
            linkedHashSet.add(randomNumber);
            treeSet.add(randomNumber);
        }

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
