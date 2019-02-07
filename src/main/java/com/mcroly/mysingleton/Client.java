package com.mcroly.mysingleton;

public class Client {

    public static void main(String arg[]){

            Single a = Single.getInstance();

            System.out.println(a.getVal());

    }

}
