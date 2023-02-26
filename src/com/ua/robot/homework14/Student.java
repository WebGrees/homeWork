package com.ua.robot.homework14;

public class Student extends Person {

    private String name;
    private String lastName;
    private double averageMark;

    @Override
    public String getInfo() {
        return "Student's name: " + name +
                "\nStudent's last name: " + lastName +
                "\nStudent's average mark: " + averageMark;
    }

    public Student(String name, String lastName, double averageMark) {
        this.name = name;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

}
