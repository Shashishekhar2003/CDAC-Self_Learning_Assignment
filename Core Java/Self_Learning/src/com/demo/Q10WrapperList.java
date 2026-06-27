package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q10WrapperList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(10);
        list.add(12);

        System.out.println("List elements:");
        for(Integer i : list) {
            System.out.println(i);
        }

        System.out.println("Contains 5? " + list.contains(5));

        list.remove(Integer.valueOf(10));

        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}