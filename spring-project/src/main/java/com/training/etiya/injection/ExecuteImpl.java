package com.training.etiya.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("veli")
@Exec1
public class ExecuteImpl implements IExecute {

    @Override
    public String execute() {
        return "execute 1";
    }

}
