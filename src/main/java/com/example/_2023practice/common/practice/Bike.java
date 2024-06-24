package com.example._2023practice.common.practice;

import java.io.IOException;

class Bike{
 int speedlimit=90;  
}  
 class Honda3 extends Bike{
 int speedlimit=150;//if we use this variable then obj.speedlimit will print base class value.

  public void tets(){
   speedlimit=10;
   super.speedlimit=20;//use this to update value of super class
 

  }
 public static void main(String args[]){  
  Bike obj=new Honda3();
  ((Honda3) obj).tets();
  String s =new String();
  System.out.println(obj.speedlimit);//20
  Honda3 h=new Honda3();
  System.out.println(h.speedlimit);
   }  }

