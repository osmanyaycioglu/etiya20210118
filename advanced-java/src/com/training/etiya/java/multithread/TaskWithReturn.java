package com.training.etiya.java.multithread;

import java.util.Random;
import java.util.concurrent.Callable;

public class TaskWithReturn implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello world " + new Random().nextInt();
    }

}
