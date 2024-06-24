package com.example._2023practice.common.Core;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stringbasic {

    public static void main(String[] args) {

        String s = "vishal jain";

        System.out.println(
                s.charAt(0) == s.charAt(0));
        System.out.println(s.charAt(0));

        //Compare 2 string
        String str1 = "vishal";
        String str2 = "vishal1";

        System.out.println(IntStream.range(0, str1.length())
                .allMatch(a -> {
                    System.out.println(a);
                    return str1.charAt(a) == str2.charAt(a);
                })
        );

        //countvowels
        countVowels("aaeeiioouusd");


        //convert array to hashset
        int[] aa={1,2,3,4,5,6,5};
        Arrays.stream(aa).boxed().collect(Collectors.toSet()).forEach(
                System.out::println
        );






    }

        public static long countWords(String text) {
            return Stream.of(text.split("\\s+")).count();
        }

        public static long countVowels(String text) {

            System.out.println(        Arrays.stream(text.split("")).
        filter(a->"aeiouAEIOU".contains(a)).count());

            return text.chars()
                    .mapToObj(c -> (char) c)
                    .filter(c -> "AEIOUaeiou".contains(String.valueOf(c)))
                    .count();
        }

        public static Map<Character, Long> countCharacters(String text) {
            return text.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        }





}
