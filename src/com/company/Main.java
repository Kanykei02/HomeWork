package com.company;

public class Main {

    public static void main(String[] args) {
        Dog black = new Dog();
        black.setPaws(4);
        black.setName("Jack");
        black.setYear(3);
        System.out.println("Paws: " + black.paws + ", " + "Name is " + black.name + ", " + black.getYear() + " year");

        Dog white = new Dog();
        white.setPaws(4);
        white.setName("Lisa");
        white.setYear(2);
        System.out.println("Paws: " + white.paws + ", " + "Name is " + white.name + ", " + white.getYear() + " year");

        Cat catOne = new Cat();
        catOne.setYear(1);
        catOne.setName("Lucifer");
        catOne.setBreed("Ragdoll");
        System.out.println(catOne.getYear() + "year , " + "Name is " + catOne.name + ", " + "Breed is " + catOne.breed);

        Cat cat2 = new Cat();
        cat2.setYear(2);
        cat2.setName("Mihail");
        cat2.setBreed("Maine Coon");
        System.out.println(cat2.getYear() + "year , " + "Name is " + cat2.name + ", " + "Breed is " + cat2.breed);

        Fish firstFish = new Fish();
        firstFish.setYear(5);
        firstFish.setName("Balthazar");
        firstFish.setColor("Gold");
        System.out.println(firstFish.getYear() + "year , " + "Name is " + firstFish.name + ", " + "Color is " + firstFish.color);

        Fish secondFish = new Fish();
        secondFish.setYear(5);
        secondFish.setName("Gabriel");
        secondFish.setColor("Red");
        System.out.println(secondFish.getYear() + "year , " + "Name is " + secondFish.name + ", " + "Color is " + secondFish.color);

        Parrot par = new Parrot();
        par.setYear(6);
        par.setName("Crowley");
        par.setGrowth(20);
        System.out.println(par.getYear() + "year , " + "Name is " + par.name + ", " + "Growth: " + par.growth);

        Parrot parr = new Parrot();
        parr.setYear(7);
        parr.setName("Azazel");
        parr.setGrowth(25);
        System.out.println(parr.getYear() + "year , " + "Name is " + parr.name + ", " + "Growth: " + parr.growth);
    }
}
