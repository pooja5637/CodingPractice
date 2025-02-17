package com.practice.core.string;

public class EvenWords {

	public static void printEvenWords(String s) {
		
		for(String w : s.split(" ")) {
			
			if(w.length() %2== 0) {
				System.out.print(w + " ");
			}
		}
	}
	public static void main(String[] args) {

		String s = "i am pooja ambavale";
		printEvenWords(s);
	}

}
