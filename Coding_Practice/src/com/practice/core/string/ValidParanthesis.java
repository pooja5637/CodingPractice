/**
 * 
 */
package com.practice.core.string;

import java.util.Stack;

/**
 * Given a string that has opening and closing brackets of all types ' {' '} '' (' ') '' [' '] '.
 * Determine if it is valid.
 * 
 * () -- valid
 * [ {} () } -- valid
 * ([ -- invalid
 */
public class ValidParanthesis {


	boolean isValid(String s) {
		
		// if the length of the string is odd, it cannot be valid.
		if(s.length()%2!= 0 )
			return false;
		
		// create a stack to keep track of opening bracket
		Stack<Character> stack = new Stack<>();

		 
		// iterate through each character in the input string.
		for(char c : s.toCharArray()) {
			
			// push the corresponding closing bracket for each opening bracket onto the stack.
			if( c == '(')
			{
				stack.push(')');
			}
			else if( c == '{')
			{
				stack.push('}');
			}
			else if( c == '[')
			{
				stack.push(']');
			}
			
			else if(stack.isEmpty() || stack.pop() != c) {
				// if stack is empty or top does not match with the closing bracket, return false.
				return false;
			}
		
		
		}
		// if stack is empty , all the opening brackets had a matching closing pair.
		 return stack.isEmpty();
		
		 
		 
	}
	

		
	public static void main(String[] args) {

		ValidParanthesis v = new ValidParanthesis();
		
		System.out.println(v.isValid("[{(asd)[]}()]"));
		System.out.println(v.isValid("[{()[]()]"));

	}

}
