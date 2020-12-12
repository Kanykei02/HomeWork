package com.company.course;

import com.company.student.Group;
import com.company.student.Student;

public class Main {

    public static void main(String[] args) {
        Course cr = new Course("Java", "10.10.2020", 35472, "Sabina");
        System.out.println(cr);
        Student st = new Student("04/07/2002", "Sam", "Winchester", "male", 18);
        System.out.println(st);
        Group gr = new Group(1, "10/10/2020", 9);
        System.out.println(gr);
    }
}
