package com.training.etiya.java.str;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StrTest {

    // private final StringBuilder stringBuilder = new StringBuilder();
    private final StringBuffer stringBuffer = new StringBuffer();


    public static void main(final String[] args) {
        StrTest strTestLoc = new StrTest();

        String stringLoc = "osman";
        String string2Loc = new String("osman");

        System.out.println(Charset.defaultCharset());

        byte[] bytesStr = new byte[100];
        String string3Loc = new String(bytesStr,
                                       Charset.forName("UTF-8"));

        try {
            Files.readAllLines(Paths.get("./a.txt"),
                               Charset.forName("UTF-8"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Long lf = new Long(100L);
        Long lf2 = 100L;
        long lf3 = lf2;

        stringLoc += " yaycıoğlu";
        String substringLoc = stringLoc.substring(3);
        substringLoc += " xyz";
        int a = 100;
        int b = 200;

        StringBuilder builderLoc = new StringBuilder();
        for (int iLoc = 0; iLoc < 100; iLoc++) {
            builderLoc.append(" ");
            builderLoc.append(iLoc);
        }
        System.out.println(builderLoc.toString());

        long delta = System.currentTimeMillis();
        for (int jLoc = 0; jLoc < 10_000; jLoc++) {
            String str2 = "String prefix : " + a + " osman " + b + "yaycıoğlu";
            str2 += " end";
            for (int iLoc = 0; iLoc < 100; iLoc++) {
                str2 += " ";
                str2 += iLoc;
            }
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));


        delta = System.currentTimeMillis();
        for (int jLoc = 0; jLoc < 10_000; jLoc++) {
            StringBuilder builderLoc2 = new StringBuilder();
            for (int iLoc = 0; iLoc < 100; iLoc++) {
                builderLoc2.append(" ");
                builderLoc2.append(iLoc);
            }
        }
        System.out.println(" Builder Delta : " + (System.currentTimeMillis() - delta));

        System.gc();


        delta = System.currentTimeMillis();
        for (int jLoc = 0; jLoc < 10_000; jLoc++) {
            StringBuilder builderLoc2 = new StringBuilder(512);
            for (int iLoc = 0; iLoc < 100; iLoc++) {
                builderLoc2.append(" ");
                builderLoc2.append(iLoc);
            }
        }
        System.out.println(" Builder Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 100_000; iLoc++) {
            String.format(" Osman %s age %d",
                          ("" + iLoc),
                          iLoc);
        }
        System.out.println(" Formatter Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 100_000; iLoc++) {
            String hStringLoc = " Osman " + iLoc + " age " + iLoc;
        }
        System.out.println(" One Line Concat Delta : " + (System.currentTimeMillis() - delta));

    }
}
