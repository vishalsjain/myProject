package com.example._2023practice.common.java8;

import java.util.*;
import java.util.stream.Collectors;

public class MainClassStrea {

    public static void main(String[] args) {

        HashMap<String,String> hm=new HashMap<>();
        hm.put("1","Vishal");
        hm.put("2","Jain");
        hm.put("3","Daksha");
//sort by value
        hm.entrySet().stream().sorted((o1, o2) ->
                o1.getValue().compareTo(o2.getValue())).forEach(stringStringEntry ->
                System.out.println(stringStringEntry.getValue())
        );

        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(stringStringEntry ->
                System.out.println(stringStringEntry.getValue())
        );

        //sort by student id
        HashMap<String,Student> hm1=new HashMap<>();
        hm1.put("1",new Student(1,"Vishal"));
        hm1.put("2",new Student(2,"Jain"));
        hm1.put("3",new Student(4,"AA"));
        hm1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getName)))
                ;

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

        hm1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getName)))
                .forEach((sm)-> System.out.println(sm.getKey()+":vishak:"+sm.getValue()));

        System.out.println("--Duplicate in array--");
        Integer[] a={1,2,3,2,1,5};

        Arrays.stream(a).collect(Collectors.groupingBy(o -> o,
                Collectors.counting()))
                .entrySet().stream().filter(a1->a1.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(( aLong) -> System.out.println(aLong))
                ;

        System.out.println("--First first and last highest--");
        IntSummaryStatistics sumsta=Arrays.stream(a).mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("min:"+sumsta.getMin()+":max:"+sumsta.getMax());


        System.out.println("--Find Common betwen 2 array--");
        Integer[] int1={1,2,3,4,5,6};
        Integer[] int2={6,2,1,8,9};

        List<Integer> lInt=Arrays.asList(int1);

        Arrays.stream(int2).filter(x->{
            if(lInt.contains(x)) return true; else return false;
        }).forEach(System.out::println);
        System.out.println("---");
List<Integer> x=List.of(int1);
        Arrays.stream(int2).filter(aa->
                        Arrays.stream(int1).anyMatch(integer -> integer.equals(aa)))
                .forEach(System.out::println);


    }
}
