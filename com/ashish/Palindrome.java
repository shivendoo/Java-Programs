package com.ashish;

public class Palindrome {

    public static void main(String[] args) {
        String str = "naman";
        char[] charArray = str.toLowerCase().toCharArray();
        boolean isPalindrome = true;

        for (int i = charArray.length - 1, j = 0; i > charArray.length / 2; i--, j++) {
            if (charArray[i] != charArray[j]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }
}

