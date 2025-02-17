package com.practice.core.string;

public class CharacterCount {
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("banana", 'a')); // Output: 3
    }
}
