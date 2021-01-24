package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
	    //Zadacha A
        List<String> text = new ArrayList<>();
        List<String> newList = new ArrayList<>();
        text.add("Ветер с моря дул");
        text.add("Нагонял беду");
        text.add("И сказал ты мне");
        text.add("Больше не приду");

        for(int i = 0; i < text.size(); i = i + 2){
            text.add(i + 1, text.get(i));

            if(text.get(i).length() >= 15){
                newList.add(text.get(i));
            }
        }

        System.out.println(text);
        System.out.println(newList);

        for(int i = 0; i < newList.size(); i++){
            if (newList.get(i).equals("И сказал ты мне")){
                newList.remove(i);
            }
        }
        System.out.println(newList);

        //Zadacha B
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int i = 0; i <= 50; i++){
            int ran = rand.nextInt(100);
            arrayList.add(ran);

            if(ran % 2 == 0){
                evenList.add(ran);
            }
            else {
                oddList.add(ran);
            }
        }

        System.out.println(arrayList);
        System.out.println(evenList);
        System.out.println(oddList);
    }
}
