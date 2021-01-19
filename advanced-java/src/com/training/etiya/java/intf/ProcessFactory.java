package com.training.etiya.java.intf;


public class ProcessFactory {

    public static IProcess getProcess(final int index) {
        switch (index) {
            case 1:
                return new ProcessImpl();
            case 2:
                return new ProcessImpl2();
            case 3:
                return new ProcessImpl3();
            case 4:
                return new ProcessImpl4();
            default:
                return new ProcessImpl();
        }
    }
}
