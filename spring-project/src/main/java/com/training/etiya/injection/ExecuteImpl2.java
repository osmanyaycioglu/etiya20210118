package com.training.etiya.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ali")
public class ExecuteImpl2 implements IExecute {

    @Override
    public String execute() {
        return "execute 2";
    }

}
