package com.example._2023practice.common.exception;

import java.io.IOException;

public class Child extends Parent{

    public void getName()
    {
        System.out.println("child");
    }

    //if parent do not throw then it give compile time exception
    public void getName1() throws IOException
    {
        System.out.println("child getName1");
    }

    public void getName1Compile() //throws Exception {  //if parent have IO then child cannot have Exception
    throws IOException{
        System.out.println("Parent getName1Compile");
    }

    public void getName1Runtime() throws RuntimeException{
        System.out.println("Child getName1Runtime");
    }
}
