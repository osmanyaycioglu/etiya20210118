package com.training.etiya.java.lambda;


public class MyExecutorImpl implements IExecutor {

    @Override
    public String execute(final String strParam) {
        return "Hello " + strParam;
    }

}
