package CollectionUtilityPrograms;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting

public class HowManyToys {
	

	public static void main(String[] args) {

		int[] prc = new int[] { 1, 4, 6, 7, 9, 22, 33, 77, 3, 8 };
		int numberOfToys = HowManyToys.maximumToys(prc, 50);
		System.out.println("Total number of toys :" + numberOfToys);

	}
	
	static int maximumToys(int[] prices, int k) {
		Arrays.sort(prices);
		//System.out.print("shorted array:");
//		for (int x : prices) {
//			System.out.print(x + ",");
//		}
		int toycount = 0;
		int sumprice = 0;
		for (int count = 0; count < prices.length; count++) {
			sumprice = sumprice + prices[count];
			if (sumprice > k)
				break;
			toycount++;
		}
		return toycount;
	}

}
