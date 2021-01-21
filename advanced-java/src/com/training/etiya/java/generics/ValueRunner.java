package com.training.etiya.java.generics;

import com.training.etiya.java.immutable.Person3;

public class ValueRunner {

    public static void main(final String[] args) {
        ValueHolderInt holderIntLoc = new ValueHolderInt();
        holderIntLoc.setName("xyz");
        holderIntLoc.setType(1);
        holderIntLoc.setValue(100);

        Integer valueLoc = holderIntLoc.getValue();


        ValueHolder holderLoc = new ValueHolder();
        holderLoc.setType(1);
        holderLoc.setName("abc");
        holderLoc.setValue(new Person3());

        Integer value2Loc = (Integer) holderLoc.getValue();


        ValueHolderGen<Long> longVal = new ValueHolderGen<>();
        longVal.setValue(100L);
        Long value3Loc = longVal.getValue();


        ValueHolderGen<?> longVal2 = new ValueHolderGen<>();

    }
}
