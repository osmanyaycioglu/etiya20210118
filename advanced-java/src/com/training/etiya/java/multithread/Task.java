package com.training.etiya.java.multithread;


public class Task implements Runnable {


    private final Counter counter;

    public Task(final Counter counterParam) {
        this.counter = counterParam;
    }

    @Override
    public void run() {
        this.counter.counter++;
    }

}
