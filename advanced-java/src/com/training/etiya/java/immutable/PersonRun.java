package com.training.etiya.java.immutable;


public class PersonRun {

    public static void main(final String[] args) {
        Person person = new Person("osman",
                                   "yaycıoğlu",
                                   50);
        Person personOptional = new Person("osman",
                                           "surname",
                                           0,
                                           "company",
                                           "436734");


        Person2 p2 = Person2.getBuilder()
                            .withName("osman")
                            .withSurname("yaycıoğlu")
                            .withAge(50)
                            .build();

        Person2 p3 = Person2.getBuilder()
                            .withName("osman")
                            .withSurname("yaycıoğlu")
                            .withAge(50)
                            .withCompany("Adenon")
                            .withPhone("78423634")
                            .buildOptional();

        Person3 p4 = new Person3().setName("osman")
                                  .setSurname("yay")
                                  .setCompany("adenon")
                                  .setPhone("48734")
                                  .setAge(50);
    }
}
