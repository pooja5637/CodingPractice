package com.practice.core.string;

import java.util.HashMap;

public class CheckIfAnagramsUSingHashMap {

	
	
	    public static boolean areAnagrams(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        HashMap<Character, Integer> charCount = new HashMap<>();

	        for (char ch : str1.toCharArray()) {
	            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
	        }

	        for (char ch : str2.toCharArray()) {
	            if (!charCount.containsKey(ch) || charCount.get(ch) == 0) {
	            	
	                return false;
	            }
	            charCount.put(ch, charCount.get(ch) - 1);
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        System.out.println(areAnagrams(str1, str2));  // Output: true
	    }


}
