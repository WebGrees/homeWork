package com.ua.robot.homework10;

public class Student {
    private String name;
    private String email;
    private int age;
    private double averageMark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void studentProfile() {
        System.out.println("Student: " + name + "\ne-mail: " + email + "\nAge: " + age + "\nAverage mark: " + averageMark);
    }

}
