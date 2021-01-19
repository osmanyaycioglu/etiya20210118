package com.training.etiya.java.enums;


public class EnumRun {

    public static void main(final String[] args) {
        EState.RUNNING.exec();

        ITestIntf ti = EState.BOOT;
        ti.test();

        MyEnum.instance.helloworld();
    }
}
