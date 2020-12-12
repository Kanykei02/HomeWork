package com.company;

public class Student extends Person{
    double points;
    String direction;

    public Student() {}

    public Student(String name, int age, String gender, double points, String direction) {
        super(name, age, gender);
        this.points = points;
        this.direction = direction;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        String info = "My name is " + this.name + ", I'm " + this.age + ", I'm " + this.gender +
                ". My points is  " + this.points + ", my direction is " + this.direction;
        return info;
    }
}
