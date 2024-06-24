package com.example._2023practice.common.Core;

public class TwoStackOneArray {

    public Integer[] array;
    public int top1,top2;
    public int size;

    public TwoStackOneArray(int size) {
        this.array = new Integer[size];
        this.top1 = -1;
        this.top2 = size;
        this.size = size;
    }

    public void assigntoTop1(Integer data){
        if(top1>=top2-1) throw new RuntimeException("Error top1");
        array[++top1]=data;
    }
    public void assigntoTop2(Integer data){
        if((top2-1)<=top1) throw new RuntimeException("Error top2");
        array[--top2]=data;
    }

    public void iteratetop1(){
        for(int i=top1;i>=0;i--){
            System.out.println(array[i]);

        }
        }

    public static void main(String[] args) {
        TwoStackOneArray x=new TwoStackOneArray(4);
        x.assigntoTop1(1);
        x.assigntoTop1(2);
        x.assigntoTop1(3);
        x.assigntoTop1(4);
        //x.assigntoTop1(3);

        x.iteratetop1();
        x.iteratetop1();

    }

}
