package com.training.etiya;

import java.util.concurrent.Future;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import com.training.etiya.rest.async.AsyncService;

//@SpringBootApplication(scanBasePackages = {
//                                            "com.training.etiya",
//                                            "com.adenon.dev"
//})
@SpringBootApplication
@ServletComponentScan
@EnableAsync
public class SpringProjectApplication implements ApplicationRunner {

    @Autowired
    private Person              person;

    @Autowired
    private MyProScopeObj       myProScopeObj;

    private final MyProScopeObj objProScopeObj;

    private MyProScopeObj       myProScopeObj2;

    @Autowired
    private AsyncService        as;

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
        Future<String> myMethodLoc = this.as.myMethod(100);
        // Extra Processes
        String stringLoc = myMethodLoc.get();


    }

}
