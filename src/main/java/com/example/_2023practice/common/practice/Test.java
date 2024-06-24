package com.example._2023practice.common.practice;

class A
{
    void m1()
    {
        System.out.println("In m1 A");
    }
}
class B extends A
{
    void m1()
    {
        System.out.println("In m1 B");
    }
    void m2()
    {
        System.out.println("In m2 B");
    }
}
public class Test {
 
    public static void main(String[] args) {
        A a=new B();

        ((B) a).m2();
        //a.m2();
        a.m1();
   new ArrayIndexOutOfBoundsException();
    }
}