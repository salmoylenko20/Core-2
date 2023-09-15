package com.example.core1.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<CashBox> cashbox;

    public BuyerThread(BlockingQueue<CashBox> cashbox) {
        this.cashbox = cashbox;
    }

    @Override
    public void run() {
         try {
             CashBox take = cashbox.take();
             Thread.sleep(5L);
             System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + take);
             cashbox.add(take);
             System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + take);

         } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

