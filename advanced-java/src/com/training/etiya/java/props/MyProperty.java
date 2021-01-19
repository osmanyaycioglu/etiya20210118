package com.training.etiya.java.props;

import com.training.etiya.java.validation.EmptyCheck;
import com.training.etiya.java.validation.SizeCheck;

@PropFile("prop.properties")
public class MyProperty {

    @EmptyCheck
    @Prop("app.conf.name")
    private String appName;
    @Prop("app.conf.port")
    private int    port;
    @EmptyCheck
    @SizeCheck(min = 10, max = 20, message = "test 10 ile 20 arasında olmalı")
    @Prop("app.conf.test")
    private String test;
    @EmptyCheck
    @Prop("xyz.abc.deneme")
    private String deneme;
    @EmptyCheck
    @Prop("test.mest")
    private String testMest;
    @Prop("connection.port")
    private int    connectionPort;

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(final String appNameParam) {
        this.appName = appNameParam;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(final int portParam) {
        this.port = portParam;
    }

    public String getTest() {
        return this.test;
    }

    public void setTest(final String testParam) {
        this.test = testParam;
    }

    public String getDeneme() {
        return this.deneme;
    }

    public void setDeneme(final String denemeParam) {
        this.deneme = denemeParam;
    }

    public String getTestMest() {
        return this.testMest;
    }

    public void setTestMest(final String testMestParam) {
        this.testMest = testMestParam;
    }

    @Override
    public String toString() {
        return "MyProperty [appName="
               + this.appName
               + ", port="
               + this.port
               + ", test="
               + this.test
               + ", deneme="
               + this.deneme
               + ", testMest="
               + this.testMest
               + ", connectionPort="
               + this.connectionPort
               + "]";
    }

    public int getConnectionPort() {
        return this.connectionPort;
    }

    public void setConnectionPort(final int connectionPortParam) {
        this.connectionPort = connectionPortParam;
    }


}
