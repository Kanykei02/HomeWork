package com.company;

public class Main {

    public static void main(String[] args) {
        Shop dress = new Shop(3000, 2);//ссори за позднюю здачу, я в целом поняла как это решается, но не до конца)
        Shop phone = new Shop(1000, 10);
        Shop notebook = new Shop(20000, 2);

        System.out.println(dress.buy());
        System.out.println(phone.order());
        System.out.println(notebook.order());
    }
}
