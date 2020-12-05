package com.company;

import java.time.LocalDate;

public class Group {
    String begin;
    int month;
    Student[] student;
    Course courrse;

    public Group() {}
    public Group(String begin, int month, Student[] student, Course courrse) {
        this.begin = begin;
        this.month = month;
        this.student = student;
        this.courrse = courrse;
    }
    public void setCourse(Course courrse) {
        this.courrse = courrse;
    }
    public Course getCourrse() {
        return courrse;
    }
    public void setStudents(Student[] student) {
        this.student = student;
    }
    public Student[] getStudent() {
        return student;
    }
    public void setBegin(String begin) {
        this.begin = begin;
    }
    public String getBegin(){
        return begin;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
}
