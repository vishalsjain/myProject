package com.example._2023practice.common.string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String s="abcd";
        String s1="dcba";
        checkAnagram(s,s1);
        System.out.println("--");
        checkAnagram(s,null);

        System.out.println("--");
        checkAnagram("ab  cd","ab cd");

    }

    private static void checkAnagram(String a, String b) {

        if(a==null ||b==null){
            System.out.println("Not Anagram");
            return;
        }
        String s=a.replace("\\s","");
        String s1=b.replaceAll("\\s","");
        System.out.println("before:"+s+":"+s1);
        if(s.length()!=s1.length()) {
            System.out.println("Not Anagram");
        return ;
        }
        char[] a1=s.toCharArray();
        char[] b1=s1.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        s=new String(a1);
        s1=new String(b1);
        System.out.println(s+":"+s1);

        if(s.equals(s1))
            System.out.println("Its Anagram");
        else
            System.out.println("Not an Anagram");

    }
}
