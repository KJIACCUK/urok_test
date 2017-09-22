package com.Polimorfizm;

public class Main {

    public static void main(String[] args) {
        Animal[] an = new Animal[]{new Dog(), new Cat()};
        for(int i = 0; i<an.length; i++){
            an[i].drav();
        }
    }
}
