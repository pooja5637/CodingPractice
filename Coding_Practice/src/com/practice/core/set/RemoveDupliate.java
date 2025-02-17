package com.practice.core.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDupliate {

	public static void main(String[] args) {

		
		ArrayList<Integer> list = new ArrayList<>(List.of(2,4,3,2,4,5,6,7,8,7));
		
		HashSet<Integer> unique = new HashSet<>(list);
		
		System.out.println(unique);
		
	}

}
