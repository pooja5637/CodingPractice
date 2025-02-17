package com.practice.core;

public class Test {

	public static void main(String[] args) {

		// int[] x = new int[-3]; // RE. NegativeArraySizeException
		
		// int[] x = new int[0.5]; // CE. Cannot convert from double to int
		
		int [] x = new int['a'];
		
		System.out.println( x.length); // 97
		
		String[] s = {"A", "AA","AAA"};
		System.out.println(s.length);
		System.out.println(s[1].length());
	}

}
