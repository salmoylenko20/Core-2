package com.example.core1.list;

import java.util.List;

public class ListThread extends Thread{

    private final List<Integer> list;

    public ListThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 400; i++) {
            list.add(i);
        }
    }
}
