package com.training.etiya.rest.employee.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StartWithValidationImpl implements ConstraintValidator<StartWith, String> {

    private StartWith startWith;

    @Override
    public void initialize(final StartWith startWithParam) {
        this.startWith = startWithParam;
    }

    @Override
    public boolean isValid(final String field,
                           final ConstraintValidatorContext contextParam) {

        return field.startsWith(this.startWith.value());
    }

}
