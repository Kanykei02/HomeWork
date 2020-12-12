package com.company;

public class Main {

    public static void main(String[] args) {
        Iphone firstIphone = new Iphone("First Iphone", 2007, 3.5, 2, "2");
        System.out.println(firstIphone);
        Iphone7plus plus7 = new Iphone7plus("Iphone 7 plus", 2016, 4.7, 12, "3", 7.3, "Yes", "IP67");
        System.out.println(plus7);
        Iphone11Pro pro = new Iphone11Pro("Iphone 11 Pro", 2019, 5.8, 12, "4", "Apple A13 ", " OLED", 12);
        System.out.println(pro);
        Iphone12 phone = new Iphone12("Iphone 12", 2020, 5.4, 12, "5", 14, 167);
        System.out.println(phone);
    }
}
