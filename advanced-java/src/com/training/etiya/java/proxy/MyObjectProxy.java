package com.training.etiya.java.proxy;


public class MyObjectProxy extends MyObject {

    private final MyObject myObject;


    public MyObjectProxy(final MyObject myObjectParam) {
        super();
        this.myObject = myObjectParam;
    }

    @Override
    public void hello() {
        System.out.println("log for hello");
        this.myObject.hello();
    }

    @Override
    public void run() {
        // Start trans
        System.out.println("log for run");

        this.myObject.run();
        // commit trans
    }


}
