package com.company;

public abstract  class AbstractLocality {
    private String name;
    private String leader;

    public AbstractLocality(){}

    public AbstractLocality(String name, String leader) {
        this.name = name;
        this.leader = leader;
    }

    public abstract void districts();

    public abstract void search();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}
