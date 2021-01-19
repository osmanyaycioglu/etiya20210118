package com.training.etiya.java.props;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class PropertyReadEngine {

    public Object readPropery(final Class<?> clzzParam) {
        try {
            PropFile propFileLoc = clzzParam.getAnnotation(PropFile.class);
            if (propFileLoc != null) {
                Properties propertiesLoc = new Properties();
                File file = new File(propFileLoc.value());
                FileInputStream fileInputStreamLoc = new FileInputStream(file);
                propertiesLoc.load(fileInputStreamLoc);

                Object newInstanceLoc = clzzParam.newInstance();

                Field[] declaredFieldsLoc = clzzParam.getDeclaredFields();
                for (Field fieldLoc : declaredFieldsLoc) {
                    Prop propLoc = fieldLoc.getAnnotation(Prop.class);
                    if (propLoc != null) {
                        String valueLoc = propLoc.value();
                        String propertyStrLoc = propertiesLoc.getProperty(valueLoc);
                        Class<?> typeLoc = fieldLoc.getType();
                        fieldLoc.setAccessible(true);
                        if (String.class == typeLoc) {
                            //if (String.class.getName().equals(typeLoc.getName())) {
                            fieldLoc.set(newInstanceLoc,
                                         propertyStrLoc);
                        } else if (Integer.class == typeLoc) {
                            fieldLoc.set(newInstanceLoc,
                                         Integer.parseInt(propertyStrLoc));

                        } else if ("int".equals(typeLoc.getName())) {
                            fieldLoc.setInt(newInstanceLoc,
                                            Integer.parseInt(propertyStrLoc));
                        }
                    }
                }
                return newInstanceLoc;
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        return null;
    }

}
