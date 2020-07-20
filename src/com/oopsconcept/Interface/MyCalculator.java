package com.oopsconcept.Interface;

import java.util.*;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int num) {
		int sumOfDivisor = 0;
		System.out.print(" Divisors of number "+num+" is:");
		for (int i = 1; i <= num; i++) {
			//System.out.println(i);
			if (num % i == 0) {
				System.out.print(i+", ");
				sumOfDivisor = sumOfDivisor + i;
			}
		}
		System.out.println();
		System.out.println("Sum of all divisors of number "+num+" is :"+sumOfDivisor);
		return sumOfDivisor;
	}
	
	public static void main(String[] args) {
		AdvancedArithmetic dc = new MyCalculator();
		dc.divisor_sum(6);
	}

}
