package com.example._2023practice.common.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClassStrea {

    public static void main(String[] args) {

        HashMap<String,String> hm=new HashMap<>();
        hm.put("1","Vishal");
        hm.put("2","Jain");
        hm.put("3","Daksha");

        hm.entrySet().stream().sorted((o1, o2) ->
                o1.getValue().compareTo(o2.getValue())).forEach(stringStringEntry ->
                System.out.println(stringStringEntry.getValue())
        );

        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(stringStringEntry ->
                System.out.println(stringStringEntry.getValue())
        );

        HashMap<String,Student> hm1=new HashMap<>();
        hm1.put("1",new Student(1,"Vishal"));
        hm1.put("2",new Student(2,"Jain"));
        hm1.put("3",new Student(4,"AA"));
        HashMap hm2 =
                (HashMap) hm1.entrySet().stream().sorted((o1, o2) -> {
                            return o1.getValue().getName().compareTo(o2.getValue().getName());
                        }).
                        collect(Collectors.toMap(s -> s.getKey(), a -> a.getValue(), (o, o2) -> o, LinkedHashMap::new));
        System.out.println(hm2);

         hm2 =
                (HashMap) hm1.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) ->
                                o1.getName().compareTo(o2.getName()))).
                        collect(Collectors.toMap(s -> s.getKey(), a -> a.getValue(), (o, o2) -> o, LinkedHashMap::new));
        System.out.println(hm2);










    }
}
