package com.practice.core.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StringJoinMethodEX {

	public static void main(String[] args) {

		
		List<String> nos = Arrays.asList("1" , "2" ,"3" ,"4");
		
		String result = String.join("-", nos);
		
		System.out.println(result);
	}

}
