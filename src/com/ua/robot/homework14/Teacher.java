package com.ua.robot.homework14;

public class Teacher extends Person {

    private String course;
    private int age;
    private double salary;

    public Teacher(String course, int age, double salary) {
        this.course = course;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return "Teacher's course: " + course +
                "\nTeacher's age: " + age +
                "\nTeacher's salary: " + salary;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
