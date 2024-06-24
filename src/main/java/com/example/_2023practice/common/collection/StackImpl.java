package com.example._2023practice.common.collection;

import java.util.Stack;

public class StackImpl {

    int[] arrayInt;
    Integer top;

    public StackImpl(int arrayIntLength) {
        this.arrayInt = new int[arrayIntLength];
        this.top = -1;
    }

    public void push(Integer data){
        if(isFull())
            throw new RuntimeException("Stack is Full");
        arrayInt[++top]=data;
        System.out.println("Size of stack is :"+top);
     }
    public int pop(){
    if(isEmpty())
         throw  new RuntimeException("Stack is EMpty");
        return arrayInt[top--];
    }
public int peek(){
        if(isEmpty())
            throw new RuntimeException("Stack EMpty peek");
        return arrayInt[top];
}

    private boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (top== arrayInt.length-1){//this -1 is very imp
            return true;
        }
        return false;
    }


}
