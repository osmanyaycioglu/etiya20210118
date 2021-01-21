package com.training.etiya.java.generics;

import com.training.etiya.java.immutable.Person3;
import com.training.etiya.java.intf.IProcess;
import com.training.etiya.java.intf.ProcessImpl2;

public class MethodGen {

    public static <R extends IProcess> String process(final R r) {
        return r.process("test");
    }

    public static <R> R getInstance(final Class<R> clazz) throws Exception {
        return clazz.newInstance();
    }

    public static void main(final String[] args) throws Exception {
        String processLoc = MethodGen.process(new ProcessImpl2());
        Person3 person3Loc = MethodGen.getInstance(Person3.class);
    }

}
