package com.edurekaExample;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
	
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println("Enter one opertor among (+,-,*,/)");
	    char operator = sc.next().toCharArray()[0];
	    sc.close();
	    Calculator cal = new Calculator();
		System.out.println("Result of calculation for ("+ num1+""+ operator+""+num2+") = " +cal.calculate(num1 , num2, operator));

	}
	
	double calculate (double n1 , double n2,char opert) {
		   switch (opert) {
		    case  '+' :
		    return n1+n2;
		    case  '-' :
			return n1-n2;
			    
		    case  '/' :
			    return n1/n2;
			    
		    case  '*' :
			    return n1*n2;
		    default:
		    	return 0.0;		    
		    }
		
	}

}
