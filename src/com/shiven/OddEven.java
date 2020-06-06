package com.shiven;

import java.io.PrintStream;
import java.util.Scanner;

public class OddEven {

	{
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Number");
	    int num = scan.nextInt();
	    scan.close();
	    System.out.println("Entered Input is-->" + num);
	    if (num % 2 != 0)
	      System.out.println("Weird11");
	    else if ((num >= 2) && (num <= 5))
	      System.out.println("Not Weird22");
	    else if ((num >= 6) && (num <= 20))
	      System.out.println("Weird33");
	    else if ((num > 20) && (num <= 100))
	      System.out.println("Not Weird44");
	  }
	
}
