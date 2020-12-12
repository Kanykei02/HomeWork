package com.company;

public class Main {

    public static void main(String[] args) {
	    Teacher tch = new Teacher("Shamil", 21, "male", "java-reviewer", 180);
        System.out.println(tch);
        Student st = new Student("Kanykei", 18, "female", 5.0, "Java");
        System.out.println(st);
    }
}
