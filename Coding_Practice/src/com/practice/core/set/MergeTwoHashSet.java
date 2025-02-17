package com.practice.core.set;

import java.util.HashSet;
import java.util.List;

public class MergeTwoHashSet {

	public static void main(String[] args) {

		
		HashSet<Integer> hs1 = new HashSet<>(List.of(2,4,3,2,4,5,6,7,8,7));
		
		HashSet<Integer> hs2 = new HashSet<>(List.of(2,4,3,10,15,5,6,7,8,7));
		
		hs1.addAll(hs2);
		
		System.out.println(hs1);

	}

}
