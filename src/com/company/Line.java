package com.company;

public final class Line {
     int x;
     int y;

     public Line(){}

    public Line(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return getX() * getX();
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY2() {
         return getX() * getX() * getX();
    }
}
