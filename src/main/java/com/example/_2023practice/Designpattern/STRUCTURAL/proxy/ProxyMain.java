package com.example._2023practice.Designpattern.STRUCTURAL.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
