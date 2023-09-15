package com.example.core1.volatail;

public class VolatileDemo {

    private static volatile boolean flag;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(()-> {
            while (!flag) {
                System.out.println("still false");
            }
        });

        thread1.start();



        Thread thread2 = new Thread(()-> {
            if (!flag) {
                flag = true;
                System.out.println("flag is true");
            }
        });

        thread2.start();
    }
}
