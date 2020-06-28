package com.ashish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        System.out.println("Testing Arraylist methods");

        List<String> list = new ArrayList<>();
        list.add("ashish");
        list.add("shiven");
        list.add("hello");
        list.add("world");

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("List size" + list.size());
        System.out.println("Is empty list" + list.isEmpty());

        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
}
