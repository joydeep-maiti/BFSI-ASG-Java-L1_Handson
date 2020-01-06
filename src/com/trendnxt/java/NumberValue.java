package com.trendnxt.java;

public class NumberValue {
	public static void main(String args[])  {
		double num  = Double.parseDouble(args[0]);
		System.out.println("Absolute Value:"+ Math.abs(num));
		System.out.println("Round off Value:"+ Math.round(num));
		System.out.println("Square root Value:"+ Math.sqrt(num));
	}
}
