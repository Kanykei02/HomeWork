package com.company;

public class Monkey implements Climable, Fruits{
    private Climable climable;

    public Climable getClimable() {
        return climable;
    }

    public void setClimable(Climable climable) {
        this.climable = climable;
    }

    @Override
    public void climb(){
        System.out.println("Monkey can climb.");
    }
    @Override
    public void eat(){
        System.out.println("Monkey eats edible fruits.");
    }
    @Override
    public String toString(){
        return "Monkey";
    }
}
