package com.training.etiya.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.training.etiya.java.annos.MyAnno;
import com.training.etiya.java.annos.MyAnnoUsageClass;

public class ReflectionRun {

    public static void main(final String[] args) {
        Class<?> clazzClassLoc = MyAnnoUsageClass.class;
        Field[] declaredFieldsLoc = clazzClassLoc.getDeclaredFields();
        for (Field fieldLoc : declaredFieldsLoc) {
            System.out.println(fieldLoc.getName());
        }
        Method[] declaredMethodsLoc = clazzClassLoc.getDeclaredMethods();
        for (Method methodLoc : declaredMethodsLoc) {
            System.out.println(methodLoc.getName());
        }

        //        MyAnnoUsageClass m = new MyAnnoUsageClass();
        //        m.setStr("osman");
        //        m.xyz("test");

        try {
            Object newInstanceLoc = clazzClassLoc.newInstance();
            Field declaredFieldLoc = clazzClassLoc.getDeclaredField("str");
            MyAnno annotationLoc = declaredFieldLoc.getAnnotation(MyAnno.class);
            if (annotationLoc != null) {
                String valueLoc = annotationLoc.value();
                System.out.println("MyAnno value : " + valueLoc);
            }
            declaredFieldLoc.setAccessible(true);
            declaredFieldLoc.set(newInstanceLoc,
                                 "osman");
            Method methodLoc = clazzClassLoc.getMethod("xyz",
                                                       String.class);
            MyAnno annotation2Loc = methodLoc.getAnnotation(MyAnno.class);
            if (annotation2Loc != null) {
                System.out.println("xyz method anno : " + annotation2Loc.value() + " " + annotation2Loc.abc());
            }
            methodLoc.invoke(newInstanceLoc,
                             "test");
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
