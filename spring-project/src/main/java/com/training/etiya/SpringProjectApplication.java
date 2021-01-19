package com.training.etiya;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication implements ApplicationRunner {

    @Autowired
    private Person              person;

    @Autowired
    private MyProScopeObj       myProScopeObj;

    private final MyProScopeObj objProScopeObj;

    private MyProScopeObj       myProScopeObj2;


    @Autowired
    public SpringProjectApplication(final MyProScopeObj ObjProScopeObjParam) {
        this.objProScopeObj = ObjProScopeObjParam;
    }

    @Autowired
    public void xyz(final MyProScopeObj myProScopeObjParam) {
        this.myProScopeObj2 = myProScopeObjParam;
    }

    @PostConstruct
    public void init() {
        System.out.println("Post construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Pre destroy");
    }


    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        System.out.println(this.person);
        System.out.println("Equals : " + (this.myProScopeObj == this.person.getMyProScopeObj()));


    }

}
