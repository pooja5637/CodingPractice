package com.practice.core.string;

import java.util.ArrayList;

public class SubstringOfString {

	public static ArrayList<String> splitString(String s){
		
		int len = s.length();
		
		ArrayList<String> subString = new ArrayList<String>();
		
		
		
		for(int i = 0 ; i< len; i++) {
			
			for(int j = i+1 ; j<= len ; j++)
				
			{
				
				subString.add(s.substring(i,j));
			}
			
		}
		

		
		return subString;
	}
	public static void main(String[] args) {

		String str = "THE BAT";
		
		System.out.println(splitString(str));
		
		System.out.println("*****************************************************");
		
		ArrayList<String> newSubSTring = splitString(str);
		
		int count = 1;
		
		for(String s : newSubSTring)
		{
			System.out.println(count + ")" + s);
			
			count++;
		}
	}

}
