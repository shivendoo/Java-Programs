package com.edurekaExample;

public class Fibonacci {
String febSeries="";
	int fibArray[] = new int[100];
	int first,second,result;

	public static void main(String[] args) {

		Fibonacci fb = new Fibonacci();
		fb.PrintFibonacci(100);

	}

	void PrintFibonacci(int num) {
		if (num == 0) {
			febSeries="0";
			System.out.println(febSeries);
			return;
		}
		if(num == 1) {
			febSeries="0+1";
			System.out.println(febSeries);
			return;
		}
		first=0;
		second=1;
		febSeries="0+1";
		for(int i=2 ;  ; i++) {
			result=first+second;
			first= second; 
			second = result;
			if(result>num)
				break;
			febSeries=febSeries+"+"+(result);
		}
	System.out.println(febSeries);	
	// through array	
//		fibArray[0] = 0;
//		fibArray[1] = 1;
//		for (int i = 2; fibArray[i - 1] <= num; i++) {
//			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
//			// System.out.println("fibArray["+i+"] ="+fibArray[i]);
//		}
//		for (int x : fibArray)
//			System.out.println(x);
		
		
	}

}
