package com.company;

public class Thread1 extends Thread{
    @Override
    public void run() {
        Variable.number *= 2;
    }
}
