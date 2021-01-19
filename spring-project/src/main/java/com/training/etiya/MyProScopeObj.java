package com.training.etiya;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
// @RequestScope
public class MyProScopeObj {

    private String value = "default";


    public String getValue() {
        return this.value;
    }


    public void setValue(final String valueParam) {
        this.value = valueParam;
    }


}
