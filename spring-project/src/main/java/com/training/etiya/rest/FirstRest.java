package com.training.etiya.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import com.training.etiya.MyProScopeObj;
import com.training.etiya.injection.ExecuteManager;

@RestController
@RequestMapping("/first")
// @ApplicationScope
@SessionScope
public class FirstRest {

    @Autowired
    private ExecuteManager eManager;

    public FirstRest() {
        System.out.println("FirstRest Constructor");
    }

    @Autowired
    private MyProScopeObj myProScopeObj;

    @GetMapping("/execute")
    public String execute() {
        return this.eManager.executeMe();
    }

    @GetMapping("/get")
    public String get() {
        return this.myProScopeObj.getValue();
    }

    @GetMapping("/hello/{test}")
    public String hello(@PathVariable("test") final String test) {
        String str = "hello world : " + this.myProScopeObj.getValue();
        this.myProScopeObj.setValue(test);
        return str;
    }
}
