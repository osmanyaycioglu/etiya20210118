package com.training.etiya.java.memory;


public class MyObjectRunner {


    public static void main(final String[] args) {
        MyObject m1 = new MyObject();
        MyObject m1a = m1;
        int a = 100;
        long b = 1000L;
        int[] ia = new int[10];

        {
            MyObject m2 = new MyObject();
            m1.getAbc();
        }
        MyObject m2 = new MyObject();
        MyObject m3 = new MyObject();

    }
}
