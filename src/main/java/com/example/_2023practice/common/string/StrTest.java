package com.example._2023practice.common.string;

import java.util.Arrays;

public class StrTest {
    static  String x=null;
    public static void main(String[] args) {

        String s=new String ("asdaad qdqd   qweqw");

        final String[] c = {null};
        Arrays.stream(s.replaceAll("\\s","").split(""))
                .filter(a->{
                    if(c[0] ==null || c[0] ==a ){
                        c[0] =a;
                        return true;
                    }else {
                        c[0] =a;
                        return false;
                                            }
                }).forEach(x-> System.out.println(x));
        System.out.println(c);





        Arrays.stream(s.replaceAll("\\s","").split(""))
                .filter(a->{
                    if(x ==null || x ==a ){
                        x =a;
                        return true;
                    }else {
                        x =a;
                        return false;
                    }
                }).forEach(x-> System.out.println(x));


    }
}
