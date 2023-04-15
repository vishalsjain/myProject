package com.example._2023practice.Designpattern.BEHAVIORAL.iterator;

import java.util.Arrays;
import java.util.List;

public class IteratorImplClass {
    
    List<String> list= Arrays.asList("vishal","jain","mom");


    public IteratorImp getIterator(){
        return new IteratorImp();
    }
    public class IteratorImp{

        int index=0;
        public boolean hashNext(){
            if(index< list.size()){return  true;
            }
            return false;
        }
        public Object next(){
            Object o=list.get(index++);
            return o;
        }
    }
}
