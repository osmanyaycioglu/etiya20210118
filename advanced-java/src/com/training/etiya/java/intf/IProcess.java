package com.training.etiya.java.intf;


public interface IProcess extends IBaseProcess {

    public static final String os = "100";

    String process(String str);

    default void testMe() {
        System.out.println("test me");
    }

    public static boolean StrTestEmpty(final String str) {
        return (str == null) || str.isEmpty();
    }

}
