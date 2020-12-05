package com.company;

import java.time.LocalDate;

public class Student {
    String dateOfBirht;
    String searname;
    String name;
    String gender;
    int age;

    public Student(){}
    public Student(String dateOfBirht, String searname, String name, String gender, int age) {
        this.dateOfBirht = dateOfBirht;
        this.searname = searname;
        this.name = name;
        this.gender = gender;
        if(age <= 0) {
            System.out.println("Oh No!");
            return;
        }
        this.age = age;
    }
    public void setDateOfBirht(String dateOfBirht) {
        this.dateOfBirht = dateOfBirht;
    }
    public String getDateOfBirht() {
        return dateOfBirht;
    }
    public void setSearname(String searname) {
        this.searname = searname;
    }
    public String getSearname() {
        return searname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Oh No!");
            return;
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
