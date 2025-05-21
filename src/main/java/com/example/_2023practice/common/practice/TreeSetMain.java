package com.example._2023practice.common.practice;

import java.util.Iterator;
import java.util.TreeSet;
 
public class TreeSetMain {
 
 /**
  * @author Arpit Mandliya
  */
 public static void main(String[] args) {
  CountryCOmparable indiaCountry=new CountryCOmparable("India");
  CountryCOmparable chinaCountry=new CountryCOmparable("China");
  CountryCOmparable nepalCountry=new CountryCOmparable("Nepal");
  CountryCOmparable bhutanCountry=new CountryCOmparable("Bhutan");
  CountryCOmparable indiaCountry2=new CountryCOmparable("India");
  CountryCOmparable nepalCountry2=new CountryCOmparable("Nepal");
 
  TreeSet countryTreeSet = new TreeSet();
  countryTreeSet.add(indiaCountry);
  countryTreeSet.add(chinaCountry);
  countryTreeSet.add(nepalCountry);
  countryTreeSet.add(bhutanCountry);
  countryTreeSet.add(indiaCountry2);
  countryTreeSet.add(nepalCountry2);
  System.out.println(indiaCountry.hashCode());
  System.out.println(indiaCountry2.hashCode());
  Iterator counIter=countryTreeSet.iterator(); // put debug point here
  while(counIter.hasNext())
  {
   CountryCOmparable c= (CountryCOmparable) counIter.next();
   System.out.println(c.getCountryName()+":hashcode+"+c.hashCode());
  }
 }
 
}