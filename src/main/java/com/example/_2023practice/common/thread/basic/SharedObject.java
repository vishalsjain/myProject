package com.example._2023practice.common.thread.basic;

public class SharedObject {

    public boolean status;

    public void getData() throws InterruptedException {

        synchronized (this) {
            System.out.println("11");

            while (!status) {

                    System.out.println("22");
                System.out.println("Waiting"+Thread.currentThread().getName());
                status=true;
                wait();
                Thread.sleep(10000);//if this sleep is commented then we wil not understand execution better
            }
            System.out.println("Outside wait");
        }
    }

    public void setData() throws InterruptedException {

        synchronized (this) {
            System.out.println("1");
        while (status) {


            System.out.println("2");
                status=false;
                notify();

                System.out.println("Notified" + Thread.currentThread().getName());

            }
            System.out.println("Outside loop"+status);
        }
    }
}
