package com.training.etiya.java.generics;

import com.training.etiya.java.intf.ProcessImpl;

public class ProcessRunner {

    public static void main(final String[] args) {
        ProcessGen<ProcessImpl> genLoc = new ProcessGen<>(new ProcessImpl());
        genLoc.process("test");


    }
}
