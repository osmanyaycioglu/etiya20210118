package com.training.etiya.java.generics;

import com.training.etiya.java.intf.IProcess;

public class ProcessGen<O extends IProcess> {

    private final O o;

    public ProcessGen(final O o) {
        this.o = o;
    }

    public void process(final String str) {
        this.o.process(str);
    }

}
