package com.training.etiya.java.singleton;


public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return EagerSingleton.instance;
    }


    public void helloworld() {
        System.out.println("hello world");
    }

}
