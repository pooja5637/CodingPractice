package com.practice.core.string;

public class CheckPalindrome {

	public static boolean isPalindrome(String str) {
		
		str = str.toLowerCase();
		
		String rev ="";
		
		for(int i = str.length()-1 ; i>=0 ; i--) {
			
			rev = rev+ str.charAt(i);
	
		}
		
		return str.equals(rev);
	}
	public static void main(String[] args) {

		String str = "level";
		
		boolean result = isPalindrome(str);
		
		if(result) {
			System.out.println(str + " is a palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
	}
	

}
