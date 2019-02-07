package com.mcroly.mysingletoncircolare;

public class Client {

    public static void main(String arg[]) {

        Single a = Single.getInstance();
        a.setVal("A");

        Single b = Single.getInstance();
        b.setVal("B");

        Single c = Single.getInstance();
        c.setVal("C");

        Single d = Single.getInstance();
        d.setVal("D");

        Single e = Single.getInstance();
        e.setVal("E");

        System.out.println(a.getVal() + " " + b.getVal() + " " + c.getVal() + " " + d.getVal() + " " + e.getVal());

    }

}
