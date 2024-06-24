package com.example._2023practice.common.practice;

class Bike9{
 final int speedlimit;//=90;//final variable
 static final int vari = 0;
//final int x;
static final int y;
static{
 y=10;

}
public  Bike9()
 {
  speedlimit=10;
//  y=10;
 }
 void run(){
final int i;//here since i is inside method it canbe initialised seperately,but if its as instance variable
  //it can be initialised at field itself or at constructor
i=10;
//i=20;
  System.out.println(i);

  //speedlimit=400;
 }  
 public static void main(String args[]){
 Bike9 obj=new  Bike9();  
 obj.run();
 //obj.speedlimit=500;
 }  
}