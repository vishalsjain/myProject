package com.example._2023practice.common.Core;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {
//Anagram is like boath string are same if one is revered
    public static void main(String[] args) {
        String first="vishal";
        String second="lhavisa";

        String[] spl=first.split("");
        String[] spl1=second.split("");
        Arrays.sort(spl);
        Arrays.sort(spl1);


        System.out.println(        Arrays.equals(spl,spl1));
    }
}
