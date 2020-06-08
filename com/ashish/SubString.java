package com.ashish;

public class SubString {

    public static void main(String[] args) {
        String str = "Hello my name is ashish";

        String subString1 = str.substring(0); //substring from 0th place
        String subString2 =  str.substring(0, str.length());

        boolean isEqual = subString1.equals(subString2);
        System.out.println("Is subString1 equals subString2 " + isEqual);
    }
}
