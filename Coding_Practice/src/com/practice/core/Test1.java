package com.practice.core;

public class Test1 {

	
	public static boolean reverse(String str) {
		char[] c = str.toCharArray();
		
		String s = "";
		for(int i = c.length-1 ; i >= 0 ; i--) {

			s=s+c[i];
		}
		
		return str.equalsIgnoreCase(s);
		
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("Pooja"));
		
		
	}
}
