package com.example.pool;


import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
        threadPool.schedule(()-> System.out.println("Ok"), 3L,TimeUnit.SECONDS);

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");
    }
    private static void test() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool.submit(()->{
            System.out.println("Yes");
            return 1;
        });

        System.out.println("Result " + future.get());

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");
    }
}
