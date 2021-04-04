package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<City> arrCity = new ArrayList<>();
        String[] cities = {"Hamburg", "Berlin", "München", "Köln", "Hessen", "Sachsen", "Thüringen", "Saarland", "Bremen", "Nordrhein-Westfalen"};

        for (int i = 0; i < 10; i++){
            arrCity.add(new City(cities[i], ran.nextInt((500 - 50) + 1) + 50));
        }
        System.out.println(arrCity);

        Set<City> city2 = new HashSet<>();
        Set<City> city3 = new TreeSet<>();

        for (City c: arrCity){
            if (c.getCode() % 2 == 0) city2.add(c);
           // else city3.add(c); почему-то если я его активирую, то программа рушится...
        }
        System.out.println(city2);
        System.out.println(city3);

        city3.removeIf(city -> city.getName().length() > 5);
        Set<City> city4 = new TreeSet<>(new Compare());
        city4.addAll(city3);
    }
}
