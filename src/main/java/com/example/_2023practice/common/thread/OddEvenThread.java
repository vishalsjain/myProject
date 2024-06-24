package com.example._2023practice.common.thread;

public class OddEvenThread {
    public int count=1;
    public boolean odd=true;
    public int MAX=10;

    public void printodd() throws InterruptedException {

        while (count<MAX){

            synchronized (this) {
                while (!odd) {
                    System.out.println("Wait for Odd");
                    wait();
                }

                System.out.println("value of odd is:" + count);
                count++;
                odd = false;
                notify();
            }
        }
        System.out.println("Out of Odd loop");

    }


    public void printEven() throws InterruptedException {

        while (count<MAX){

            synchronized (this){
                while(odd){
                    System.out.println("Wait for Even");
                    wait();
                }

            System.out.println("value of Even is:"+count);
            count++;
            odd=true;
            notify();
            }
        }
        System.out.println("Out of Even loop");

    }

    public static void main(String[] args) {
        OddEvenThread oep=new OddEvenThread();


        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    oep.printEven();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    oep.printodd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
