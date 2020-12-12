package com.company;

public class Iphone7plus extends Iphone {
    double phoneThickness;
    String wiredHeadphones;
    String protection;

    public Iphone7plus() {}

    public Iphone7plus(String name, int dateOfManufacture, double inchScreen, double camera, String networks, double phoneThickness, String wiredHeadphones, String protection) {
        super(name, dateOfManufacture, inchScreen, camera, networks);
        this.phoneThickness = phoneThickness;
        this.wiredHeadphones = wiredHeadphones;
        this.protection = protection;
    }

    public double getPhoneThickness() {
        return phoneThickness;
    }

    public void setPhoneThickness(double phoneThickness) {
        this.phoneThickness = phoneThickness;
    }

    public String getWiredHeadphones() {
        return wiredHeadphones;
    }

    public void setWiredHeadphones(String wiredHeadphones) {
        this.wiredHeadphones = wiredHeadphones;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        String info = "Name is " + this.name + ", year of manufacture is " + this.dateOfManufacture +
                ", inch screen is " + this.inchScreen + ". Camera is " + this.camera + " megapixels " +
                ", network is " + this.networks + "G." + " Phone thickness is " + this.phoneThickness +
                ", Wired headphones: " + this.wiredHeadphones + ", protection is " + this.protection;
        return info;
    }
}
