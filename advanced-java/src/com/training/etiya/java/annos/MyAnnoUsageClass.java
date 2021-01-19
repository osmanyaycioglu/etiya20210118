package com.training.etiya.java.annos;

@MyAnno(abc = "osman", count = 15)
public class MyAnnoUsageClass {

    @MyAnno("osman")
    private String  str;

    private Integer int1;

    @MyAnno(abc = "osman method")
    public void xyz(final String str) {
        System.out.println(this.str + str + this.int1);
    }


    public String getStr() {
        return this.str;
    }


    public void setStr(final String strParam) {
        this.str = strParam;
    }


    public Integer getInt1() {
        return this.int1;
    }


    public void setInt1(final Integer int1Param) {
        this.int1 = int1Param;
    }


}
