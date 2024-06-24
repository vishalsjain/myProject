package com.example._2023practice.common.thread.blocking;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class CustomisedBlockingQueue {

    public ReentrantLock lk= new ReentrantLock();
    Condition empty=lk.newCondition();
    Condition notEmpty=lk.newCondition();

    final Object[] arr = new Object[3];
    int putIndex, takeIndex;
    int count;

    public void put(Object e) {

        try {
            lk.lock();
            while (count == arr.length) {
                notEmpty.await();
            }

            if (putIndex == arr.length){
                putIndex = 0;
            }
            arr[putIndex] = e;

            System.out.println("inside put"+arr);
            putIndex++;

            count++;
            empty.signal();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            lk.unlock();
        }
    }

    public void take() {

        try {
            lk.lock();
            while (count ==0) {
                System.out.println("Empty await");

                empty.await();
            }
            System.out.println("inside take"+arr[takeIndex]);
            takeIndex++;
            if (takeIndex == arr.length){
                takeIndex = 0;
            }
            count--;
            notEmpty.signal();
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        } finally {
            lk.unlock();
        }
    }


}
