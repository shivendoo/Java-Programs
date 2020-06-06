package SampleProgram;

import java.util.Scanner;

//  https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
//shive 6 june

public class SmallestAndLargestSubstring {

	public static void main(String[] args) {
		System.out.println("Enter one string and one integer for substring length");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int sublenght = sc.nextInt();
    sc.close();
    System.out.println(getSmallestAndLargest(s,sublenght));
	}
	
	  public static String getSmallestAndLargest(String s, int k) {
	        String smallest = s.substring(0, k);
	        String largest = s.substring(0, k);

	         for(int i = 0 ; i <= s.length()-k; i++ ) {
	        	String ac = s.substring(i,i+k);
	        	
	        	if (smallest.compareTo(ac) > 0)
	        	 smallest = ac;
	        	if (largest.compareTo(ac) < 0)
	        		largest = ac;
	   
	        }
	        
	    ///other solution we can use TreeSet class      
//	       
//	         SortedSet<String> sets=new TreeSet<String>();
//	         for(int i=0;i<=str.length()-k;i++){
//	             sets.add(str.substring(i,i+k));
//	         }
//	         System.out.println(sets.first());
//	         System.out.println(sets.last());
//	              
	         
	        return smallest + "\n" + largest;
	    }

}
