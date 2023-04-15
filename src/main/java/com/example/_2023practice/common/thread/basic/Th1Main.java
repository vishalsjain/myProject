package com.example._2023practice.common.thread.basic;

import com.example._2023practice.common.java8.Student;

public class Th1Main {

    public static void main(String[] args) throws InterruptedException {

SharedObject s=new SharedObject();
        Thread th=new Thread(new Th1(s));
        Thread th2=new Thread(new Th2(s));
        th.start();
        Thread.sleep(1000);
        th2.start();
    }
}
