package com.training.etiya.java.enums;


public enum TimeConvert2 {

    MILIS(1),
    SECOND(1000),
    MINUTE(60 * 1000),
    HOUR(60 * 60 * 1000),
    DAY(24 * 60 * 60 * 1000);


    private final long mult;

    private TimeConvert2(final long mult) {
        this.mult = mult;
    }

    public long convert(final long val) {
        return val * this.mult;
    }
}
