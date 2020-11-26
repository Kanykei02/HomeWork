package com.company;

public class Dog {
    int year;
    String name;
    int paws;

    public int getYear () {
        return year;
    }
    public void setYear (int year) {
        if (year <= 0) {
            System.out.println("Mistake!");
            return;
        }
        this.year = year;
    }
    public void setName (String n) {
        name = n;
    }
    public void setPaws(int p) {
        paws = p;
    }
}
