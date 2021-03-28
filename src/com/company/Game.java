package com.company;

public class Game {
    private int ballCount = 0;
    private int yellowCards = 0;
    private int offsideCount = 0;

    public Game(){}

    public Game(int ballCount, int yellowCards, int offsideCount) {
        this.ballCount = ballCount;
        this.yellowCards = yellowCards;
        this.offsideCount = offsideCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getOffsideCount() {
        return offsideCount;
    }

    public void setOffsideCount(int offsideCount) {
        this.offsideCount = offsideCount;
    }
}
