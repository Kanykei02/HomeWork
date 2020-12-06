package com.company;

import java.time.LocalDate;

public class Human {
    String name;
    String searname;
    String patronymic;
    int date;
    String hobbi;
    String gender;
    int currentYear = LocalDate.now().getYear();

    public Human(){}
    public Human(String name, String searname, String patronymic, int date, String hobbi, String gender){
        this.name = name;
        this.searname = searname;
        this.patronymic = patronymic;
        this.date = date;
        if (hobbi == null) {
            System.out.println("У меня нет хобби");
        } else {
            System.out.println("Мое хобби это: " + getHobbi());
        }
        this.hobbi = hobbi;
        this.gender = gender;
    }
    public Human(String name, String searname, String patronymic, int date, String gender){
        this.name = name;
        this.searname = searname;
        this.patronymic = patronymic;
        this.date = date;
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSearname(String searname) {
        this.searname = searname;
    }
    public String getSearname() {
        return searname;
    }
    public void setPatronymic() {
        this.patronymic = patronymic;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public int getDate() {
        return date;
    }
    public void setHobbi(String hobbi) {
        if (hobbi == null) {
            System.out.println("У меня нет хобби");
        } else {
            System.out.println("Мое хобби это: " + getHobbi());
        }
        this.hobbi = hobbi;
    }
    public String getHobbi() {
        return hobbi;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
//    public int getAge(){
//        return currentYear - date;
//    }
}
