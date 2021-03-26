package com.company;

public class Thread3 extends Thread{
    @Override
    public void run() {
        Variable.number += 2;
    }
}
