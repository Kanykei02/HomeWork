package com.company;

public class City extends AbstractLocality{
    static City[] array = new City[6];
    public City() {
    }

    public City(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString(){
        String info = "Название города: " + getName() + ", мэр города: " + getLeader();
        return info;
    }

//    public static void find(String name){
//        for (int i = 0; i < array.length; i++){
//            if(name.equals(array[i].getLeader())){
//                System.out.println("Нашли");
//            }
//        }
//    }
}
