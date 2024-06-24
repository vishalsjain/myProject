package com.example._2023practice.common.Core;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCompression {

    public static void main(String[] args) {
        //input aabbcccdd  output a2b2c3d2

        String s = "aabbcccdd";

        String a = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .map(stringLongEntry -> stringLongEntry.getKey() + stringLongEntry.getValue())
                .collect(Collectors.joining());
        System.out.println(a);

        String collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.mapping(stringLongEntry -> stringLongEntry.getKey()+stringLongEntry.getValue(), Collectors.joining()))
                ;
        System.out.println(collect);
    }
}
