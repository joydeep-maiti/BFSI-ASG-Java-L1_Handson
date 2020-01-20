package com.trendnxt.java;

import java.io.Serializable;

public class EmployeeDemo implements Serializable {
	String sName;int iEmpNo;double dSalary;
	public EmployeeDemo(String sName,int iEmpNo, double dSalary){this.sName = sName;this.iEmpNo = iEmpNo;this.dSalary = dSalary;}public String toString(){return "Name= " + sName + ";Empno= "+ iEmpNo +";Salary= "+dSalary;}
}
