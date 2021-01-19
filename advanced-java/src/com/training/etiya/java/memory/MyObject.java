package com.training.etiya.java.memory;


public class MyObject {

    private String str   = "1234567890";
    private int    abc;
    private Long   long1 = 100L;
    private long   long2;

    public String getStr() {
        return this.str;
    }

    public void setStr(final String strParam) {
        this.str = strParam;
    }

    public int getAbc() {
        return this.abc;
    }

    public void setAbc(final int abcParam) {
        this.abc = abcParam;
    }

    public Long getLong1() {
        return this.long1;
    }

    public void setLong1(final Long long1Param) {
        this.long1 = long1Param;
    }

    public long getLong2() {
        return this.long2;
    }

    public void setLong2(final long long2Param) {
        this.long2 = long2Param;
    }


}
