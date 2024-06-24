package com.example._2023practice.common.Core;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

//2 string are difrect opposite just like mirror
public class Palindrome {

    public static void main(String[] args) {

        String str="vishal";
        String otherString="lahsiv";
        System.out.println("string:"+str+":otherString:"+otherString);
        String[] ss=str.split("");
        Arrays.asList(ss);
       Collections.reverse(Arrays.asList(ss));
str=        Arrays.stream(ss).collect(Collectors.joining());
        System.out.println("ReverseString:"+str +":string to compare:"+otherString);
        System.out.println(str.equals(otherString));

    StringBuilder sb=new StringBuilder("vishal");

        System.out.println(sb.reverse());
        System.out.println(str.charAt(0));
        System.out.println(otherString.equals(sb.toString()));

    }

}
