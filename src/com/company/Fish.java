package com.company;

public class Fish {
    int year;
    String name;
    String color;

    public int getYear() {
        return year;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public void setYear(int y) {
        if (y <= 0) {
            System.out.println("Mistake!");
            return;
        }
        year = y;
    }
    public void setName(String n) {
        name = n;
    }
    public void setColor(String c) {
        color = c;
    }
}
