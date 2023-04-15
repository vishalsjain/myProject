package com.example._2023practice.Designpattern.BEHAVIORAL.observer;

import java.util.ArrayList;
import java.util.List;

public class PUblisheImpl implements publisher {

    List<Subscriber> list=new ArrayList<>();

    @Override
    public void addSub(Subscriber sub) {
        list.add(sub);

    }

    @Override
    public void removeSub(Subscriber sub) {
        list.remove(sub);
    }

    @Override
    public void callSubscriber(Message msg) {

        for (Subscriber s:list) {
s.printData(msg);
        }
    }

}