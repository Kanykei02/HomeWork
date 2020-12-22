package com.company;

public class District extends AbstractLocality{
    public District() {
    }

    public District(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString(){
        String info = "Название района: " + getName() + ", аким: " + getLeader();
        return info;
    }

}
