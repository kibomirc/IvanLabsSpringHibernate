package com.mcroly.mysingletoncircolare;

public class Single {

    private static Single sc[] = new Single[3];
    private String val;

    private Single() {
    }

    private static Integer max = 0;

    public static Single getInstance() {

        if (sc[0] == null) {
            for (int i = 0; i < sc.length; i++)
                sc[i] = new Single();
        }

        if (Single.max <= 2) {
            Single.max = Single.max + 1;
            return sc[Single.max - 1];

        }
        Single.max = 0;
        return sc[Single.max];
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
