package com.example._2023practice.common.thread.basic;

public class Th1 implements Runnable{

    public SharedObject std;

    public Th1(SharedObject std) {
        this.std = std;

    }

    public Integer count;
    @Override
    public void run()
    {
        try {
            std.getData();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
