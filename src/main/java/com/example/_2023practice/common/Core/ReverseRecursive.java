package com.example._2023practice.common.Core;

public class ReverseRecursive {

    public static void main(String[] args) {

        String s="abcd";
        s=recursiveString(s);
        System.out.println(s);

    }

    private static String recursiveString(String s) {
        System.out.println(s);
        if(s==null || s.isEmpty())
            return s;
        String x=recursiveString(s.substring(1))+s.charAt(0);
        System.out.println("value of X:"+x);
        return x;
    }

}
