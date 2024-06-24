package com.example._2023practice.common.thread.blocking;

import java.util.concurrent.BlockingQueue;

public class CustomProducer implements Runnable {

    private CustomisedBlockingQueue b;

    public CustomProducer(CustomisedBlockingQueue b) {
        this.b = b;
    }

    public void produceData(){

        for (int i=0;i<5;i++){
            b.put(i);
        }
    }

    @Override
    public void run() {
        produceData();
    }
}
