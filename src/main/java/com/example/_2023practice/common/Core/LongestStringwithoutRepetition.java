package com.example._2023practice.common.Core;

import java.util.HashSet;

//https://www.youtube.com/watch?v=sqxer2ynS6U&list=PLF9tovyahfL020hGgLIsRMZY4bfSLCFUa&index=13
public class LongestStringwithoutRepetition {
//
    public static void main(String[] args) {

        String s="abcdabcde";

        findLongest(s);
    }

    private static void findLongest(String s) {
        String longestTillNow="";
        String longestOverAll="";
        HashSet hs=new HashSet();

        for(String ss:s.split("")){

            if(!hs.add(ss)){
                hs.clear();
                longestTillNow="";
            }
            longestTillNow=longestTillNow+ss;
        }
        System.out.println("Longest longestTillNow String:"+longestTillNow);

    }

}
