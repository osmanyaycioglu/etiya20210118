package com.training.etiya.java.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Concurrent {

    public static void main(final String[] args) {
        int threadCount = 5;
        CountDownLatch downLatchLoc = new CountDownLatch(threadCount);
        long delta = System.currentTimeMillis();
        List<Counter> countersLoc = new ArrayList<>();

        for (int iLoc = 0; iLoc < 5; iLoc++) {
            Counter counterLoc = new Counter();
            countersLoc.add(counterLoc);
            MyThread myThreadLoc = new MyThread(downLatchLoc,
                                                counterLoc);
            myThreadLoc.setName("Runner-" + iLoc);
            myThreadLoc.start();
        }

        try {
            downLatchLoc.await();
            System.out.println("Delta : " + (System.currentTimeMillis() - delta));
            long total = 0;
            for (int iLoc = 0; iLoc < threadCount; iLoc++) {
                total += countersLoc.get(iLoc).counter;
            }
            System.out.println("Counter : " + total);
        } catch (Exception eLoc) {
            // TODO: handle exception
        }
    }


}
