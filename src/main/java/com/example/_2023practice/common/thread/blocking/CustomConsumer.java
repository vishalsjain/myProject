package com.example._2023practice.common.thread.blocking;

import java.util.concurrent.BlockingQueue;

public class CustomConsumer implements Runnable {

    private CustomisedBlockingQueue b;

    public CustomConsumer(CustomisedBlockingQueue b) {
        this.b = b;
    }

    public void consumeData(){

       for (int i=0;i<5;i++){
           b.take();
       }
    }

    @Override
    public void run() {
        consumeData();
    }
}
