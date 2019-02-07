package com.mcroly.mysingleton;

public class Single {

    private static Single sc = null;
    private Single() {}
    private static String val = null;

    public static String getVal() {
        return val;
    }

    public static void setVal(String val) {
        Single.val = val;
    }

    // lazy
    public static Single getInstance() {
        if(sc==null) {
            return sc;//
        }

        return sc;
    }
}
