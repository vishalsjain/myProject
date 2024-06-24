package com.example._2023practice.common.Core;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDescCount {

    public static void main(String[] args) {

        //sort string with count and desc order
        String s="vishaljain";


        Arrays.stream(s.split("")).sorted(Collections.reverseOrder())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new
                ,Collectors.counting()))
                .forEach((s1, aLong) ->
                        System.out.println(s1+":"+aLong));
        System.out.println("-------");


        Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())//VIMP line**************
                .forEach(stringLongEntry -> System.out.println("Key:"
                +stringLongEntry.getKey()+":value:"+stringLongEntry.getValue()));

    }

}
