package com.company;

public class Main {

    public static void main(String[] args) {
        Credit loan1 = new Credit("1234RK", 100000, "24 month", 10);
        Credit loan2 = new Credit("5678FG", 250000, "6 month", 10);
        Credit loan3 = new Credit("9012NK", 50000, "36 month", 20);
        Credit loan4 = new Credit("3456ML", 375000, "12 month", 5);
        Credit loan5 = new Credit("7890AS", 300000, "18 month", 8);

        System.out.println(Credit.getAvg());
        System.out.println(Credit.getSum());
        System.out.println(Credit.getLoanQuantity());
    }
}
