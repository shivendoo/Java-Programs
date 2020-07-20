package LeetCode;

import java.util.*;

public class FindUniqueNumberInArray {

	public static void main(String[] args) {
		int[] numberArray = new int[] {5,6,7,3,9,10,5,6,7,3,9};
//		int r=1;
//		int m =3;
//		System.out.println(numberArray[r]);
//		System.out.println(numberArray[r++]);
//		System.out.println(r);
//		System.out.println(numberArray[m]);
//		System.out.println(numberArray[++m]);
//		System.out.println(m);
		
		int uniqueNumer = FindUniqueNumberInArray.singleNumber(numberArray);
		System.out.println("Unique Numer is :" + uniqueNumer);
	}

	static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int unique=0;
        for(int i=0 ; i<nums.length-1;i++ ) {
        	System.out.print(nums[i]);
        	System.out.println(", "+nums[i+1]);
        	if(nums[i] == nums[++i]) {  
        		if(i==nums.length)
        		continue;
        	}
        	System.out.println("i is ->"+--i+" and number is ->"+nums[i]);
        	
        	unique = nums[i] ;
        	break;
        }
        return unique;
		
	}

}
