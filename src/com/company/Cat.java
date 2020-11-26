package com.company;

public class Cat {
    int year;
    String name;
    String breed;

    public int getYear() {
        return year;
    }
    public String getName() {
        return name;
    }
    public String getBreed () {
        return breed;
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
    public void setBreed(String b) {
        breed = b;
    }
}
