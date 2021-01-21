package com.training.etiya.java.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.etiya.java.immutable.Person3;

public class MyGroup {

    private String                                   gName;
    private String                                   gIndex;
    private Map<Integer, Map<String, List<Person3>>> group = new HashMap<>();


    public Map<Integer, Map<String, List<Person3>>> getGroup() {
        return this.group;
    }


    public void setGroup(final Map<Integer, Map<String, List<Person3>>> groupParam) {
        this.group = groupParam;
    }


    public String getgName() {
        return this.gName;
    }


    public void setgName(final String gNameParam) {
        this.gName = gNameParam;
    }


    public String getgIndex() {
        return this.gIndex;
    }


    public void setgIndex(final String gIndexParam) {
        this.gIndex = gIndexParam;
    }


}
