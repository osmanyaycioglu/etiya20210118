package com.training.etiya.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.adenon.dev.MyOtherBean;

@Component

//@Service
//@Configuration
//@Controller
//@Repository

public class ExecuteManager {

    @Autowired
    //@Qualifier("veli")
    //@Exec1
    @Qualifier("ayse")
    private IExecute    ex;

    @Autowired
    private MyOtherBean mob;

    public String executeMe() {
        this.mob.test();
        return this.ex.execute();
    }

}
