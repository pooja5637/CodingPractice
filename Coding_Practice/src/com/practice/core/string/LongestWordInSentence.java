package com.practice.core.string;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInSentence {

	public static String findLongestWord(String sentence) {
		
		if(sentence == null || sentence.trim().isEmpty()) {
			
			return "invalid input";
		}
		
		String[] words = sentence.split("\\s+");
		
		String longestWord = "";
		
		for(String word : words) {
			
			if(word.length()> longestWord.length()) {
				
				longestWord = word ;
			}
			
		}
		
		return longestWord;
	}
	
	
	public static String findLongestWordUsingStream(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "Invalid input";
        }

        return Arrays.stream(sentence.split("\\s+"))
                     .max(Comparator.comparingInt(String::length))
                     .orElse("No words found");
    }

	public static void main(String[] args) {

		String sentence = "The quick brown fox jumped over the lazy dog";
		System.out.println(findLongestWord(sentence));
		System.out.println(findLongestWordUsingStream(sentence));
	}

}
