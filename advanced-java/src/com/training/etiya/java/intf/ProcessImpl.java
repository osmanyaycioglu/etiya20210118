package com.training.etiya.java.intf;

public class ProcessImpl extends AbstractProcess {


    public ProcessImpl() {
        super("Second");
    }

    @Override
    public String process(final String strParam) {
        return "Processed : " + strParam + " " + this.base();
    }


}
