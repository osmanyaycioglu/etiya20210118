package com.training.etiya.java.generics;


public class ValueHolderInt {

    private String  name;
    private int     type;
    private Integer value;

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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer valueParam) {
        value = valueParam;
    }

}
