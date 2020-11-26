package com.company;

public class Parrot {
    int year;
    String name;
    int growth;

    public int getYear () {
        return year;
    }
    public void setYear (int y) {
        if (y <= 0) {
            System.out.println("Mistake!");
            return;
        }
        year = y;
    }
    public void setName (String n) {
        name = n;
    }
    public void setGrowth (int g) {
        growth = g;
    }
}
