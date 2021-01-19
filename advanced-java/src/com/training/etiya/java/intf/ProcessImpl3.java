package com.training.etiya.java.intf;

public class ProcessImpl3 extends AbstractProcess {


    public ProcessImpl3() {
        super("Second 3");
    }

    @Override
    public String process(final String strParam) {
        return "Processed 3 : " + strParam + " " + this.base();
    }


}
