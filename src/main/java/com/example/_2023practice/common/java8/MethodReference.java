package com.example._2023practice.common.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {

        //Method reference
        BiFunction<Integer, String, Student> aNew = Student::new;
        Student s=        aNew.apply(1,"Vishal");
        Student s1=        aNew.apply(2,"jain");


        List<Student> l=new ArrayList();
        l.add(s);
        l.add(s1);

//Using Function to get data
        Function<Student, String> getName = Student::getName;
        List<String> list=MethodReference.getDatausingFunction(l,getName);
        list.forEach(System.out::println);

        //handling unchecked exception
        List<Integer> allist=  Arrays.asList(1,2,0,5);
        try {
            allist.stream().forEach(data -> System.out.println(50 / data));
        }
        catch(Exception e){
            System.out.println("Excetion:"+e.getMessage());

        }
        allist.stream().reduce((integer, integer2) -> {
            System.out.println(integer+":"+integer2);
                    return integer+integer2;
        }).stream().forEach(System.out::println);
    }

    private static List<String> getDatausingFunction(List<Student> l, Function<Student, String> getName) {

    List<String> listofName=new ArrayList<>();
    l.forEach(s->listofName.add(getName.apply(s)));
    //l.forEach(s->listofName.add(s::getName));
      // listofName= l.stream().map(Student::getName).collect(Collectors.toList());
return listofName;
    }

}
