package com.example._2023practice.common.thread.blocking;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue b;

    public Consumer(BlockingQueue b) {
        this.b = b;
    }

    public void consumeData(){

        while(true)
        {
            try {
                System.out.println("Consumed "+b.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        consumeData();
    }
}
