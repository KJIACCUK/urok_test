package com.Peregruzka;

public class Peregruz {

    private int name = 0;
    private int nad = 0;

    public Peregruz(int name){
        this.name = name;
        System.out.println(name);
    }

    public Peregruz(int name, int nad){
        this.name = name;
        this.nad = nad;
        System.out.println(name + nad);
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
        System.out.println(name);
    }

    public Peregruz(){}

}
