package com.training.etiya.java.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target(FIELD)
public @interface SizeCheck {

    String message() default "Size error";

    int min() default 0;

    int max() default Integer.MAX_VALUE;

}
