package com.company;

public class SanAntonio extends AbstractLocality{
    public SanAntonio() {
    }

    public SanAntonio(String name, String leader) {
        super(name, leader);
    }

    public void districts(){
        int sanAntonio1[] = {1, 1, 1, 1};
        for(int i = 0; i < sanAntonio1.length; i++) {
            System.out.println(sanAntonio1[i]);
        }
    }

    @Override
    public void search(){
        if (getLeader() == getLeader()) {
            System.out.println("Нашли!");
        }
    }
}
