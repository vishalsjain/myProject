package com.example._2023practice.Designpattern.CREATIONAL.singleton;

import java.io.NotSerializableException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMain {

    public static void main(String[] args) throws NotSerializableException, CloneNotSupportedException, InterruptedException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
 /*SingletonClass so=       SingletonClass.getSingleTonInstance();
        System.out.println(so.hashCode()+":"+so);
        so=  SingletonClass.getSingleTonInstance();
        System.out.println(so.hashCode()+":"+so);*/


        ExecutorService ex = Executors.newFixedThreadPool(15);
        for (int i = 0; i < 50; i++) {
            ex.submit(() -> {

                SingletonClass so1;
                try {
                    so1 = SingletonClass.getSingleTonInstance();
                } catch (NotSerializableException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread() + ":" + so1.hashCode());
            });
        }

        ex.shutdown();

        //  System.out.println(so.clone());



        Class c = Class.forName("com.example._2023practice.Designpattern.CREATIONAL.singleton.SingletonClass");
        Constructor[] consts = c.getDeclaredConstructors();
        System.out.println(consts);
        for (Constructor co :
                consts) {
            co.setAccessible(true);
            SingletonClass singleobj = (SingletonClass) co.newInstance();
            System.out.println("Reflection object:" + singleobj.hashCode());
        }

                Thread.sleep(5000);
        System.out.println("Reflection to avoid this you can create object using Enum");
        System.out.println(        SingletonEnum.GETINSTANCE1.hashCode()+":"+SingletonEnum.GETINSTANCE1.name());
        System.out.println(        SingletonEnum.GETINSTANCE1.hashCode()+":"+SingletonEnum.GETINSTANCE1.name());
        System.out.println(        SingletonEnum.GETINSTANCE.hashCode()+":"+SingletonEnum.GETINSTANCE.name());
        System.out.println(        SingletonEnum.GETINSTANCE1.getobjectinstance());



    }
}
