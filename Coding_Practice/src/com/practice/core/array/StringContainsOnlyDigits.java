package com.practice.core.array;

public class StringContainsOnlyDigits {

	
	public static boolean containsOnlyDigits(String str) {
        if (str == null || str.isEmpty()) return false; // Handle null or empty case

        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false; // If any character is not a digit, return false
            }
        }
        return true; // All characters are digits
    }

    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("12345"));  // true
        System.out.println(containsOnlyDigits("123a5"));  // false
        System.out.println(containsOnlyDigits(""));       // false
        System.out.println(containsOnlyDigits(" 123 "));  // false
    }
}
