package com.example._2023practice.common.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 
public class IterateMapMain {
 
    public static void main(String args[])
    {
        // HashMap with Country as key and capital as value
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("India","Delhi");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("Russia","Moscow");
 
        // Iterating java iterator
        System.out.println("Iterating java Iterator");
        Iterator<String> countryKeySetIterator=map.keySet().iterator();
        while(countryKeySetIterator.hasNext()){
            String countryKey=countryKeySetIterator.next();
            map.put("1", "KathMandu");
            System.out.println(countryKey);


            Iterator<Entry<String, String>> x = map.entrySet().iterator();

            while (x.hasNext()){
                Map.Entry y=x.next();
                System.out.println(y.getKey());

            }
        }
        System.out.println("-----------------------------");
    }
 
}
