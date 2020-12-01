package com.company;

public class Main {

    public static void main(String[] args) {
        Sheep sheep = new Sheep(180, 3, "Female", "Afrodita");
        Sheep sheep2 = new Sheep(150, 2, "Female", "Flover");
        Sheep sheep3= new Sheep(130, 1, "Male", "Muzycant");
        Sheep sheep4 = new Sheep(270, 5, "Male", "Chernysh");

        Cow cow = new Cow(350, 4, "Female", "Sgushenka");
        Cow cow2 = new Cow(300, 5, "Male", "Zevs");
        Cow cow3 = new Cow(290, 6, "Female", "Alenka");
        Cow cow4 = new Cow(350, 7, "Male", "Iron Man");
        Cow cow5 = new Cow(255, 8, "Female", "Cvetok");
        Cow cow6 = new Cow(478, 9, "Female", "Svobodra");

        Horse horse = new Horse(550, 16, "Brown","Male", "Marco");
        Horse horse2 = new Horse(440, 13, "White","Female", "Roze");
        Horse horse3 = new Horse(570, 18, "Black", "Male", "Adolf");

        Farm farm = new Farm("Maevka 22", new Cow[]{cow, cow2, cow3, cow4, cow5}, new Sheep[]{sheep, sheep2, sheep3}, new Horse[]{horse, horse2});
        Farm farm2 = new Farm("Lebedinovka 32", new Cow[]{cow6}, new Sheep[]{sheep4}, new Horse[]{horse3});

        farm.Info();
        farm2.Info();
    }
}
