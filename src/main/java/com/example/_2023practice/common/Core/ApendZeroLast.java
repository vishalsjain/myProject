package com.example._2023practice.common.Core;

import java.util.Arrays;

public class ApendZeroLast {

    public static void main(String[] args) {

        int[] a={1,0,4,5,6,0,0,2};
        int count=0;

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                a[count]=a[i];
                count++;
            }

        }
        System.out.println("First itr");
        Arrays.stream(a).forEach(x-> System.out.println(x));

       /* for(int x=a.length-count;x>0;x--){
           a[count+x-1]=0;
       }*/
        while (count < a.length) {
            a[count] = 0;
            count++;
        }
        System.out.println("Final itr");
        Arrays.stream(a).forEach(System.out::println);

    }

}
