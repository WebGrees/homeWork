package com.ua.robot.homework11;

public class Vehicle {
    protected String color;
    protected int year;

    public Vehicle(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
