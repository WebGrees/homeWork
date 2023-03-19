package com.ua.robot.homework17;

public enum DayOfTheWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);
    private int number;

    DayOfTheWeek(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void printDayByNumber(int number) {
        if (number > 0 && number <=7) {
            for (DayOfTheWeek day : DayOfTheWeek.values()) {
                if (day.getNumber() == number) {
                    System.out.println(day);
                }
            }
        } else {
            System.out.println("Incorrect value");
        }
    }
}
