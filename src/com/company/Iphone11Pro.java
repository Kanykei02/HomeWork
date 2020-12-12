package com.company;

public class Iphone11Pro extends Iphone {
    String cpu;
    String displays;
    int frontCamera;

    public Iphone11Pro() {}

    public Iphone11Pro(String name, int dateOfManufacture, double inchScreen, double camera, String networks, String cpu, String displays, int frontCamera) {
        super(name, dateOfManufacture, inchScreen, camera, networks);
        this.cpu = cpu;
        this.displays = displays;
        this.frontCamera = frontCamera;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisplays() {
        return displays;
    }

    public void setDisplays(String displays) {
        this.displays = displays;
    }

    public int getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(int frontCamera) {
        this.frontCamera = frontCamera;
    }

    @Override
    public String toString() {
        String info = "Name is " + this.name + ", year of manufacture is " + this.dateOfManufacture +
                ", inch screen is " + this.inchScreen + ". Camera is " + this.camera + " megapixels " +
                ", network is " + this.networks + "G." + " Cpu is " + this.cpu + ", display is " +
                this.displays + ", front camera is " + this.frontCamera + " megapixels.";
        return info;
    }
}
