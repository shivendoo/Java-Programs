package com.shiven;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		
		System.out.println("Enter a sting with any character tockens");
		Scanner sc = new Scanner(System.in);
	//	String s = sc.nextLine();
		sc.close();
	//	String s="He is a very very good boy, isn't he?";
		String s=  "YES      leading spaces        are valid,    problemsetters are         evillllll";
		s= "                a            ";
		String splitArr[] = s.split("[ !,?._'@]+");
		System.out.println(splitArr.length);		
		for(int i = 0 ; i < splitArr.length ; i++) {
		 System.out.println(splitArr[i]);
		}

	}
//hi id@sdsd]kdsf[dsfjsfk?dlkjflsQ!kdsflksf
}
