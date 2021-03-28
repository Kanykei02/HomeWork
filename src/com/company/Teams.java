package com.company;

import java.util.Random;

public class Teams implements Runnable{

    private Game game;

    @Override
    public void run() {
        Random ran = new Random();
        game.setBallCount(ran.nextInt(16));
        game.setYellowCards(ran.nextInt(16));
        game.setOffsideCount(ran.nextInt(16));
        System.out.println(Thread.currentThread().getName() + " score: " + game.getBallCount()
         + "; Yellow cards: " + game.getYellowCards() + "; Offside: " + game.getOffsideCount());
    }

    public Teams(){}

    public Teams(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
