package com.company;

import java.time.LocalDate;

public class Course {
    String name;
    String date;
    String id;
    String teacher;

    public Course() {}
    public Course(String name, String date, String id, String teacher){
        this.name = name;
        this.date = date;
        this.id = id;
        this.teacher = teacher;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getTeacher(){
        return teacher;
    }
}
