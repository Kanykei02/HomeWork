package com.company;

public class Days {
    private String name;

    public Days(){}

    public Days(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Days days = (Days) obj;

        return days.getName().equals(name);

    }

    @Override
    public int hashCode() {
        return 12;
    }
}
