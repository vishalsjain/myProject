package com.example._2023practice.common.Core;

import java.util.Arrays;

public class ApendZeroLast {

    public static void main(String[] args) {
//iterate throght the loop and use counter
        //set the value using the counter and only assign if value is >0
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
        System.out.println("**************");
        int[] a1={1,0,4,5,6,0,0,2};
        int start=0;
        int end=a1.length-1;
   for(int i=0;i<a1.length/2;i++){
       if(a1[start]>0 && a1[end]>0){
           start=start+1;
       }else if(a1[start]<=0 && a1[end]>0){
           a1[start]=a1[end];
           a1[end]=0;
           start=start+1;
           end=end-1;
       }else if(a1[start]>0 && a1[end]<=0){
           start=start+1;
           end=end-1;
       }


   }
        System.out.println("**");
        Arrays.stream(a1).forEach(System.out::println);

    }

}
