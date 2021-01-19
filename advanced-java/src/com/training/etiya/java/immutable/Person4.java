package com.training.etiya.java.immutable;


public final class Person4 {

    private final String name;
    private final String surname;
    private final int    age;
    private final String company;
    private final String phone;


    private Person4(final String nameParam,
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

    public static Person2Builder getBuilder() {
        return new Person2Builder();
    }

    public static class Person2Builder {

        private String name;
        private String surname;
        private int    age;
        private String company;
        private String phone;

        private Person2Builder() {
        }

        public Person2Builder withName(final String name) {
            this.name = name;
            return this;
        }

        public Person2Builder withSurname(final String surname) {
            this.surname = surname;
            return this;
        }

        public Person2Builder withAge(final int age) {
            this.age = age;
            return this;
        }

        public Person2Builder withCompany(final String company) {
            this.company = company;
            return this;
        }

        public Person2Builder withPhone(final String phone) {
            this.phone = phone;
            return this;
        }

        public Person4 build() {
            // Validation
            return new Person4(this.name,
                               this.surname,
                               this.age,
                               this.company,
                               this.phone);
        }

        public Person4 buildOptional() {
            // Validation optional
            return new Person4(this.name,
                               this.surname,
                               this.age,
                               this.company,
                               this.phone);
        }

    }


}

