package com.company;

public class Finix extends AbstractLocality{
    public Finix() {
    }

    public Finix(String name, String leader) {
        super(name, leader);
    }

    public void districts(){
        int finix1[] = {1, 1, 1, 1};
        for(int i = 0; i < finix1.length; i++) {
            System.out.println(finix1[i]);
        }
    }

    @Override
    public void search(){
        if (getLeader() == getLeader()) {
            System.out.println("Нашли!");
        }
    }
}
