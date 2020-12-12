package com.company;

public class Teacher extends Person {
    String profession;
    int growth;

    public Teacher(){}

    public Teacher(String name, int age, String gender, String profession, int growth) {
        super(name, age, gender);
        this.profession = profession;
        this.growth = growth;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        String info = "My name is " + this.name + ", I'm " + this.age + ", I'm " + this.gender +
                ". I'm " + this.profession + ", my height is " + this.growth;
        return info;
    }
}
