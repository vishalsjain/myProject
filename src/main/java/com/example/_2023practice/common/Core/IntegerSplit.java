package com.example._2023practice.common.Core;

public class IntegerSplit {

    public static void main(String[] args) {
        Integer x=1055;
        String s=String.valueOf(x);
        System.out.println(s);
        for(int i=0;i<String.valueOf(x).split("").length;i++){
            System.out.println(x%10);
          x=x/10;
        }
        System.out.println(x);


    }
    
}
