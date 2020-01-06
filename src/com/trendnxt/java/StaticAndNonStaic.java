package com.trendnxt.java;

public class StaticAndNonStaic {
	static int iStatic;char cChoice;
	StaticAndNonStaic(char choice) {
		iStatic++;cChoice =choice;
	}
	/*The staticvariable objectCount is displayed using this * method.*/
	static void displayObjectCount()  {System.out.println("Value of iStatic: "+iStatic);}
	/*The non static instance variable userChoiceis displayed * using this method.*/
	void displayUserChoice(){System.out.println("The user choice is  "+cChoice);}
}
