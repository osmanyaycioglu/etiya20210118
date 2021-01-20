package com.training.etiya.rest.employee.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Retention(RetentionPolicy.RUNTIME)
@Target({
          FIELD,
          METHOD
})
@Constraint(validatedBy = {
                            StartWithValidationImpl.class
})
public @interface StartWith {

    String value();

    String message() default "{javax.validation.constraints.StartWith.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
