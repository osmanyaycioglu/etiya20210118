package com.training.etiya.java.proxy;


public class MyObjectFactory {

    public static MyObject getMyObject() {
        return new MyObjectProxy(new MyObject());
    }
}
