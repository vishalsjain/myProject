package com.example._2023practice.common.practice;


   
public class Derived extends Base  

{

    public  Derived()
    {
        System.out.println("Derived constructor");
    }
    protected final void getInfo()
    {  
        System.out.println("method of Derived class");  
    }  
    public static void main(String[] args)  
    {  
        Derived obj = new Derived();
      obj.getInfo();


        Base obj1 = new Base();
      //  obj1.getInfo();   //since this method is priavte it can only be called form within class and not via obj.

        Base obj2 = new Derived();
        ((Derived) obj2).getInfo();
    }  
} 