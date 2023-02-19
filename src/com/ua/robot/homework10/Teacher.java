package com.ua.robot.homework10;

public class Teacher {
    private String name;
    private int age;
    private String subject;
    private double rating;

    public Teacher(String name, int age, String subject, double rating) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void teacherProfile(){
        System.out.println("Teacher: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Rating: " + rating);
    }
}
