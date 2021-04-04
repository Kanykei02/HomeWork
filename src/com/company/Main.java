package com.company;

import java.util.*;

public class Main {

    static Random ran = new Random();

    public static void main(String[] args) {
        arrayList();
        arrayList2();
        arrayList3();

        linkedList();
        linkedList2();
        linkedList3();

        array();
        array2();
        array3();
    }
    public static void arrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            list.add(ran.nextInt(5));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void arrayList2(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            list.add(ran.nextInt(5));
        }
        System.out.println(list);
        CL cl1 = new CL();
        list.sort(cl1);
        System.out.println(list);
    }
    public static void arrayList3(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            list.add(ran.nextInt(5));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int minId = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minId = j;
                }
            }
            int temp = list.get(i);
            list.set(i, min);
            list.set(minId, temp);
        }
        System.out.println(list);
    }
    public static void linkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 30; i++){
            list.add(ran.nextInt(5));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void linkedList2(){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 30; i++){
            list.add(ran.nextInt(5));
        }
        System.out.println(list);
        CL cl2 = new CL();
        list.sort(cl2);
        System.out.println(list);
    }
    public static void linkedList3(){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(ran.nextInt(2));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            int minId = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minId = j;
                }
            }
            int temp = list.get(i);
            list.set(i, min);
            list.set(minId, temp);
        }
        System.out.println(list);
    }
    public static void array(){
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(5);

            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    public static void array2(){
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(5);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    public static void array3(){
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(5);

            System.out.print(array[i] + " ");
        }

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int values : array) {
            System.out.print(values + " ");
        }
    }
}
