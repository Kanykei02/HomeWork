package com.company;

public class Credit {
    private String id;
    private int amount;
    private String duration;
    private int interestRate;
    static int loanQuantity;
    private static int sum;
    private static double avg;

    public Credit(String id, int amount, String duration, int interestRate) {
        this.id = id;
        this.amount = amount;
        this.duration = duration;
        this.interestRate = interestRate;
        this.sum += amount;
        this.loanQuantity++;
    }

    public static int getLoanQuantity () {
        return loanQuantity;
    }

    public static int getSum () {
        return sum;
    }

    public static double getAvg () {
        avg = sum / loanQuantity;
        return avg;
    }
}

