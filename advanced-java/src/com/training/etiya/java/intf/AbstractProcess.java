package com.training.etiya.java.intf;


public abstract class AbstractProcess implements IProcess, ISendIntf {


    private final String retValue;

    public AbstractProcess(final String retValue) {
        this.retValue = retValue;
    }

    @Override
    public String base() {
        this.sendTestMe();
        this.testMe();
        return "Base ";
    }

    @Override
    public String second() {
        this.sendTestMe();
        return this.retValue;
    }


}
