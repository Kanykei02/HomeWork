package com.company;

public class Village extends AbstractLocality{
    static Village[] arr = new Village[6];
    public Village() {
    }

    public Village(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString(){
        String info = "Название села: " + getName() + ", айыл-окмоту: " + getLeader();
        return info;
    }
}
