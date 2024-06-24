package com.example._2023practice.common.Core;

public class StringSortWithoutUtilMethods {
    public static void main(String[] args) {
        String input = "zash";
        String sorted = bubbleSortString(input);
        System.out.println("Original: " + input);
        System.out.println("Sorted: " + sorted);
        sortArray(input);
    }

    public static void sortArray(String input) {

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            for (int j = i; j < chars.length; j++) {

                if (chars[i] > chars[j]) {
                    char c = chars[j];
                    chars[j] = chars[i];
                    chars[i] = c;
                }
            }
        }
        System.out.println(chars);
    }

    public static String bubbleSortString(String input) {
        char[] chars = input.toCharArray();

        int n = chars.length;
        boolean swapped;
        
        do {
            swapped = false;
            System.out.println("1");
            for (int i = 1; i < n; i++) {
                if (chars[i - 1] > chars[i]) {
                    // Swap characters
                    char temp = chars[i - 1];
                    chars[i - 1] = chars[i];
                    chars[i] = temp;
                    swapped = true;
                    System.out.println("swapped");
                }
                System.out.println("2");
            }
            n--; // Decrease the size of the unsorted portion
        } while (swapped);

        return new String(chars);
    }
}
