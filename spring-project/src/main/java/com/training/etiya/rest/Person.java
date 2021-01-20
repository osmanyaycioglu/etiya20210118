package com.training.etiya.rest;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

    private String    name;
    private String    surname;
    private Integer   weight;
    @XmlElement(name = "birthdate", required = true)
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate birthdate;

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

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(final LocalDate birthdateParam) {
        this.birthdate = birthdateParam;
    }

    @Override
    public String toString() {
        return "Person [name="
               + this.name
               + ", surname="
               + this.surname
               + ", weight="
               + this.weight
               + ", birthdate="
               + this.birthdate
               + "]";
    }


}
