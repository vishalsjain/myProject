package com.example._2023practice.common.Core;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

public class DeleteArray {

    public static void main(String[] args) {
        int[] originalA={1,2,3,4,5,6};
        Integer deleteElem=3;
        int[] newArray=new int[originalA.length-1];
int index=0;
        System.out.println("old Array:"+Arrays.toString(originalA));
        for(int i=0;i<=originalA.length-1;i++){
            if(originalA[i]!=deleteElem){
                newArray[index]=originalA[i];
                index++;
            }
        }
        System.out.println("new Array:"+Arrays.toString(newArray));

        Spliterator.OfInt spliterator = Arrays.spliterator(originalA, 0, 2);
        spliterator.forEachRemaining((IntConsumer) integer -> System.out.println(integer));

        Integer[] array = {1, 2, 3, 4, 5};
        Arrays.copyOfRange(array,0,2);
        Collections.addAll(Arrays.asList(Arrays.copyOfRange(array,0,2)))
                  ;
        System.out.println("---");
        List.of(Arrays.stream(Arrays.copyOfRange(array, 0, 2)).toArray())
                .forEach(System.out::println);   ;

        List<Integer> list = Arrays.asList(Arrays.copyOfRange(array, 0, 2));

        System.out.println(list);

    }
}
