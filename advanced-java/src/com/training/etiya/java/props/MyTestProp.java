package com.training.etiya.java.props;


@PropFile("tyu.properties")
public class MyTestProp {

    @Prop("a.a.a")
    private String a1;
    @Prop("a.b.c")
    private String a2;

    public String getA1() {
        return this.a1;
    }

    public void setA1(final String a1Param) {
        this.a1 = a1Param;
    }

    public String getA2() {
        return this.a2;
    }

    public void setA2(final String a2Param) {
        this.a2 = a2Param;
    }

    @Override
    public String toString() {
        return "MyTestProp [a1=" + this.a1 + ", a2=" + this.a2 + "]";
    }


}
