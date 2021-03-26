package com.company;

public class Thread4 extends Thread{
    @Override
    public void run() {
        Variable.number -= 2;
    }
}
