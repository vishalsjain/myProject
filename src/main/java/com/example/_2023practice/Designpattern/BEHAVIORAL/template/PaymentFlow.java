package com.example._2023practice.Designpattern.BEHAVIORAL.template;

public abstract class PaymentFlow {



    public void callDS(String Type){
        if (Type=="TRY")
        this.callTryFlow();
        else
            callLiveFlow();

    }

     abstract  void callLiveFlow() ;

    public final  void callTryFlow() {
        System.out.println("Call Try flow");
    }


}
