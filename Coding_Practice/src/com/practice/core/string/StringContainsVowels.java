package com.practice.core.string;

public class StringContainsVowels {

	public static boolean isStringContainsVowels(String in)
	{
		String str = in.toLowerCase();
		
		
		
		for(int i = 0 ; i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch =='e' || ch =='i' || ch == 'o' || ch =='u' ) {
				
				 
				return true;
			}
			
		
		}
		
		return false;
	
	}
	public static void main(String[] args) {

		System.out.println(isStringContainsVowels("pooja"));
		System.out.println(isStringContainsVowels("d f g h "));

	}

}
