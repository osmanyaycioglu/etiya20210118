package com.training.etiya.java.lambda;


public class MyExecObj {

    private final String str;
    private final int    index;

    public MyExecObj(final String strParam,
                     final int indexParam) {
        super();
        this.str = strParam;
        this.index = indexParam;
    }


    public MyExecObj execTeo(final IExecutorTwo exec) {
        exec.execute(this.str,
                     this.index);
        return this;
    }

    public MyExecObj exec(final IExecutor exec) {
        exec.execute(this.str);
        return this;
    }

}
