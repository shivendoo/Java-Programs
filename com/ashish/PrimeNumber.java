package com.ashish;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int inputNumber = scanner.nextInt();
        boolean isPrimeNumber = true;

        if (inputNumber == 0 || inputNumber == 1) {
            System.out.println("Given number is not a prime number");
        }  else {
            for (int i = 2; i < inputNumber; i++) {
                if (inputNumber % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        if (isPrimeNumber) {
            System.out.println("Given number is a prime number");
        } else {
            System.out.println("Given number is not a prime number");
        }

    }

}
