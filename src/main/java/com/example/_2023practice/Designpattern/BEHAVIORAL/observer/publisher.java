package com.example._2023practice.Designpattern.BEHAVIORAL.observer;

public interface  publisher {

    public abstract void addSub(Subscriber sub);
    public abstract void removeSub(Subscriber sub);
    public abstract void callSubscriber(Message msg);
}
