package com.example.barrier;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BarrierDemo {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetails.values().length,() -> System.out.println("Пуск"));

        ExecutorService threadPool = Executors.newCachedThreadPool();

        Arrays.stream(RocketDetails.values())
                .map(detail -> new RocketDetailRunnable(detail,cyclicBarrier))
                .forEach(threadPool::submit);

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.MINUTES);
    }
}
