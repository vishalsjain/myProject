package com.example._2023practice.common.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
  public static void main(String[] args)  {

          System.out.println(exceptionTest());
ExceptionTest et=new ExceptionTest();
      //    callException();
  }

    private  static void callException() {
  throw new NullPointerException();
  }

    public static int exceptionTest()
  {
   int i=6;
   try{
    if(i==6) new NullPointerException();
    return i;
   }
   catch(NullPointerException e)
   {
    i=10;
       System.out.println("NPE");
      // return i;

    //throw e;
   }
   finally
   {
    i=20;
    System.out.println("In finally block");
    return i;
    //   throw new NullPointerException();
   }   
  }
}