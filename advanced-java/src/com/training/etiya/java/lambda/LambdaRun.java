package com.training.etiya.java.lambda;

import java.util.HashMap;
import java.util.Map;

public class LambdaRun {

    public static void main(final String[] args) {
        String str = "pref";
        Map<String, String> myMap = new HashMap<>();

        IExecutor exec = new IExecutor() {

            @Override
            public String execute(final String strParam) {
                myMap.put(strParam,
                          str);
                return "Merhaba " + strParam + " " + str;
            }
        };
        IExecutor exec3 = new IExecutor() {

            @Override
            public String execute(final String strParam) {
                return "Ola " + strParam + " " + str;
            }
        };

        IExecutor exec4 = x -> {
            myMap.put(x,
                      str);
            return "Merhaba " + x + " " + str;
        };

        IExecutor exec5 = x -> "Ola " + x + " " + str;


        IExecutor exec2 = new MyExecutorImpl();

        System.out.println(exec.execute("osman"));
        System.out.println(exec4.execute("osman"));

        System.out.println(exec2.execute("osman"));
        System.out.println(exec3.execute("osman"));
        System.out.println(exec5.execute("osman"));
    }
}
