package com.company.student;

public class Student {
    private String dateOfBirth;
    private String name;
    private String searname;
    private String gender;
    int age;

    public Student () {}

    public Student(String dateOfBirth, String name, String searname, String gender, int age) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.searname = searname;
        this.gender = gender;
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSearname() {
        return searname;
    }

    public void setSearname(String searname) {
        this.searname = searname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String info  = "My date of birth is " + this.dateOfBirth + ", my name is " + this.name + ", my searname is "
                + this.searname + ", gender is " + this.gender + ", i'm " + this.age + " y.o.";
        return info;
    }
}
