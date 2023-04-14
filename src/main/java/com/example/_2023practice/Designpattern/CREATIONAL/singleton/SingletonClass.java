package com.example._2023practice.Designpattern.CREATIONAL.singleton;

import java.io.NotSerializableException;
import java.io.Serializable;


// private constructor.private static class object, static instance method
//
public class SingletonClass implements Serializable,Cloneable {

    private static SingletonClass classObj;

    //private static final SingletonClass INSTANCE=new SingletonClass(); for eager initialisation
    //diff between above(eager) and this is here there is option to catch and throw exception thats it
        /*static{
            if(classObj==null) classObj=new SingletonClass();
       }*/
    private SingletonClass() {
        if (classObj != null) throw new RuntimeException("no permission");
        System.out.println("no Constructor Singleton");
    }


    public static SingletonClass getSingleTonInstance() throws NotSerializableException, InterruptedException {
        //here sync block is done on static class hence only 1 class can acess it
        synchronized (SingletonClass.class) {
            if (classObj == null) {
                Thread.sleep(2000);// use only when u call using threading
                classObj = new SingletonClass();
            }

            return classObj;
        }
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Vishal Exception");
    }

    @Override
    public String toString() {
        return "SingletonClass{" +

                '}';
    }


    public Object readObject() throws NotSerializableException, InterruptedException {
    return getSingleTonInstance();//here why we throw exception we can still call method
    //    throw new NotSerializableException("non serializable");
    }

    /*public void writeObject(Object obj) throws NotSerializableException {
        throw new NotSerializableException("non serializable");
    }*/


}
