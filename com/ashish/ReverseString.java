package com.ashish;

//Program to reverse string

public class ReverseString {

    public static void main(String[] args) {

        //Using string buffer reverse method
        String str1 = "string";
        StringBuffer sb = new StringBuffer(str1);
        String revStr = sb.reverse().toString();
        System.out.println(revStr);

        //using for loop
        String str2 = "string";
        char[] charArrayStr2 = str2.toCharArray();
        for (int i = charArrayStr2.length -1, j = 0; i >= charArrayStr2.length / 2 ; i--, j++) {
            char tempChar = charArrayStr2[i];
            charArrayStr2[i] = charArrayStr2[j];
            charArrayStr2[j] = tempChar;
        }

        System.out.println(new String(charArrayStr2));
    }
}
