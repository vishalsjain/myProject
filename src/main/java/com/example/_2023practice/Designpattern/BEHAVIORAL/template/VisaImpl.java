package com.example._2023practice.Designpattern.BEHAVIORAL.template;

public class VisaImpl extends VISA {

    @Override
    void callLiveFlow() {
        System.out.println("VISA live flow");
        callVisa("LIVE");
    }


}
