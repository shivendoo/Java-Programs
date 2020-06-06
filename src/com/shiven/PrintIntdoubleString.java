package com.shiven;


import java.io.PrintStream;
import java.util.Scanner;

public class PrintIntdoubleString {

	  public static void main(String[] args)
	  {
	    System.out.println("Enter Integer Double and String in the sequence");
	    Scanner sc = new Scanner(System.in);
	    int IntValue = sc.nextInt();
	    double doubleValue = sc.nextDouble();
	    String stringValue = sc.nextLine();
	    sc.close();
	    System.out.println(stringValue);
	    System.out.println(doubleValue);
	    System.out.println(IntValue);
	  }
	
}
