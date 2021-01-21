package com.training.etiya.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import com.training.etiya.java.immutable.Person3;

public class MapRunner {

    public static void main(final String[] args) {
        Map<String, Person3> myMap = new HashMap<>();
        Map<String, Person3> mysoortedMap = new TreeMap<>();
        Map<String, Person3> myTable = new Hashtable<>();

        Map<String, Person3> threadSafeMap = new ConcurrentHashMap<>(1_000_000,
                                                                     0.9f,
                                                                     1_000);


        Map<String, Map<Integer, Map<String, List<Person3>>>> groupTest = new HashMap<>();
        Map<String, String> groupNameTest = new HashMap<>();
        Map<String, Integer> groupIntTest = new HashMap<>();

        Map<String, MyGroup> group2Test = new HashMap<>();

        myMap.put("osman1",
                  new Person3().setName("osman")
                               .setCompany("xyz"));
        myMap.put("osman2",
                  new Person3().setName("ali")
                               .setCompany("xyz"));

        myMap.put(null,
                  new Person3().setName("ali")
                               .setCompany("xyz"));

        Person3 person3Loc = myMap.get("osman2");
        System.out.println(person3Loc);

        // 1
        Set<String> keySetLoc = myMap.keySet();
        for (String stringLoc : keySetLoc) {
            System.out.println(myMap.get(stringLoc));
        }

        // 2
        Collection<Person3> valuesLoc = myMap.values();
        for (Person3 person32Loc : valuesLoc) {
            System.out.println(person32Loc);
        }

        // 3
        Set<Entry<String, Person3>> entrySetLoc = myMap.entrySet();
        for (Entry<String, Person3> entryLoc : entrySetLoc) {
            System.out.println("Key : " + entryLoc.getKey() + " Value : " + entryLoc.getValue());
        }
    }
}
