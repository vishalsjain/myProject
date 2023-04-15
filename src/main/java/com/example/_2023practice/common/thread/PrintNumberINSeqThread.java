package com.example._2023practice.common.thread;

public class PrintNumberINSeqThread {

    /*
    Thread1   Thread2   Thread3
       1        2          3
       4        5          6
       7        8          9
     */
    public static void main(String[] args) {
NumberLogic numlogic=new NumberLogic(3,10,1);

Thread t=new Thread(new NumberThreafd(numlogic,1));
        Thread t1=new Thread(new NumberThreafd(numlogic,2));
        Thread t2=new Thread(new NumberThreafd(numlogic,0));
        t.start();
        t1.start();
        t2.start();

    }

}
