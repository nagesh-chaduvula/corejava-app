package com.java.standard.generics.basics;

public class Aquarium<T> {
    private T fish1;
    private T fish2;

    public Aquarium(T fish1, T fish2) {
        this.fish1 = fish1;
        this.fish2 = fish2;
    }

    public T getFish1() {
        return fish1;
    }

    public T getFish2() {
        return fish2;
    }

}
