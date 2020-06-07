package com.edurekaExample;

import java.util.Scanner;

//https://www.edureka.co/blog/java-programs/

public class Factorial {
	int facresult = 0;

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Factorial fact = new Factorial();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("Factorial value =" + fact.calculateFactorial(num));
	}

	int calculateFactorial(int number) {
		if (number == 1)
			return 1;
		if (number > 1)
			facresult = number * calculateFactorial(number - 1);
		return facresult;
	}

}
