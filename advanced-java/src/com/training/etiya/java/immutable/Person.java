package com.training.etiya.java.immutable;


public class Person {

    private final String name;
    private final String surname;
    private final int    age;
    private String       company;
    private String       phone;


    public Person(final String nameParam,
                  final String surnameParam,
                  final int ageParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.age = ageParam;
    }


    public Person(final String nameParam,
                  final String surnameParam,
                  final int ageParam,
                  final String companyParam,
                  final String phoneParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.age = ageParam;
        this.company = companyParam;
        this.phone = phoneParam;
    }

    public String getName() {
        return this.name;
    }


    public String getSurname() {
        return this.surname;
    }


    public int getAge() {
        return this.age;
    }


    public String getCompany() {
        return this.company;
    }


    public String getPhone() {
        return this.phone;
    }


}
