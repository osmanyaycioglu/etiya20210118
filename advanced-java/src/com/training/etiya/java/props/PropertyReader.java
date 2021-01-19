package com.training.etiya.java.props;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

    public static void main(final String[] args) {
        try {
            Properties propertiesLoc = new Properties();
            File file = new File("prop.properties");
            FileInputStream fileInputStreamLoc = new FileInputStream(file);
            propertiesLoc.load(fileInputStreamLoc);

            MyProperty myPropertyLoc = new MyProperty();
            myPropertyLoc.setAppName(propertiesLoc.getProperty("app.conf.name"));
            myPropertyLoc.setTest(propertiesLoc.getProperty("app.conf.test"));
            myPropertyLoc.setDeneme(propertiesLoc.getProperty("xyz.abc.deneme"));
            myPropertyLoc.setPort(Integer.parseInt(propertiesLoc.getProperty("app.conf.port")));
            myPropertyLoc.setTestMest(propertiesLoc.getProperty("test.mest"));
            myPropertyLoc.setConnectionPort(Integer.parseInt(propertiesLoc.getProperty("connection.port")));
            System.out.println(myPropertyLoc);
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
