package com.company;

public class Main {

    public static void main(String[] args) {
        Course cor = new Course("Java", "10.06.2020", "JV-F20", "Shamil");

        Student cas = new Student("05.04.1000", "Arhangel", "Castiel", "None", 1020);
        Student sam = new Student("12.12.1995", "Vien", "Sam", "Male", 25);

        Group groupOne = new Group("20.10.2020", 9, new Student[] {cas, sam}, cor);

        System.out.printf("%nDate of birth: %s, Searname is %s, Name is %s, Gender is %s, Age is %s", cas.getDateOfBirht(), cas.getSearname(), cas.getName(), cas.getGender(), cas.getAge());
        System.out.printf("%nDate of birth: %s, Searname is %s, Name is %s, Gender is %s, Age is %s", sam.getDateOfBirht(), sam.getSearname(), sam.getName(), sam.getGender(), sam.getAge());
    }
}
