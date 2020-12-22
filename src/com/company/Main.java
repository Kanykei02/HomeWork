package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        City bishkek = new City("Бишкек", "Түлөбаев Балбак Зарлыкович");
        City naryn = new City("Нарын", "Нурбек Молдокадыров");
        City kol = new City("Каракол","Каниметов Адыл Жанкорозович");
        Village maevka = new Village("Маевка", "Человек");
        Village akmuz = new Village("Акмуз", "Насыров");
        District sverlov = new District("Свердловский", "Человек1");

        AbstractLocality[] array = {bishkek, naryn, kol, maevka, akmuz, sverlov};
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }

    }
}
