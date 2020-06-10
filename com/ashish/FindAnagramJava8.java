package com.ashish;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//input top, Pot, naman, manan, ashish, shiven
//output opt - top, pot
//aamn - naman, mana
//ashish
//shiven
public class FindAnagramJava8 {

    public static void main(String[] args) {

       Map<String, List<String>> map = Stream.of("top", "Pot", "manan", "ashish", "shiven", "naman")
                .map(x -> x.toLowerCase()).collect(Collectors.groupingBy(x -> sort(x)));

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    private static String sort(String str) {
        char[] charArray  = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
