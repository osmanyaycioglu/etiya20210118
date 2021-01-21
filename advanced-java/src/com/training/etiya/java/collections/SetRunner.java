package com.training.etiya.java.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    public static void main(final String[] args) {
        Set<Integer> aSet = new TreeSet<>();

        aSet.add(1);
        aSet.add(1);
        aSet.add(1);
        aSet.add(1);
        aSet.add(1);
        aSet.add(1000);
        aSet.add(1000);
        aSet.add(1000);
        aSet.add(10);
        aSet.add(100);
        aSet.add(1000);

        System.out.println(aSet);

        Set<Integer> a2Set = new HashSet<>();
        a2Set.add(1);
        a2Set.add(2);
        a2Set.add(3);
        a2Set.add(1000);

        aSet.removeAll(a2Set);

        System.out.println(aSet);

        for (Integer integerLoc : a2Set) {

        }


        Set<Integer> testArr = new HashSet<>(1_000_000);


        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            testArr.add(iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            testArr.contains(iLoc);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            testArr.remove(iLoc);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));
    }

}
