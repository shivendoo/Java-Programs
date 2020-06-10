package com.shiven;

public class CountVowelAndConsonants {


	public static void main(String[] args) {
		int numVowel = 0;
		int numConsonant = 0;

		String str = "kajlkdjSADFAAlkfayiqAWEAwjc=k";

		str = str.toLowerCase();
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
				numVowel = numVowel + 1;
			else {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					numConsonant = numConsonant + 1;
			}
		}
		
		System.out.println("Number of Vowel is ->"+numVowel);
		System.out.println("Number of Consonant is ->"+numConsonant);

	}

}
