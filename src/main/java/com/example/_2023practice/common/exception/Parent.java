package com.example._2023practice.common.exception;

import java.io.IOException;

public class Parent {

    public void getName() throws IOException
    {
        System.out.println("Parent");
    }

    public void getName1() throws IOException {
        System.out.println("Parent getName1");
    }

    public void getName1Compile() //throws IOException {
    throws Exception{
        System.out.println("Parent getName1Compile");
    }
    public void getName1Runtime() throws NullPointerException {
        System.out.println("Parent getName1Runtime");
    }


}
