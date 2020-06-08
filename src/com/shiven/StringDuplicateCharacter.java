package com.shiven;

import java.util.HashMap;
import java.util.Map;
//https://beginnersbook.com/2014/07/java-program-to-find-duplicate-characters-in-a-string/
public class StringDuplicateCharacter {

	Map<Character, Integer> result;
	// give stering to find out duplicate character.
	String str = "aasssdddfffggghhhhjjjjkkkklll";

	public static void main(String[] args) {

		StringDuplicateCharacter duplStr = new StringDuplicateCharacter();
		duplStr.result = duplStr.getDuplicate(duplStr.str);

	}

	Map<Character, Integer> getDuplicate(String inputString) {

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (hm.containsKey(ch)) {
				int value = hm.get(ch) + 1;
				hm.put(ch, value);
			} else {
				hm.put(ch, 1);
			}

		}
		return hm;
	}

}
