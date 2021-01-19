package com.training.etiya.java.enums;


public enum EState implements ITestIntf {

    BOOT("boot", 100) {

        @Override
        public void test() {
            System.out.println("test run boot");
        }

    },
    STARTUP("startup", 101),
    RUNNING("running", 102) {

        @Override
        public void exec() {
            this.test();
            System.out.println("Estate running");
        }

        @Override
        public void test() {
            System.out.println("test");
        }

    },
    STOPPED("stopped", 103) {

        @Override
        public void exec() {
            System.out.println("Estate running");
        }

    };


    private final String str;
    private final int    iVal;

    private EState(final String str,
                   final int iVal) {
        this.str = str;
        this.iVal = iVal;

    }

    public String getStr() {
        return this.str;
    }

    public int getiVal() {
        return this.iVal;
    }

    public void exec() {
        System.out.println("Estate general");
    }

    @Override
    public void test() {
        System.out.println("test run");
    }

}
