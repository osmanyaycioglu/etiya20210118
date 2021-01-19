package com.training.etiya.java.props;


public class PropertyReadEngineRun {

    public static void main(final String[] args) {
        PropertyReadEngine pe = new PropertyReadEngine();
        MyProperty mp = (MyProperty) pe.readPropery(MyProperty.class);
        System.out.println(mp);
        MyTestProp readProperyLoc = (MyTestProp) pe.readPropery(MyTestProp.class);
        System.out.println(readProperyLoc);
    }
}
