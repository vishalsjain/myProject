package com.example._2023practice.common.practice;

class Parent
{
    
    Parent()
    {
        System.out.println("Parent Class Constructor Chaining!");
    }
    Parent(String value)
    {
        // Constructor Chaining to same class using this keyword
        this();
        System.out.println(value);
    }
}
 
class Child extends Parent
{
    Child(String value)
    {
    // Constructor Chaining to other class using super keyword
        super("Parent Class Constructor Called!");
        System.out.println(value);

    }

    public Child() {
        System.out.println("Child");
    }
}
 
public class Java2Blog 
{
    public static void main(String args[]) {
      
    Child obj = new Child("Child Class Constructor Called!");
        System.out.println("---------");
    Parent obj1=new Child("called child from parent ref");
    }
}
 