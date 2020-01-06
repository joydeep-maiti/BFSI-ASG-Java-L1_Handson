package com.trendnxt.java;

public class Trainee extends EmployeeClass {
	double GradePointAverage;
	Trainee(double gd){
		super(101,"Trainee Name", 2 , 01, 2020, 10d);
		GradePointAverage = gd;
	}
	
	public void displayDetails() {
		System.out.println("GradePointAverage is "+GradePointAverage);
	}
}
