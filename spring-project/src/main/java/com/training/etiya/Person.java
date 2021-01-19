package com.training.etiya;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "person", ignoreUnknownFields = true)
@Component
//------------------------------------------------------------------------
//Default scope singleton
public class Person implements BeanNameAware {

    private String        name;
    private String        surname;
    private String        test;
    private int           age;

    @Autowired
    private MyProScopeObj myProScopeObj;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public String getTest() {
        return this.test;
    }

    public void setTest(final String testParam) {
        this.test = testParam;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int ageParam) {
        this.age = ageParam;
    }

    @Override
    public String toString() {
        return "Person [name="
               + this.name
               + ", surname="
               + this.surname
               + ", test="
               + this.test
               + ", age="
               + this.age
               + "]";
    }

    public MyProScopeObj getMyProScopeObj() {
        return this.myProScopeObj;
    }

    public void setMyProScopeObj(final MyProScopeObj myProScopeObjParam) {
        this.myProScopeObj = myProScopeObjParam;
    }

    @Override
    public void setBeanName(final String nameParam) {


    }


}
