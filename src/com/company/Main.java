package com.company;

public class Main {

    public static void main(String[] args) {
        Climable climable = new Monkey();
        climable.climb();
        Fruits eat1 = new Monkey();
        eat1.eat();
        Monkey monkey = new Monkey();
        monkey.setClimable(monkey);
    }
}
