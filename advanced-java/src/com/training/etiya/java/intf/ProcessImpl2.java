package com.training.etiya.java.intf;

public class ProcessImpl2 extends AbstractProcess {


    public ProcessImpl2() {
        super("Second 2");

    }

    @Override
    public String process(final String strParam) {
        return "Processed 2 : " + strParam + " " + this.base();
    }


}
