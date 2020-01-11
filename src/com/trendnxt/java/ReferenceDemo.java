package com.trendnxt.java;

interface MyInterface{}
class MyClass1 {}
class MyClass2 extends MyClass1 implements MyInterface {}
class MyClass3 implements MyInterface {}

public class ReferenceDemo {
	public static void main(String args[]){
		MyClass1 class1Object = new MyClass1 ();
		MyClass2 class2Object = new MyClass2 ();
		MyClass3 class3Object = new MyClass3();
	}
}
