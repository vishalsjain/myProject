package com.example._2023practice.Designpattern.BEHAVIORAL.observer;

public class observerMain {

    public static void main(String[] args) {
        PUblisheImpl p=new PUblisheImpl();
Subscriber s=new Sub1();
        p.addSub(s);
        p.addSub(new Sub2());
        p.addSub(new Sub3());
        System.out.println("----");
        p.callSubscriber(new Message("First video published"));

        p.removeSub(s);
        System.out.println("----");
        p.callSubscriber(new Message("Second video published"));

    }
}
