package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Thread t1 = new Thread(new Teams(), "The Free Will Team");
        Thread t2 = new Thread(new Teams(), "The Apocalypse Team");

        t1.start();
        t2.start();

    }
}
