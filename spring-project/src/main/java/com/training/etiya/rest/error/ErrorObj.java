package com.training.etiya.rest.error;

import java.util.ArrayList;
import java.util.List;

public class ErrorObj {

    private List<ErrorObj> subErrors;

    private String         desc;
    private int            cause;

    public ErrorObj addSubError(final ErrorObj errorObjParam) {
        if (this.subErrors == null) {
            this.subErrors = new ArrayList<>();
        }
        this.subErrors.add(errorObjParam);
        return this;
    }

    public List<ErrorObj> getSubErrors() {
        return this.subErrors;
    }

    public ErrorObj setSubErrors(final List<ErrorObj> subErrorsParam) {
        this.subErrors = subErrorsParam;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public ErrorObj setDesc(final String descParam) {
        this.desc = descParam;
        return this;
    }

    public int getCause() {
        return this.cause;
    }

    public ErrorObj setCause(final int causeParam) {
        this.cause = causeParam;
        return this;
    }


}
