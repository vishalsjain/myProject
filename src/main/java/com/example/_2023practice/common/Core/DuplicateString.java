
package com.example._2023practice.common.Core;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateString {
//
    public static void main(String[] args) {
        String checkDuplicate = "vishaljain";
        char[] c = checkDuplicate.toCharArray();
        Arrays.stream(checkDuplicate.split(""))
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .forEach(System.out::println);
        LinkedHashSet<String> hs = new LinkedHashSet();
        for (int i = 0; i < c.length; i++) {
            hs.add(String.valueOf(c[i]));
        }
        String withoutDuplicate = hs.stream().collect(Collectors.joining());
        System.out.println("Without Duplicate:" + withoutDuplicate);

        System.out.println("withoutduplicate java8:" +
                Arrays.stream(checkDuplicate.split(""))
                        .distinct().collect(Collectors.joining()));

        Stream.of(checkDuplicate.toCharArray()).map(String::valueOf).distinct()
                .collect(Collectors.joining());

    }
}
