package com.practice.core.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Pooja Ambavale";
		
		System.out.println(reverse(str));
	}

	public static String reverse(String str)
	{
		if(str == null) {
			throw new IllegalArgumentException("String not valid..");
		}
		
		StringBuilder sb = new StringBuilder();
		
		char[] ch = str.toCharArray();
		
		for(int i = ch.length-1; i>=0 ; i--) {
			
			sb.append(ch[i]);
		}
		
		return sb.toString();
	}
}


//public class ReverseString {
//	
//	public static void main(String[] args) {
//		
//		String s = "POOJA";
		
//		char[] arr = s.toCharArray();
//		
//		for(int i = arr.length-1; i>=0 ; i--) {
//			
//			System.out.print(arr[i]);
		
		
//		}
		
	// *****************************************************************************	
//		StringBuilder sb = new StringBuilder(s);
//		
//		sb.reverse();
//		
//		System.out.println(sb);
		
//	}
//}
