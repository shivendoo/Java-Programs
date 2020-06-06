package com.ashish;

//Anagram program in java : Write a java program to check whether two given strings are anagram or not.
// Two strings are said to be anagram if they contain same set of characters but in different order.
// For example, “Mother In Law” and “Hitler Woman” are anagrams.
// These type of java programming questions test the coding skills of a candidate.

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String firstStr = "Mother In Law";
        String secondStr = "Hitler Woman";

        //converting string to character array
        char[] firstCharArray = firstStr.toLowerCase().toCharArray();
        char[] secondCharArray = secondStr.toLowerCase().toCharArray();

        //sorting character array
        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        //removing spaces
        String firstStrTemp = new String(firstCharArray).trim();
        String secondStrTemp = new String(secondCharArray).trim();

        if (firstStrTemp.equalsIgnoreCase(secondStrTemp)) {
            System.out.println(firstStr + " and " + secondStr + " are Anagram");
        } else {
            System.out.println(firstStr + " and " + secondStr + " are not Anagram");
        }
    }
}
