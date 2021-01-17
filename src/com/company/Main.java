package com.company;

public class Main {

    public static void main(String[] args) {
        Swimmible[] ocean = new Swimmible[3];
        for(int i = 0; i < ocean.length; i++){
            ocean[0] = new Whale();
            ocean[1] = new Ship();
            ocean[2] = new Shark();
        }
        IRunning[] run = new IRunning[2];
        for(int i = 0; i < ocean.length; i++){
            run[0] = new Human();
            run[1] = new Cat();
        }
        IFlying[] flyings = new IFlying[3];
        for(int i = 0; i < ocean.length; i++){
            flyings[0] = new Parrot();
            flyings[1] = new Airplane();
            flyings[2] = new Duck();
        }

        for(Swimmible swimmi : ocean){
            swimmi.swim();
        }
        for(IRunning runny : run){
            runny.running();
        }
        for(IFlying flyingss : flyings){
            flyingss.flying();
        }
    }
}
