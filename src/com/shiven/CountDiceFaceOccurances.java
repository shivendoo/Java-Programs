package com.shiven;

import java.util.Random;

public class CountDiceFaceOccurances {

	
	public static void main(String[] args) {
		Random rm = new Random();
	
		
	 int freq [] = new int[7];
	 
	 for (int i= 1 ; i <= 1000; i++) {
		int num = 1+rm.nextInt(6);  // 0 -6 
		System.out.println(num);
		 freq[num]++;		 
	 }
	 
	 for (int face = 1 ; face < freq.length;face++ ) {
		 
		 System.out.println( face+"\t:"+freq[face]);
	 }
		
	}
	
}
