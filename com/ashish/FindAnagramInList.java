package com.ashish;

import java.util.*;

//input top, Pot, naman, manan, ashish, shiven
//output opt - top, pot
//aamn - naman, mana
//ashish
//shiven
public class FindAnagramInList {

    public static void main(String[] args) {
        //input list
        List<String> list = new ArrayList<>();
        list.add("top");
        list.add("Pot");
        list.add("naman");
        list.add("manan");
        list.add("ashish");
        list.add("shiven");

        Map<String, List<String>> map = new HashMap<>();

        //Processing
        // 1. iterate the list,
        // 2. convert the elements as char array
        // 3. sort the char array
        // 4. add the element in hashmap
        // 5. iterate the map and print the items

        for (String str : list) {
            char[] charArray = str.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            // if element already there in map add the element to existing list
            if (map.containsKey(sortedStr)) {
                List<String> valList = map.get(sortedStr);
                valList.add(str);
                map.put(sortedStr, valList);
            } else {
                // if element is not there in a map then add the element to new list and add the list to map
                List<String> tempList = new ArrayList<>();
                tempList.add(str);
                map.put(sortedStr, tempList);
            }
        }

        //print the element
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
