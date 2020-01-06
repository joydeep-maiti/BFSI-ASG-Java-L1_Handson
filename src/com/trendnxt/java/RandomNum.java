package com.trendnxt.java;

public class RandomNum {
	public static void main(String s[]) {
		double rand = Math.random(); 
		// Using If else
		if(rand<0.5) {
			System.out.println("The Value is less than 0.5");
		}else {
			System.out.println("The Value is less than 0.5");
		}
		
		//Using ternary operator
		System.out.println((rand<0.5)?"The Value is less than 0.5":"The Value is less than 0.5");
	}
}
