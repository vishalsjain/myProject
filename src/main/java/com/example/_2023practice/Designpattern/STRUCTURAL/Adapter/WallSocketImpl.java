package com.example._2023practice.Designpattern.STRUCTURAL.Adapter;

/**
* @author KK JavaTutorials
*Implememtion of WallSocket, which by default
*generates 240 volts of power.
*/
public class WallSocketImpl implements WallSocket {
 
@Override
public Volt getVolts() {
return new Volt(240);
}
}