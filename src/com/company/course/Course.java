package com.company.course;

public class Course {
    private String name;
    private String date;
    int id;
    private String mentor;

    public Course () {

    }

    public Course (String name, String date, int id, String mentor) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.mentor = mentor;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setMentor(String mentor) {
        this.mentor = mentor;
    }


    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public int getId() {
        return id;
    }
    public String getMentor() {
        return mentor;
    }

    @Override
    public String toString() {
        String info = "Course name is " + this.name + ", begin's date is " + this.date + ", id is "
                + this.id + ". Mentor is " + this.mentor + ".";
        return info;
    }

}
