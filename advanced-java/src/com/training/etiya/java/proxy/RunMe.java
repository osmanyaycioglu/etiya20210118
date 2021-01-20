package com.training.etiya.java.proxy;


public class RunMe {

    public static void main(final String[] args) {
        MyObject myObjectLoc = MyObjectFactory.getMyObject();
        myObjectLoc.hello();
        myObjectLoc.run();
    }
}
