package com.training.etiya.java.lambda;

public class LambdaTwoRun {

    public static void main(final String[] args) {
        IExecutorTwo abc = (a,
                            p) -> "Exec " + a + " index : " + p;
        System.out.println(abc.execute("osman",
                                       15));

        LambdaTwoRun.exec((x,
                           e) -> "Test : " + x + " sıra : " + e,
                          "osman",
                          18);

        LambdaTwoRun tr = new LambdaTwoRun();

        IExecutorTwo abc3 = tr::execTwoObj;

        IExecutorTwo abc2 = LambdaTwoRun::execTwo;

        MyExecObj execObjLoc = new MyExecObj("osman",
                                             100).execTeo((r,
                                                           t) -> "I am executing two : " + r + " " + t)
                                                 .exec(w -> " Executing one : " + w);

    }

    public static void exec(final IExecutorTwo exec,
                            final String str,
                            final int index) {
        System.out.println(exec.execute(str,
                                        index));
    }

    public static String execTwo(final String s,
                                 final Integer i) {
        String xLoc = "Run me : " + s + " i : " + i;
        System.out.println(xLoc);
        return xLoc;
    }

    public String execTwoObj(final String s,
                             final Integer i) {
        String xLoc = "Run Obj me : " + s + " i : " + i;
        System.out.println(xLoc);
        return xLoc;
    }

}
