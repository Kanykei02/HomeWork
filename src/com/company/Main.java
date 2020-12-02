package com.company;

public class Main {

    public static void main(String[] args) {
        Course java = new Course("Java", "10.06.2020",37636513, "Sabina");

        Student kany = new Student("04.07.2002", "Kanykei", "Almazbekova", "Female", 18);
        Student kuma = new Student("04.08.2005", "Kurmanbek", "Almazbekov", "Male", 15);

        Group group1 = new Group(new Student[]{kany, kuma}, java, "25.06.2020", 9);

        Class class1 = new Class("20.10.20", new Student[]{kany, kuma}, java, "20:00", true, false);

        System.out.printf("%nName of the Course: %s, Starting Date: %s, Course ID: %s, Course Mentor: %s", java.getName(), java.getDate(), java.getId(), java.getMentor());
        System.out.printf("%n%s %s, Age: %s, %s, %s", kany.getfName(), kany.getlName(), kany.getAge(), kany.getDateOfBirth(), kany.getGender());
        System.out.printf("%n%s %s, Age: %s, %s, %s", kuma.getfName(), kuma.getlName(), kuma.getAge(), kuma.getDateOfBirth(), kuma.getGender());
        System.out.printf("%nAttendees: %sCourse Name: %s, Starting Date: %s, Duration: %s months", group1.getStudentArray(), group1.getCourse(), group1.getStartingDate(), group1.getDuration());
        System.out.println("");
        System.out.println(java.toString());
        System.out.println(kany.toString());
        System.out.println(kuma.toString());
        System.out.println(group1.toString());
        System.out.println(class1.toString());
    }
}
