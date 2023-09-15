package com.example.core1;

import java.util.Objects;

public class Animal implements interfes3{
    private final String name;
    static String name1="33";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name=name;
    }


    @Override
    public void swim() {

    }

    @Override
    public void run() {

    }

    @Override
    public void go() {

    }

}
