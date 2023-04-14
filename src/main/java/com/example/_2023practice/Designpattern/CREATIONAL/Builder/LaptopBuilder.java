package com.example._2023practice.Designpattern.CREATIONAL.Builder;

public class LaptopBuilder {


        private String ram;
        private String hdd;
        private String cpu;
        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;


    public LaptopBuilder setBluetooth(){
        this.isBluetoothEnabled=true;
return this;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public LaptopBuilder setGraphic(){
        this.isGraphicsEnabled=true;
return this;
    }

    public LaptopBuilder(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Laptop build(){
       return  new Laptop(this);
    }
        public String toString() {
        return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
                + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }

    }


