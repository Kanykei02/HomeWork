package com.company;

public class Thread2 extends Thread{
    @Override
    public void run() {
        Variable.number /= 2;
    }
}
