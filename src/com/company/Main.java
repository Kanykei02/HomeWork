package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AbstractLocality kansas = new Kansas("Kansas , ", "Stive");
        kansas.districts();
        System.out.println(kansas.getName() + kansas.getLeader());
        kansas.search();
        AbstractLocality newyork = new NewYork("NewYork , ", "Mark");
        newyork.districts();
        System.out.println(newyork.getName() + newyork.getLeader());
        newyork.search();
        AbstractLocality washington = new Washington("Washington , ", "Billy");
        washington.districts();
        System.out.println(washington.getName() + washington.getLeader());
        washington.search();
        AbstractLocality finix = new Finix("Finix , ", "Mark");
        finix.districts();
        System.out.println(finix.getName() + finix.getLeader());
        finix.search();
        AbstractLocality sanAntonio = new SanAntonio("San-Antonio , ", "Cas");
        sanAntonio.districts();
        System.out.println(sanAntonio.getName() + sanAntonio.getLeader());
        sanAntonio.search();
    }
}
