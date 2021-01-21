package com.training.etiya.java.collections;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListRunner {

    public static void main(final String[] args) {
        List<String> strArr = new ArrayList<>();
        List<Integer> intArr = new ArrayList<>(120);
        List<Integer> testArr = new ArrayList<>(1_000_000);

        for (Integer integerLoc : testArr) {
        }

        Iterator<Integer> iteratorLoc = testArr.iterator();
        while (iteratorLoc.hasNext()) {
            Integer typeLoc = iteratorLoc.next();

        }

        for (int iLoc = 0; iLoc < testArr.size(); iLoc++) {
            testArr.get(iLoc);
        }

        List<Integer> testArr2 = new CopyOnWriteArrayList<>();

        // Thread safe
        List<Integer> int2Arr = new Vector<>(120);
        List<Integer> synchronizedListLoc = Collections.synchronizedList(testArr);


        Integer[] ina = new Integer[10];

        SecureRandom randomLoc = new SecureRandom();
        for (int iLoc = 0; iLoc < 100; iLoc++) {
            intArr.add(randomLoc.nextInt());
            //            if (iLoc > ina.length) {
            //                Integer[] tempina = new Integer[ina.length];
            //                System.arraycopy(ina,
            //                                 0,
            //                                 tempina,
            //                                 0,
            //                                 ina.length);
            //                ina = tempina;
            //            }
            //            ina[iLoc] = randomLoc.nextInt();

        }
        intArr.add(1000000);
        intArr.add(-10);
        intArr.add(1000);
        for (Integer integerLoc : intArr) {
            System.out.println(integerLoc);
        }
        Integer integerLoc = intArr.get(10);
        Collections.sort(intArr);
        Collections.sort(intArr,
                         new Comparator<Integer>() {

                             @Override
                             public int compare(final Integer o1Param,
                                                final Integer o2Param) {
                                 return o1Param - o2Param;
                             }
                         });
        //        intArr.contains(123);
        //        intArr.remove(3);

        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            testArr.add(iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            testArr.get(iLoc);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 999_990; iLoc < 1_000_000; iLoc++) {
            testArr.contains(iLoc);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 999_990; iLoc++) {
            testArr.remove(10);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));

        // List objArr = new ArrayList<>();
    }
}
