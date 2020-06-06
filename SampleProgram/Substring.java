package SampleProgram;

import java.util.Scanner;

//  https://www.hackerrank.com/challenges/java-substring/problem?h_r=next-challenge&h_v=zen
//shiven 6 june 2020
public class Substring {

	public static void main(String[] args) {
		System.out.println("Enter one string and 2 int start index and end index");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		System.out.println("String is -->"+s);
		System.out.println("start index is -->"+start);
		System.out.println("end index is -->"+end);
		
		System.out.println(s.substring(start, end));
		

	}

}
