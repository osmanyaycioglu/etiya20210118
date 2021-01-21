package com.training.etiya.java.generics;


public class ValueHolder {

    private String name;
    private int    type;
    private Object value;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public int getType() {
        return this.type;
    }

    public void setType(final int typeParam) {
        this.type = typeParam;
    }


    public Object getValue() {
        return this.value;
    }


    public void setValue(final Object valueParam) {
        this.value = valueParam;
    }


}
