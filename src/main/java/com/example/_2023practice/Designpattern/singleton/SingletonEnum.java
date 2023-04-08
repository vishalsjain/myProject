package com.example._2023practice.Designpattern.singleton;

public enum  SingletonEnum {

GETINSTANCE1,GETINSTANCE;//this is nothing but SingleTonEnum GETINSTANCE1()

    //here GETINSTANCE1 is a seperate object and GETINSTANCE is seperate object hence hascode is different
    //with using enum as class for singleton object we can avoid reflection
public String getobjectinstance(){
    System.out.println("in method of singleton");
    return "test";
}
}
