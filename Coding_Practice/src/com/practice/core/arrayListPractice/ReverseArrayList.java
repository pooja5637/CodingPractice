package com.practice.core.arrayListPractice;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {


		List<Integer> l =new ArrayList<>();
		
		for(int i = 1; i <= 10 ; i++) {
			
			l.add(i);
		}
		
		System.out.println(l);
		
		System.out.println("**************************");
		// reverse the arraylist manually
		
		List<Integer> reverseArrayList =new ArrayList<>();
		
		for(int i = l.size() ; i>=1 ; i--)
		{
			reverseArrayList.add(i);
			
		}
		
		System.out.println(reverseArrayList);
		
	}

}
