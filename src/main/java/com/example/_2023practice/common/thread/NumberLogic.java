package com.example._2023practice.common.thread;

public class NumberLogic {

    public NumberLogic(int numberOfThread, int numberOfsequence, int number) {
        NumberOfThread = numberOfThread;
        this.numberOfsequence = numberOfsequence;
        this.number = number;
    }

    public int NumberOfThread;
    public int numberOfsequence;
    public int number;

    public void printNumber(int mod){

        synchronized (this) {
            while (number < numberOfsequence) {
                System.out.println("loop:"+Thread.currentThread().getName());
                  while(number%NumberOfThread!=mod){
                      System.out.println("Put in wait:"+
                              Thread.currentThread().getName());
                      try {
                          wait();
                      } catch (InterruptedException e) {
                          throw new RuntimeException(e);
                      }
                  }
                System.out.println("ThreadName:"+Thread.currentThread().getName()+":Number to be printed is :"+number++ );
                  notifyAll();
            }
        }
    }

}
