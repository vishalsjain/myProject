package com.example._2023practice.common.Core;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class Panagram {
    //it means it contain all a-z atleast once
    public static void main(String[] args) {

        //String a = "qwertyuiopasdfghjklzxcvbnm";
               String a="qwertyuiopasdfghjklzxcvbn";
        System.out.println((int)a.charAt(0));
        Optional<Long> count = Optional.ofNullable(Arrays.stream(a.split(""))
                .collect(Collectors.toSet())
                .stream().distinct().count());

        if(count.get()==26){
            System.out.println("Panagram");
        }else{
            System.out.println("Not a Panagram");
        }
    }
}
