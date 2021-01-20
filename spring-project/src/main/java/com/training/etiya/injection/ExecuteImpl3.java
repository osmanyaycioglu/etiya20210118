package com.training.etiya.injection;

public class ExecuteImpl3 implements IExecute {

    private final String str;

    public ExecuteImpl3(final String str) {
        this.str = str;
    }

    @Override
    public String execute() {
        return "execute " + this.str;
    }

}
