package com.training.etiya.java.validation;


import java.lang.reflect.Field;

public class ValidationEngine {

    public void validate(final Object obj) {
        Class<?> classLoc = obj.getClass();
        try {
            Field[] declaredFieldsLoc = classLoc.getDeclaredFields();
            for (Field fieldLoc : declaredFieldsLoc) {
                EmptyCheck validateStrLoc = fieldLoc.getAnnotation(EmptyCheck.class);
                if (validateStrLoc != null) {
                    Class<?> typeLoc = fieldLoc.getType();
                    fieldLoc.setAccessible(true);
                    if (typeLoc == String.class) {
                        String filedValueLoc = (String) fieldLoc.get(obj);
                        if ((filedValueLoc == null) || filedValueLoc.isEmpty()) {
                            throw new IllegalArgumentException("Field : "
                                                               + fieldLoc.getName()
                                                               + " "
                                                               + validateStrLoc.message());
                        }
                    }
                }
                SizeCheck sizeValidateStrLoc = fieldLoc.getAnnotation(SizeCheck.class);
                if (sizeValidateStrLoc != null) {
                    Class<?> typeLoc = fieldLoc.getType();
                    fieldLoc.setAccessible(true);
                    if (typeLoc == String.class) {
                        String filedValueLoc = (String) fieldLoc.get(obj);
                        if (filedValueLoc != null) {
                            if ((filedValueLoc.length() < sizeValidateStrLoc.min())
                                || (filedValueLoc.length() > sizeValidateStrLoc.max())) {
                                throw new IllegalArgumentException("Field : "
                                                                   + fieldLoc.getName()
                                                                   + " "
                                                                   + sizeValidateStrLoc.message());
                            }
                        }
                    }
                }
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}
