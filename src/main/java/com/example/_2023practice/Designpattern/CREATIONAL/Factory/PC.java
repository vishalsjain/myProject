package com.example._2023practice.Designpattern.CREATIONAL.Factory;

/**
 * One of implementation of Computer(Super Type)
 * @author KK JavaTutorials
 */
public class PC implements Computer {
	
	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	public PC(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String ram() {
		return this.ram;
	}

	@Override
	public String hdd() {
		return this.hdd;
	}

	@Override
	public String cpu() {
		return this.cpu;
	}

	@Override
	public boolean isGraphicsEnabled() {
		return this.isGraphicsEnabled;
	}

	@Override
	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}
	
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}