package com.trendnxt.java;

public class StaticAndNonStaicDemo {
	public static void main(String args[])  {
		System.out.println("Before creating objects");
		StaticAndNonStaic.displayObjectCount();
		System.out.println();System.out.println("After creating objects");
		StaticAndNonStaic object = new StaticAndNonStaic('N');
		StaticAndNonStaic.displayObjectCount();
		object.displayUserChoice();
	}
}
