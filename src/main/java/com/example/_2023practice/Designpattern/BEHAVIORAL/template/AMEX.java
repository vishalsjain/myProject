package com.example._2023practice.Designpattern.BEHAVIORAL.template;

public abstract class AMEX extends PaymentFlow{


    @Override
    abstract void callLiveFlow() ;


    public void callAmex(String type) {
        System.out.println("Call AMex called");
    }

}
