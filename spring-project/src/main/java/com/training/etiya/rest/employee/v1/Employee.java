package com.training.etiya.rest.employee.v1;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.training.etiya.rest.employee.validation.StartWith;

public class Employee {

    @NotEmpty
    @Size(min = 2, max = 20, message = "Name 2 ile 20 arasında olmalı")
    private String    name;
    @NotEmpty
    @Size(min = 3, max = 25, message = "Surname 3 ile 25 arasında olmalı")
    @StartWith("soy")
    private String    surname;

    @Max(200)
    @Min(5)
    private Integer   weight;

    @NonNull
    @Past
    private LocalDate birtDate;

    @Email
    private String    email;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(final Integer weightParam) {
        this.weight = weightParam;
    }


    public LocalDate getBirtDate() {
        return this.birtDate;
    }


    public void setBirtDate(final LocalDate birtDateParam) {
        this.birtDate = birtDateParam;
    }


    public String getEmail() {
        return this.email;
    }


    public void setEmail(final String emailParam) {
        this.email = emailParam;
    }


}
