package com.shiven;

import java.io.PrintStream;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
// shiven june 6

public class StringPalindrome {
	 public static void main(String[] args)
	  {
	    System.out.println("Enter a string of max lenght of 50 to check for palindrom");
	    Scanner sc = new Scanner(System.in);
	    String inputSring = sc.next();
	    sc.close();

	    boolean flag = false;
	    int i = 0;
	    for (i = 0; i < inputSring.length() / 2; i++) {
	      if (inputSring.charAt(i) == inputSring.charAt(inputSring.length() - i - 1)) {
	        continue;
	      }
	      flag = false;
	      break;
//	      System.out.println("No");
//          System.exit(0);
	    }

	    if (i == inputSring.length() / 2) {
	      flag = true;
	    }
	    else {
	      flag = false;
	    }
	    System.out.println(flag ? "Yes" : "No");
	  }
}
