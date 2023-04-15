package com.example._2023practice.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {

        System.out.println("Sort Array in descending order");
        int[] intA={0,1,2,-2, 6};
Arrays.stream(intA).sorted().forEach(s->
        System.out.println(s));

List<Integer> i=Arrays.asList(0,1,2,-2, 6);
i.stream().sorted(Collections.reverseOrder())
        .forEach(s-> System.out.println(s)
        );

        System.out.println("move zero to last-------");

        int[] intdata={0,10,2,6,0,0,5,8,9,0};
        int lengthdata=intdata.length;
        int counter=0;

        for (int i1 = 0; i1 < intdata.length; i1++) {
            if (intdata[i1] != 0) {
                intdata[counter] = intdata[i1];
                counter++;
            }
        }
            counter= intdata.length-counter;
        while (counter > 0) {
            intdata[lengthdata-1] = 0;
            counter--;
            lengthdata--;
        }
        Arrays.stream(intdata).forEach(aa-> System.out.println(aa));




}
}
