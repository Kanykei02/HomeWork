package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Days monday = new Days("Пн");
        Days tuesday = new Days("Вт");
        Days wednesday = new Days("Ср");
        Days thursday = new Days("Чт");
        Days friday = new Days("Пт");
        Days saturday = new Days("Сб");
        Days sunday = new Days("Вс");

        Days[] days = {monday, tuesday, wednesday, thursday, friday, saturday, sunday};

        Map<Days, Integer> daysOfTheWeek = new LinkedHashMap<>();

        for (int i = 0; i < 100; i++) {
            Days daysOfWeek = days[random.nextInt(7)];
            int count = daysOfTheWeek.getOrDefault(daysOfWeek, 0);
            daysOfTheWeek.put(daysOfWeek, ++count);
        }

        System.out.println(daysOfTheWeek);
    }
}
