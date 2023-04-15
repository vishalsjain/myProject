package com.example._2023practice.Designpattern.BEHAVIORAL.observer;

public class Sub2 implements Subscriber{
    @Override
    public void printData(Message msg) {
        System.out.println("Sub2:"+msg.getMessage());
    }
}
