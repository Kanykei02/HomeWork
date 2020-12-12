package com.company;

public class Iphone {
    String name;
    int dateOfManufacture;
    double inchScreen;
    double camera;
    String networks;

    public Iphone() {}

    public Iphone(String name, int dateOfManufacture, double inchScreen, double camera, String networks) {
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
        this.inchScreen = inchScreen;
        this.camera = camera;
        this.networks = networks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getInchScreen() {
        return inchScreen;
    }

    public void setInchScreen(double inchScreen) {
        this.inchScreen = inchScreen;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    public String getNetworks() {
        return networks;
    }

    public void setNetworks(String networks) {
        this.networks = networks;
    }

    @Override
    public String toString() {
        String info = "Name is " + this.name + ", year of manufacture is " + this.dateOfManufacture +
                ", inch screen is " + this.inchScreen + ". Camera is " + this.camera + " megapixels " +
                ", network is " + this.networks + "G.";
        return info;
    }
}
