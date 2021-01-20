package com.training.etiya.injection;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;


@Retention(RetentionPolicy.RUNTIME)
@Target({
          FIELD,
          METHOD,
          ElementType.TYPE
})
@Qualifier
public @interface Exec1 {

}
