package com.example._2023practice.Designpattern.BEHAVIORAL.template;

public class AmexImpl extends AMEX{


    @Override
    void callLiveFlow() {
        System.out.println("AMEX live flow");
        callAmex("LIVE");
    }


}
