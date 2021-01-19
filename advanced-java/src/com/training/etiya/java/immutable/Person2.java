package com.training.etiya.java.immutable;


public final class Person2 {

    private String name;
    private String surname;
    private int    age;
    private String company;
    private String phone;


    private Person2() {
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

    public static Person2Builder getBuilder() {
        return new Person2Builder();
    }

    public static class Person2Builder {

        private final Person2 person2 = new Person2();

        private Person2Builder() {
        }

        public Person2Builder withName(final String name) {
            this.person2.name = name;
            return this;
        }

        public Person2Builder withSurname(final String surname) {
            this.person2.surname = surname;
            return this;
        }

        public Person2Builder withAge(final int age) {
            this.person2.age = age;
            return this;
        }

        public Person2Builder withCompany(final String company) {
            this.person2.company = company;
            return this;
        }

        public Person2Builder withPhone(final String phone) {
            this.person2.phone = phone;
            return this;
        }

        public Person2 build() {
            // Validation
            return this.person2;
        }

        public Person2 buildOptional() {
            // Validation optional
            return this.person2;
        }

    }


}

