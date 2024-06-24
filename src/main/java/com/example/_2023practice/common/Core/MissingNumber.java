package com.example._2023practice.common.Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {

    public static void main(String[] args) {
//        int[] arrayInt={1,2,3,4,5,6,7};
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 8};
     //   Arrays.asList(arrayInt);// this core does not work becuase it need list of input
        List<Integer> collect = Arrays.stream(arrayInt).boxed().collect(Collectors.toList());
        IntStream ints = IntStream.range(1, arrayInt.length + 1);
        System.out.println(
                ints.allMatch(a ->
                        collect.contains(a)));

        IntStream.range(1, arrayInt.length + 1)
                .filter(a -> !collect.contains(a))
                .forEach(System.out::println);


        int[] arr = {1, 2, 3, 4, 5, 6, 8};

        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int restSum=0;
        for (int i = 0; i < arr.length; i++) {
            //restSum+=arr[i];
            restSum=restSum+arr[i];
        }
        int missingNumber=sum-restSum;
        System.out.println("RestSum:"+restSum+":sum:"+sum);

        System.out.println(          missingNumber);

        //List x=Arrays.asList(arrayInt);
        List x=List.of(arrayInt);
       x.stream().forEach(System.out::println);

       Integer[] xx={1,2,3,4,5};
Arrays.asList(xx).stream().forEach(System.out::println);
    }
}
