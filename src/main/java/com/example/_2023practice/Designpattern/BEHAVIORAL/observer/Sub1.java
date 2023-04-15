package com.example._2023practice.Designpattern.BEHAVIORAL.observer;

public class Sub1 implements Subscriber{
    @Override
    public void printData(Message msg) {
        System.out.println("Sub1:"+msg.getMessage());
    }
}
