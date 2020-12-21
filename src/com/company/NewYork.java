package com.company;

public class NewYork extends AbstractLocality{
    public NewYork() {
    }

    public NewYork(String name, String leader) {
        super(name, leader);
    }

    @Override
    public void districts(){
        int newYork1[] = {1, 1, 1, 1};
        for(int i = 0; i < newYork1.length; i++) {
            System.out.println(newYork1[i]);
        }
    }

    @Override
    public void search(){
        if (getLeader() == getLeader()) {
            System.out.println("Нашли!");
        }
    }
}
