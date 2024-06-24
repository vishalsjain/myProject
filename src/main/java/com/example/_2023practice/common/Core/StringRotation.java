package com.example._2023practice.common.Core;

public class StringRotation {

    //abcd = bcda cdab
    //so abcd+abcd=abcdabcd here if we take substring cdab is there contains
    public static void main(String[] args) {
        String s="abcd";
//        String b="bcda";
        String b="bcba";

        checkRotationorNot(s,b);
        rotateStringby(s,2);
    }

    private static void rotateStringby(String s, int i) {

        String s1=s+s;
        System.out.println("Rotated String is :"+s1.substring(i,i+s.length()));
    }

    private static void checkRotationorNot(String s, String b) {

        s=s.concat(s);
        if(s.contains(b)){
            System.out.println("Yes 2nd string is rotation of first");
        }else {
            System.out.println("No 2nd string is rotation of first");
        }

    }

}
