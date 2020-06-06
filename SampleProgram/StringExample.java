package SampleProgram;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-strings-introduction/problem
//shiven - 6 june 2020
public class StringExample {

	
	
	public static void main(String[] args) {
		
		System.out.println("Enter two string of lowercase letters");
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		int Alenth = A.length();
		int Blenth = B.length();
		int loopLenght = 0;
				
		System.out.println(Alenth+Blenth);
	// *****
		if (Alenth >= Blenth)
			loopLenght = Blenth;
		else 
			loopLenght = Alenth;
		
		for(int charPosition=0 ; charPosition < loopLenght ; charPosition++)
		{
			if(A.charAt(charPosition) == B.charAt(charPosition))
			{
				if (charPosition == loopLenght-1)  // important condition
					System.out.println("No");	
				continue;
			}
			if(A.charAt(charPosition) > B.charAt(charPosition))
			{
				System.out.println("Yes");
				break;
			}else {
				System.out.println("No");
				break;
			}
			
		}
		
 // in last I got to know that we can replace line 23-47 with below line -- my bad :(
	//	System.out.println(A.compareTo(B)>0?"Yes":"No"); 	
	
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
		


	}

}
