package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        Human aboutMe = new Human("Kanykei", "Almazbekova", "Almazbekovna", 2002, "Books", "Female");
        int age = me.currentYear - aboutMe.getDate();
        System.out.println("My name is " + aboutMe.getName() + ", my searname is " + aboutMe.getSearname() + ", my pathronymic is " + aboutMe.getPatronymic() + ", I'm " + age + "y.o." + ", my hobbi is " + aboutMe.getHobbi() + ", gender is " + aboutMe.getGender());

        Human person1 = new Human("Eliot", "Hanz", "Smit", 2000, "male");
        Human person2 = new Human("Cas", "Castiel", "Arhangel", 1000, "male");
        Human person3 = new Human("Charli", "Brad", "Berry", 1996, "female");
        Human person4 = new Human("Rubi", "Bill", "Carry", 1995, "female");
        Human person5 = new Human("Gans", "Kristian", "Andersen", 1856, "male");
        Human person6 = new Human("Alex", "Ser", "Push", 1934, "male");
        Human person7 = new Human("Kur", "Man", "Jan", 1888, "female");
        Human person8 = new Human("Ja", "Hochu", "Spat", 2020, "female");
        Human person9 = new Human("Eliot", "Jeremy", "Smit", 2001, "male");
        Human person10 = new Human("Eliot", "Hanzer", "Smit", 2002, "male");

        Human[] persons = {person1, person2, person3, person4, person5, person6, person7, person8, person9, person10};
        for (Human personss : persons) {
            int age1 = me.currentYear - personss.getDate();
            System.out.println("My name is " + personss.name + ", my searname is " + personss.searname + ", my pathronymic is " + personss.patronymic + ", I'm " + age1 + "y.o." + ", gender is " + personss.gender);
        }
    }
}
