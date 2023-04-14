package com.example._2023practice.Designpattern.CREATIONAL.Factory;
/**
 * This Super type can be implemented by many classes
 * This may be abstract class as well
 * @author KK JavaTutorials
 */
public interface Computer {

	public abstract String ram();
	public abstract String hdd();
	public abstract String cpu();
	
	public boolean isGraphicsEnabled();
	public boolean isBluetoothEnabled();
}