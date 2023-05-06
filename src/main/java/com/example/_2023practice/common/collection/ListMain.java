package com.example._2023practice.common.collection;

public class ListMain {
    public static void main(String[] args) {

        LinkedListV l=new LinkedListV();
        l.add("vi");
        l.add("sd");
        l.add("asd");
        System.out.println(l.head.toString());
        l.addToHead("head");
        System.out.println(l.head.toString());


        LinkedListV.Node n=new LinkedListV.Node("1");
        LinkedListV.Node n1=new LinkedListV.Node("2");
        LinkedListV.Node n2=new LinkedListV.Node("3");
        LinkedListV.Node n3=n;
        LinkedListV l1=new LinkedListV();
        l1.add(n);
        l1.add(n1);
        l1.add(n2);
        l1.add(n3);
        System.out.println(l1.iscyle());
       // System.out.println(l1.head.toString());

    }
}
