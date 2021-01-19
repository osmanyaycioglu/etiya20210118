package com.training.etiya.java.intf;

public class ProcessImpl4 extends AbstractProcess {


    public ProcessImpl4() {
        super("Second4");
    }

    @Override
    public String process(final String strParam) {
        return "Processed 4 : " + strParam + " " + this.base();
    }

    @Override
    public String base() {
        return "Base 4";
    }

}
