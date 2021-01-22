package com.training.etiya.java.lambda;

@FunctionalInterface
public interface IExecutor {

    String execute(String str);

    default String preExec(final String stringParam) {
        return stringParam + this.execute(stringParam);
    }

}
