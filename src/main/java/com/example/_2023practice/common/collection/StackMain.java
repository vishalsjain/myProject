package com.example._2023practice.common.collection;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        StackImpl s=new StackImpl(3);

        s.push(1);;
        s.push(2);
        s.push(3);
        //s.push(4);
        //s.push(5);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push(5);
        System.out.println(s.peek());


        Stack stack=new Stack();
        }
}
