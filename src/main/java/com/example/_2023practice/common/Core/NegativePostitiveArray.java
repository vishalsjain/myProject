package com.example._2023practice.common.Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NegativePostitiveArray {

    public static void main(String[] args) {
//negative value at last of the array

        int[] a = {2, 5, -1, -2, 6, 7};
        //Arrays.stream(a).sorted().forEach(System.out::println);
        System.out.println("-----");
        extracted(a);

        String s="vishal";
        s=s+s;
        System.out.println(s.substring(1,6));
        Arrays.stream(a).boxed().collect(Collectors.toList());
      ;

      String s1="111";
      String s2="222";
        System.out.println(s1+s2);
        System.out.println(0+s1+s2);
        System.out.println(0+'1'+"222");


   
    }

    private static void extracted(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            if (a[start] <= 0 && a[end] > 0) {
                int b = a[start];
                a[start] = a[end];
                a[end] = b;
                start++;
                end--;

            } else {
                if (a[end] < 0) {
                    end--;
                }
                if (a[start] >= 0) {
                    start++;
                }
            }
        }

        Arrays.stream(a).forEach(System.out::println);
    }
}
