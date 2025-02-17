package com.practice.core.string;

public class LongestPalindromeSubString {
	
	static String longestPalindrome(String str) {
		 
	    if (str.length() <= 1)
	      return str;
	 
	    String LPS = "";
	 
	    for (int i = 1; i < str.length(); i++) {
	 
	      // Consider odd length
	      int low = i;
	      int high = i;
	      
	      while(str.charAt(low) == str.charAt(high)) {
	        low--;
	        high++;
	 
	        if (low == -1 || high == str.length())
	          break;
	      }
	 
	      String palindrome = str.substring(low+1, high);
	      if (palindrome.length() > LPS.length()) {
	        LPS = palindrome;
	      }
	 
	      // Consider even length
	      low = i-1;
	      high = i;
	      while(str.charAt(low) == str.charAt(high)) {
	        low--;
	        high++;
	 
	        if (low == -1 || high == str.length())
	          break;
	      }
	 
	      palindrome = str.substring(low+1, high);
	      if (palindrome.length() > LPS.length()) {
	        LPS = palindrome;
	      }
	    }
	 
	    return LPS;
	  }
	 
		public static void main (String[] args) throws java.lang.Exception
		{
			
			System.out.println(longestPalindrome("aaebabad"));
			System.out.println(longestPalindrome("cbeereed"));
		}

}
