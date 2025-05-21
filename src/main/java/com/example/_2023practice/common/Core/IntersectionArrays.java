package com.example._2023practice.common.Core;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class IntersectionArrays {

    public static void main(String[] args) {
//get all common between 2 arrays
        int[] a = {1, 2, 3, 4, 5, 5};
        int[] b = {6, 7, 3, 4, 5};
        Arrays.stream(a).distinct().
                filter(x -> Arrays.stream(b).boxed()
                        .collect(Collectors.toSet()).contains(x))
                .forEach(System.out::println);

        HashSet<Integer> hs = Arrays.stream(b).boxed()
                .collect(Collectors.toCollection(HashSet::new));

        HashSet<Integer> hs1 = Arrays.stream(a).boxed()
                .collect(Collectors.toCollection(HashSet::new));
        hs.retainAll(hs1);

        System.out.println(hs);


    }
}
