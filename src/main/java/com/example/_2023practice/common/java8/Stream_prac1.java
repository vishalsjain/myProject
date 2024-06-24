package com.example._2023practice.common.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_prac1 {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,5,6,7,8,9);
        list.stream().filter(a->a % 2==0).forEach(System.out::println);

        int[] arrayData={1,2,3,4,5,6,7};
        System.out.println(Arrays.stream(arrayData).sum());
        System.out.println(Arrays.stream(arrayData).reduce((left, right) -> left+right).getAsInt());


        List<Student> stdList=Arrays.asList(
                new Student(1,"vishal"),
                new Student(2,"jain"),
                new Student(3,"chandni"),
                new Student(4,"papa"),
                new Student(4,"papa")
        );

        stdList.stream().collect(Collectors.groupingBy(Student::getId))
                .forEach((integer, students) -> System.out.println(integer+":"+students));
        stdList.stream().collect(Collectors.groupingBy(Student::getName))
                .forEach((strings, students) -> System.out.println(strings+":"+students));
        System.out.println("--distint value--");
      /*  stdList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.toSet()))
                .forEach((strings, students) -> System.out.println(strings+":"+students));*/ //not working
        stdList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.mapping(
                Student::getName,Collectors.toSet()
        )))
                .forEach((strings, students) -> System.out.println(strings+":"+students));

        //get duplicate names
        System.out.println("duplicate names");


        stdList.stream().map(Student::getName).collect(
                Collectors.groupingBy(s->s,Collectors.counting())
                        )
                .entrySet().stream().filter(a->a.getValue()==1)
                .map(Map.Entry::getKey).forEach(System.out::println);

        //optional
        List<Student> stdList1=Arrays.asList(
                new Student(1,"vishal"),
                new Student(2,"jain"),
                new Student(3,"chandni"),
                new Student(4,"papa"),
                new Student(4,null)
        );

String s=null;
Optional<String> sOption=Optional.ofNullable(s);
        //System.out.println(sOption.get());// it will give NPE
sOption.ifPresent(System.out::println);

        Student stu=null;
        //stu=new Student(1,null);
      stu=  new Student(1,"adsnull");
        Optional<Student> ss=Optional.ofNullable(stu);
    ss.ifPresent(a->{
        System.out.println(a);
        Optional.ofNullable(a.getName()).ifPresentOrElse(System.out::println,
                () -> System.out.println("Name not present")
        );
    });



    //sort student based on name
        List<Student> stdList2=Arrays.asList(
                new Student(1,"vishal"),
                new Student(2,"jain"),
                new Student(3,"chandni"),
                new Student(4,"papa")
        );
        System.out.println("**Sort based on name**");
    stdList2.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList())
            .forEach(System.out::println);

        System.out.println("****2nd highest value****");
    int[] x={1,4,8,2,5};
Arrays.stream(x).sorted().skip(1).limit(1).forEach(System.out::println);
        IntStream aaa=Arrays.stream(x).sorted().skip(1).limit(1);
        System.out.println(aaa.boxed());



    }
}
