package com.training.etiya.java.intf;


public interface ISendIntf {

    String second();

    default void sendTestMe() {
        System.out.println("send test me");
    }
}
