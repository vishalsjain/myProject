package com.example._2023practice.common.Core;

import java.util.Iterator;
import java.util.Stack;

public class ReverseWords {

    public static void main(String[] args) {

        String s="Vishal Jain is best";
        String[] splStr=s.split(" ");
        Stack stack=new Stack();

        for(String ss:splStr){
            stack.push(ss);
        }
        System.out.println(stack);
    while(!stack.isEmpty()){
        System.out.println(stack.pop());
    }
    }
}
