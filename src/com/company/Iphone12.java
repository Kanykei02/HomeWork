package com.company;

public class Iphone12 extends Iphone {
    int generations;
    double weight;

    public Iphone12() {}

    public Iphone12(String name, int dateOfManufacture, double inchScreen, double camera, String networks, int generations, double weight) {
        super(name, dateOfManufacture, inchScreen, camera, networks);
        this.generations = generations;
        this.weight = weight;
    }

    public int getGenerations() {
        return generations;
    }

    public void setGenerations(int generations) {
        this.generations = generations;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String info = "Name is " + this.name + ", year of manufacture is " + this.dateOfManufacture +
                ", inch screen is " + this.inchScreen + ". Camera is " + this.camera + " megapixels " +
                ", network is " + this.networks + "G." + " Generation is " + this.generations + ", weight is " +
                this.weight + " gram.";
        return info;
    }
}
