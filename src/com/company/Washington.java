package com.company;

public class Washington extends AbstractLocality{
    public Washington() {
    }

    public Washington(String name, String leader) {
        super(name, leader);
    }

    public void districts(){
        int washington1[] = {1, 1, 1, 1};
        for(int i = 0; i < washington1.length; i++) {
            System.out.println(washington1[i]);
        }
    }

    @Override
    public void search(){
        if (getLeader() == getLeader()) {
            System.out.println("Нашли!");
        }
    }
}
