package com.practice.core.java8.lambda;

public class Demo2 {

	int x = 10; // instance variable
	
	public void m2() {
		
	int y = 20 ; // local variable
		
		Interf1 i = () -> {
			
			System.out.println(x); //10
			System.out.println(y); // 20 
			
			x = 888;
			System.out.println(x);
			
			// y = 999;
			
		} ;
		
		i.m1();
			
	}
	
	
	public static void main(String[] args) {

		
	}

}

@FunctionalInterface
interface Interf1{
	
	public void m1();
}