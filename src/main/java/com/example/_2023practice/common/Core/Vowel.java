package com.example._2023practice.common.Core;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Vowel {

    public static void main(String[] args) {

        String s="vishaljain";

        char[] c=s.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' ||c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u' ){
                count++;
            }
        }
        System.out.println(count);

        System.out.println( Arrays.stream(s.split("")).
                filter(Vowel::test)
                .count());

    }

    private static boolean test(String a) {
        return a.equals("a") || a.equals("o") || a.equals("i") || a.equals("e") || a.equals("u");
    }
}
