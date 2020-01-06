package com.trendnxt.java;

public class MutlilevelDemo {
	public static void main(String s[]) {
		Person obj = new EmployeeClass(101,"Emp Name", 2 , 01, 2020, 10d);
		obj.displayDetails();
		Person obj2 = new Trainee(80d);
		obj2.displayDetails();
	}
}
