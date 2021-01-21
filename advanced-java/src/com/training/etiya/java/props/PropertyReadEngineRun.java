package com.training.etiya.java.props;


public class PropertyReadEngineRun {

    public static void main(final String[] args) {
        PropertyReadEngine pe = new PropertyReadEngine();
        MyProperty mp = pe.readPropery(MyProperty.class);
        System.out.println(mp);

        MyTestProp readProperyLoc = pe.readPropery(MyTestProp.class);
        System.out.println(readProperyLoc);
    }
}
