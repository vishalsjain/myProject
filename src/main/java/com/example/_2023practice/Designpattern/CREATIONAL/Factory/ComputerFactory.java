package com.example._2023practice.Designpattern.CREATIONAL.Factory;


/**
 * This Factory class returns Computer instance as per
 * provided input parameters
 * @author KK JavaTutorials
 */
public class ComputerFactory {

	private ComputerFactory() {
		
	}
	
	public static Computer getComputer(ComputerType computerType,String ram,String hdd,String cpu,boolean isGraphicsEnabled,boolean isBluetoothEnabled) {
		switch (computerType) {
		case PC:
			return new PC(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		case SERVER:
			return new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		case LAPTOP:
			return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		default:
			throw new RuntimeException("Invalid Computer Type!!");

		}
	}
}