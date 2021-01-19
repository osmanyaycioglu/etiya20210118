package com.training.etiya.java.validation;


import com.training.etiya.java.props.MyProperty;
import com.training.etiya.java.props.MyTestProp;
import com.training.etiya.java.props.PropertyReadEngine;

public class ValidationEngineRun {

    public static void main(final String[] args) {
        PropertyReadEngine pe = new PropertyReadEngine();
        MyProperty mp = (MyProperty) pe.readPropery(MyProperty.class);
        ValidationEngine engineLoc = new ValidationEngine();
        try {
            engineLoc.validate(mp);
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        System.out.println(mp);
        MyTestProp readProperyLoc = (MyTestProp) pe.readPropery(MyTestProp.class);
        System.out.println(readProperyLoc);

    }
}
