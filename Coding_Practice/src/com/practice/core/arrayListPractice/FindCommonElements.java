package com.practice.core.arrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class FindCommonElements {

	
	  public static void main(String[] args) {
	        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 5, 3, 4));
	        ArrayList<Integer> list2 = new ArrayList<>(List.of(3, 4, 5, 6));
	        
	        list1.retainAll(list2);
	        
	        System.out.println("Common elements : " + list1);
	        
	  }

}
