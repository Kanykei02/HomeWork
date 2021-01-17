package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //Zadacha A Zadacha B
        FileReader fileReader = new FileReader("src\\CarryOnMy.txt");
        Scanner sc = new Scanner(fileReader);
        FileWriter fileWriter = new FileWriter("CarryOn.txt");
        while (sc.hasNextLine()){
            String lyrics = sc.nextLine();
            System.out.println(lyrics);
            fileWriter.write(lyrics + "\n");
        }
        fileReader.close();
        fileWriter.close();
    }
}
