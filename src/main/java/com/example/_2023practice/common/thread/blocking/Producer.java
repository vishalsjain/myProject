package com.example._2023practice.common.thread.blocking;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue b;

    public Producer(BlockingQueue b) {
        this.b = b;
    }

    public void produceData(){

        try {
        System.out.println("Producing element 1");
        b.put("Element 1");
        //Thread.sleep(1000);
        System.out.println("Producing element 2");
        b.put("Element 2");

          //  Thread.sleep(1000);
        System.out.println("Producing element 3");
        b.put("Element 3");
            System.out.println("produced");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void run() {
        produceData();
    }
}
