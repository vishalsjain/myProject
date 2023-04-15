package com.example._2023practice.common.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        System.out.println("String is:"+str);
        reverseString(str);

        Splitwords("aaa bshd    sjdk    wewe");
        countChar("aaabbbbbbfffffddddd");

    }

    private static void countChar(String x) {


        Arrays.stream(x.split("")).collect(Collectors.groupingBy(s -> s,
                Collectors.counting()
                )).forEach((s, aLong) -> System.out.println(s+":"+aLong));
        ;

    }

    private static void Splitwords(String str) {

        String[] splitStr= str.split("\\s+");
        for(String s:splitStr){
            System.out.println(s);
        }

    }

    private static void reverseString(String str) {
        System.out.println(str);

      String[] splitStr= str.split("");
      for(int i=0;i<splitStr.length/2;i++){

          String s=splitStr[i];
          String newS=splitStr[splitStr.length-i-1];
          System.out.println(s+":"+newS);
          splitStr[i]=newS;
          splitStr[splitStr.length-i-1]=s;

      }
        System.out.println(Arrays.stream(splitStr).collect(Collectors.joining()));

        System.out.println("--Option2----");

        StringBuffer sb=new StringBuffer(str);
        System.out.println("2nd Option:"+sb.reverse());


    }
}
