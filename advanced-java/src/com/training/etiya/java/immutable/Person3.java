package com.training.etiya.java.immutable;


public class Person3 {

    private String name;
    private String surname;
    private int    age;
    private String company;
    private String phone;

    public String getName() {
        return this.name;
    }

    public Person3 setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public Person3 setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public int getAge() {
        return this.age;
    }

    public Person3 setAge(final int ageParam) {
        this.age = ageParam;
        return this;
    }

    public String getCompany() {
        return this.company;
    }

    public Person3 setCompany(final String companyParam) {
        this.company = companyParam;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public Person3 setPhone(final String phoneParam) {
        this.phone = phoneParam;
        return this;
    }


}
