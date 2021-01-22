package com.training.etiya.java.multithread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class MyThread extends Thread {

    private final CountDownLatch downLatch;
    private final Counter        counter2;
    public static long           counter  = 0;
    public static AtomicLong     acounter = new AtomicLong();

    public MyThread(final CountDownLatch downLatchParam,
                    final Counter counterParam) {
        this.downLatch = downLatchParam;
        this.counter2 = counterParam;
    }

    public static synchronized void count() {
        MyThread.counter++;
    }

    @Override
    public void run() {
        for (int iLoc = 0; iLoc < 100_000_000; iLoc++) {
            MyThread.acounter.incrementAndGet();
            // MyThread.count();
            // this.counter2.counter++;
        }
        this.downLatch.countDown();
    }

}
