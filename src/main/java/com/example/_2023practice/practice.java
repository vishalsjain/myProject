package com.example._2023practice;

import java.util.UUID;

public class practice {

    public static void main(String[] args) {
        System.out.println("vishal");
        UUID s=UUID.fromString("aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
        UUID s1=UUID.fromString("aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaB");
        System.out.println(s.compareTo(s1));
    }

}
