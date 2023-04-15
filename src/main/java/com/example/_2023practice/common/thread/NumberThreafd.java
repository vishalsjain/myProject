package com.example._2023practice.common.thread;

public class NumberThreafd implements  Runnable{

    NumberLogic numLogic;
    int mod;

    public NumberThreafd(NumberLogic numLogic,int mod) {
        this.numLogic = numLogic;
        this.mod=mod;
    }

    @Override
    public void run() {
        numLogic.printNumber(mod);
    }
}
