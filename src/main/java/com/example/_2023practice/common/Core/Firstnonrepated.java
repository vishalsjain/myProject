package com.example._2023practice.common.Core;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Firstnonrepated {

    public static void main(String[] args) {
       // String s = "vishu2";
        String s = "vishalvis";
        HashSet<String> hs = new HashSet<>();

        String x = Arrays.stream(s.split(""))
                .filter(a ->
                        !hs.add(a)).peek(
                                s1-> System.out.println(s1)
                ).collect(Collectors.joining());
        System.out.println(x);
        System.out.println(hs);

        LinkedHashMap<String, Long> hm = Arrays.stream(s.split(""))
                .collect(
                        Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                                Collectors.counting())
                );
        System.out.println(hm);

        Iterator<Map.Entry<String, Long>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Long> next = iterator.next();
            System.out.println(next.getKey());

        }


    }

}
