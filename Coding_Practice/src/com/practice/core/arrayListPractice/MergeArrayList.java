package com.practice.core.arrayListPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MergeArrayList {
	
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(3, 4, 5, 6));

        // Combine both lists
        list1.addAll(list2);

        // Remove duplicates using LinkedHashSet
        ArrayList<Integer> mergedList = new ArrayList<>(new HashSet<>(list1));
        System.out.println("Merged List (No Duplicates): " + mergedList);
    }
}
