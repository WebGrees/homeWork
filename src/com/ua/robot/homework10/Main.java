package com.ua.robot.homework10;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Ivan");
        student1.setEmail("ivan@ua.com");
        student1.setAge(20);
        student1.setAverageMark(4.5);
        student1.studentProfile();

        System.out.println();

        Teacher teacher1 = new Teacher("John", 30, "Math", 4.7);
        teacher1.teacherProfile();

        System.out.println();

        Array array1 = new Array();
        int[] array = array1.getRandomArray(20,-8,60);
        array1.printArray(array);
        array1.sortArrayByAscending(array);
        array1.printArray(array);
        array1.sortArrayByDescending(array);
        array1.printArray(array);
    }
}
