package com.example._2023practice.Designpattern.STRUCTURAL.Adapter;

/**
* @author KK JavaTutorials
* Client program which shows how
* two incompatible interfaces(WallSocket & MobileAdapter)
* talk to each other using Adapter Design Pattern
*/
public class ClientTest {
 
public static void main(String[] args){
//Creating WallSocket Reference
WallSocket wallSocket = new WallSocketImpl();
//Generating 240 volts by default
Volt v240 = wallSocket.getVolts();
System.out.println(v240);
//Creating MobileAdapter Reference
MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
//Generating 3 volts using Adapter design pattern
Volt v3 = mobileAdapter.get3Volt();
System.out.println(v3);
}
}