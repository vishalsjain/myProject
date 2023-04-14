package com.example._2023practice.Designpattern.STRUCTURAL.Adapter;
/**
* Model class which represents electricity
* power in volts
* @author KK JavaTutorials
*/
public class Volt {
 
private int volts;
 
public Volt(int volts) {
this.volts = volts;
}
 
public int getVolts() {
return volts;
}
 
@Override
public String toString() {
return "Volt [volts=" + volts + "]";
}
}