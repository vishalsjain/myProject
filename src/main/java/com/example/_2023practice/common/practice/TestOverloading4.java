package com.example._2023practice.common.practice;

class TestOverloading4{
    //JVM need this below method if you comment you cannot run the class only
public static void main(String[] args){System.out.println("main with String[]");}
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
}  