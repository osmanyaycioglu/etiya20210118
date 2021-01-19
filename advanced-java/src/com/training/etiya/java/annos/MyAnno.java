package com.training.etiya.java.annos;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target({
          TYPE,
          FIELD,
          METHOD
})
public @interface MyAnno {

    String value() default "[default value]";

    String abc() default "";

    int count() default 10;

}
