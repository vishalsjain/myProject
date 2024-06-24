package com.example._2023practice.common.practice;

public class CountryCOmparable implements Comparable{

    String countryName;
 
    public CountryCOmparable(String countryName) {
        super();
        this.countryName = countryName;
    }
 
    @Override
    public int compareTo(Object arg0) {
        CountryCOmparable country=(CountryCOmparable) arg0;
 
        return (this.countryName.compareTo(country.countryName) ) ;
    }
 
    public String getCountryName() {
        return countryName;
    }
 
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
 
}