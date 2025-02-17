package com.practice.core.java8.lambda;

public class Demo {

	int x = 777; // instance variable
	
	public void m2() {
		
		Interf i = () -> {
					int x = 888;
					System.out.println(x); // 888
					System.out.println(this.x); // 777
					
					
		};
		
		i.m1();
	}
	
	public static void main(String[] args) {
		
		Demo t = new Demo();
		t.m2();
	}
}


@FunctionalInterface
interface Interf{
	
	public void m1();
	
}