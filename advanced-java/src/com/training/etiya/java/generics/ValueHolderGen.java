package com.training.etiya.java.generics;


public class ValueHolderGen<Q> {

    private Q      value;
    private String name;

    public Q getValue() {
        return this.value;
    }

    public void setValue(final Q valueParam) {
        this.value = valueParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }


}
