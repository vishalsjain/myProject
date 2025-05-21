package com.example._2023practice.common.practice;

public class MethodOverloadingExample {
 
 public void methodTest(Object object)
 {
  System.out.println("Calling object method");
 }
 public void methodTest(Integer object)
 {
  System.out.println("Calling Integer method");
 }

 /*public void methodTest(String object)
 {
  System.out.println("Calling String method");
 }
 */
 public static void main(String args[])
 {
  MethodOverloadingExample moe=new MethodOverloadingExample();
  Integer i=null;
  moe.methodTest(null);//if we have 2 method Object,String,Integer then we get compile time issue as null need to be cast to
  //some reference vavlue
  moe.methodTest(i);
  String s=null;
          moe.methodTest(s);
 }
}