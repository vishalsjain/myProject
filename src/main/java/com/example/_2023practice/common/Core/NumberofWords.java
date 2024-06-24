package com.example._2023practice.common.Core;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberofWords {

    public static void main(String[] args) {
        String s="Vishal Jain is Best is is";
        Arrays.stream(s.split(" ")).
                collect(Collectors.toMap(Function.identity(),String::length,
                        (integer, integer2) -> integer+integer2))//this is just to as is+is=4
                .forEach((s1, integer) -> System.out.println("String is:"+s1
                +":length is :"+integer));
        ;

        //
        System.out.println("---second way---");
        Arrays.stream(s.split(" ")).
                collect(Collectors.groupingBy(
                        Function.identity(),Collectors.mapping(String::length,Collectors.toList()))
                )
                .forEach(
                        (s1, integer) -> System.out.println("String is1:"+s1
                                +":length is1 :"+integer.get(0))
                );
//Same can be done using Collectors.summingInt(String::length)
    }

}
