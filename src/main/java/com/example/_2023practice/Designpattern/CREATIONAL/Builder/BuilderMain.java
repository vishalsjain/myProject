package com.example._2023practice.Designpattern.CREATIONAL.Builder;

import com.example._2023practice.Designpattern.CREATIONAL.Factory.Laptop;

import java.util.stream.Stream;

public class BuilderMain {

    public static void main(String[] args) {
        LaptopBuilder lp=new LaptopBuilder("1","2","3");
        LaptopBuilder lp1=new LaptopBuilder("1","2","3");

        System.out.println(        lp.setBluetooth().setGraphic().build());
        System.out.println(        lp1.setGraphic().build());


        Stream.Builder<com.example._2023practice.Designpattern.CREATIONAL.Factory.Laptop> builder=  Stream.builder();
        builder.add(new Laptop("1","2","2",true,true));
        Stream s=builder.build();
        s.forEach(s1-> System.out.println(s1));


        //Child.builder().childName("asdad").parentAge(2).build();

    }


}
