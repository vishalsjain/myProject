package com.example._2023practice.Designpattern.BEHAVIORAL.observer;

public class Sub3 implements Subscriber{
    @Override
    public void printData(Message msg) {
        System.out.println("Sub3:"+msg.getMessage());
    }
}
