package com.training.etiya.java.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Concurrent2 {

    public static void main(final String[] args) {
        ExecutorService newFixedThreadPoolLoc = Executors.newFixedThreadPool(5);
        //        Counter counterLoc = new Counter();
        //        for (int iLoc = 0; iLoc < 100_000_000; iLoc++) {
        //            newFixedThreadPoolLoc.execute(new Task(counterLoc));
        //        }
        Future<String> submitLoc = newFixedThreadPoolLoc.submit(new TaskWithReturn());
        // Extra process
        try {
            if (submitLoc.isDone()) {

            }
            String string2Loc = submitLoc.get(100,
                                              TimeUnit.MILLISECONDS);
            String stringLoc = submitLoc.get();
            System.out.println("cevap : " + stringLoc);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
