package com.training.etiya.java.generics;


public class ValueHolderLong {

    private String name;
    private int    type;
    private Long   value;

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

    public Long getValue() {
        return this.value;
    }

    public void setValue(final Long valueParam) {
        this.value = valueParam;
    }

}
