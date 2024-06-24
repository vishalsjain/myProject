package com.example._2023practice.common.thread.blocking;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {

    public static void main(String[] args) {
        java.util.concurrent.BlockingQueue blk;
        blk= new ArrayBlockingQueue(1);

        Producer p=new Producer(blk);
Consumer c=new Consumer(blk);

Thread t=new Thread(p);
        Thread t1=new Thread(c);
        t.start();
        t1.start();


    }
}
