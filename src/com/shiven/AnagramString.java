package com.shiven;

import java.util.Scanner;


// https://www.hackerrank.com/challenges/java-anagrams/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
// shiv june 6


public class AnagramString {
	
	

	public static void main(String[] args) {
      System.out.println("Enter two string to check Anagrams");
		Scanner sc = new Scanner(System.in);
	    String a = sc.next();
	    String b = sc.next();
	    sc.close();
       
	}
	
	 static boolean isAnagram(String a, String b) {	
	    	 a= a.toLowerCase();
	        b= b.toLowerCase();
	        StringBuffer Abuff, Bbuff;
	        Bbuff = new StringBuffer(b);
	        if (a.length() != b.length())
	        {
	        	return false;
	         }	
	        int i;
	        for( i =0 ; i < a.length() ; i++) {
	        	String temp = a.substring(i,i+1);  
	        	int index = Bbuff.indexOf(temp);
	        	if(index == -1 )
	        	{
	        		return false;	        		
	        	}
	        	Bbuff.deleteCharAt(index);        	       	
	        }
	        if (i == a.length()) {
	        	return true;
	        }
	        return true;
	}
	 
}
