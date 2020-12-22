package com.company;

public class Village extends AbstractLocality{
    static Village[] arr = new Village[6];
    public Village() {
    }

    public Village(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString(){
        String info = "Название села: " + getName() + ", айыл-окмоту: " + getLeader();
        return info;
    }

//    public static void find(String name){
//        for (int i = 0; i < arr.length; i++){
//            if(name.equals(arr[i].getLeader())){
//                System.out.println("Нашли");
//            }
//        }
//    }
}
