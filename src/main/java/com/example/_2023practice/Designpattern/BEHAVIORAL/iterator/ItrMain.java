package com.example._2023practice.Designpattern.BEHAVIORAL.iterator;

public class ItrMain {

    public static void main(String[] args) {
        IteratorImplClass i=new IteratorImplClass();

        IteratorImplClass.IteratorImp x=i.getIterator();
        while(x.hashNext()){
            String ss=(String)x.next();
            System.out.println(ss);
        }
    }
}
