package com.example._2023practice.common.Core;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubstringPrinter {
    public static void main(String[] args) {
        String inputString = "abcd";

        printAllSubstrings(inputString);
    }

    public static void printAllSubstrings(String inputString) {

        IntStream.range(0,inputString.length()).boxed()
                .flatMap(value ->
                    IntStream.rangeClosed(value+1,inputString.length())
                            .mapToObj(value1 -> inputString.substring(value,value1))
                ).forEach(System.out::println);

        System.out.println("-----------------------");
        for(int i=0;i<inputString.length();i++){
            for (int j=i+1;j<=inputString.length();j++)
                System.out.println(inputString.substring(i,j));
        }

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX");
        IntStream.range(0,inputString.length()).boxed()
                .map(value ->
                        IntStream.rangeClosed(value+1,inputString.length())
                                .mapToObj(value1 -> inputString.substring(value,value1))
                ).forEach(stringStream ->

                        System.out.println(stringStream.collect(Collectors.joining(","))));
    }
}


