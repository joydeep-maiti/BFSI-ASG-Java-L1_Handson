package com.trendnxt.java;

public class StudentMarks {
	public static void main(String s[]) {
		MarksBean obj = new MarksBean();
		obj.setEnglishMark(60f);
		obj.setMathsMark(70f);
		obj.setScienceMark(80f);
		System.out.println("English : "+ obj.getEnglishMark());
		System.out.println("Maths : "+ obj.getMathsMark());
		System.out.println("Science : "+ obj.getScienceMark());
		obj.getResults();
	}
}
