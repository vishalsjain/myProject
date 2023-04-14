package com.example._2023practice.Designpattern.BEHAVIORAL.template;

public abstract class VISA extends PaymentFlow{
    @Override
    abstract void callLiveFlow() ;

    public void callVisa(String type){

        System.out.println("callVisa Called for live");
    }
}
