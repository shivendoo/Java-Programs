package com.ashish;

public class StringSplit {

    public static void main(String[] args) {
        String str = "Hello my name is ashish";
        String[] strArray = str.split(" ");
        for (String token : strArray) {
            System.out.println(token);
        }
    }
}
