package com.example.core1.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();

        ListThread listThread = new ListThread(arrayList);
        ListThread listThread1 = new ListThread(arrayList);
        ListThread listThread2 = new ListThread(arrayList);
        ListThread listThread3 = new ListThread(arrayList);
        ListThread listThread4 = new ListThread(arrayList);
        ListThread listThread5 = new ListThread(arrayList);
        ListThread listThread6 = new ListThread(arrayList);
        ListThread listThread7 = new ListThread(arrayList);

        listThread.start();
        listThread1.start();
        listThread2.start();
        listThread3.start();
        listThread4.start();
        listThread5.start();
        listThread6.start();
        listThread7.start();

        listThread.join();
        listThread1.join();
        listThread2.join();
        listThread3.join();
        listThread4.join();
        listThread5.join();
        listThread6.join();
        listThread7.join();

        System.out.println(arrayList);
    }

}
