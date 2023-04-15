package com.example._2023practice.common.thread.basic;

public class Th2 implements Runnable{

    public SharedObject std;

    public Th2(SharedObject std) {
        this.std = std;

    }

    public Integer count;
    @Override
    public void run()
    {

        try {
            std.setData();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
