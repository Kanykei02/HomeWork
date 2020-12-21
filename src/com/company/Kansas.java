package com.company;

public class Kansas extends AbstractLocality{
    public Kansas() {
    }

    public Kansas(String name, String leader) {
        super(name, leader);
    }

    @Override
    public void districts(){
        int kansass[] = {1, 1, 1, 1};
        for(int i = 0; i < kansass.length; i++) {
            System.out.println(kansass[i]);
        }
    }

    @Override
    public void search(){
        if (getLeader() == getLeader()) {
            System.out.println("Нашли!");
        }
    }
}
