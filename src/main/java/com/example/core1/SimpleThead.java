package com.example.core1;

public class SimpleThead extends Thread{



    @Override
    public void run() {
        setName("Первый поток");
        System.out.println("Hello " + getName());
    }
}
