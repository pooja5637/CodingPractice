package com.practice.core.arrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {


		String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

		List<String> al = new ArrayList<String>();

		// adding elements of array to arrayList.
	
		// al.addAll(geeks); 
		
		Collections.addAll(al, geeks);

		System.out.println(al);
	}

}
