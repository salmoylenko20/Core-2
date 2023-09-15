package com.example.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunnable implements Runnable {

    private final RocketDetails rocketDetails;
    private final CyclicBarrier cyclicBarrier;

    public RocketDetailRunnable(RocketDetails rocketDetails, CyclicBarrier cyclicBarrier) {
        this.rocketDetails = rocketDetails;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("Готовится делаль " + rocketDetails);
        try {
            Thread.sleep(2000);
            System.out.println("Деталь готова " + rocketDetails);
            cyclicBarrier.await();
            System.out.println("Деталь использована " + rocketDetails);
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
