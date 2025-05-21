package com.example._2023practice.common.practice
        ;

public class Animal
{  //it is not static hence it will be called only when object is created
    {
    System.out.println("hgjhghj");
    }

    static{
        System.out.println("stattic");
    }
    public Animal(int vis) {
        System.out.println("constructor");
        this.vis = vis;
    }

    private void methodAnimal(){

}
    /* void consume(int a)
            {
                System.out.println(a+" consumed!!");
            }*/

    public int vis;
    static void consume(int a)
    {  
        System.out.println("consumed static "+a);  
    }  
    public static void main (String args[])  
    {  
        Animal a = new Animal(122);
        a.consume(10);
        Animal.consume(20);
        a.methodAnimal();
    }  
}    