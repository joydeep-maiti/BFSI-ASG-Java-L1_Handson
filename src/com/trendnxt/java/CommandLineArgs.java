package com.trendnxt.java;

public class CommandLineArgs {
	public static void main(String args[])  {
		if (args.length < 2 || args.length > 2) {
			System.out.println("Invalid no of arguments –Supply  exactly two arguments");
			System.exit(0);
		}
		System.out.println(Float.parseFloat(args[0])+Float.parseFloat(args[1]));
	}
}
