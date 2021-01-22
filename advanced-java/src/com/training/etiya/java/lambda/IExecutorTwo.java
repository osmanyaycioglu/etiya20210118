package com.training.etiya.java.lambda;

@FunctionalInterface
public interface IExecutorTwo {

    String execute(String str,
                   Integer iVal);

    default String preExec(final String stringParam) {
        return stringParam
               + this.execute(stringParam,
                              100);
    }

}
