package com.trendnxt.java;

public class MarksBean {
	private float mathsMark;
	private float scienceMark;
	private float englishMark;
	
	public float getMathsMark() {
		return mathsMark;
	}
	public void setMathsMark(float mathsMark) {
		this.mathsMark = mathsMark;
	}
	public float getScienceMark() {
		return scienceMark;
	}
	public void setScienceMark(float scienceMark) {
		this.scienceMark = scienceMark;
	}
	public float getEnglishMark() {
		return englishMark;
	}
	public void setEnglishMark(float englishMark) {
		this.englishMark = englishMark;
	}
	public void getResults() {
		float avg = (mathsMark + scienceMark + englishMark)/3;
		if(avg>79 && avg<101) {
			System.out.println("The Grade of the Student is A ");
		}else if(avg>72 && avg<80 ) {
			System.out.println("The Grade of the Student is B+ ");
		}
		else if(avg>64 && avg<73 ) {
			System.out.println("The Grade of the Student is B ");
		}
		else if(avg>54 && avg<65 ) {
			System.out.println("The Grade of the Student is C ");
		}
		else if(avg>-1 && avg<55 ) {
			System.out.println("The Grade of the Student is D ");
		}
		
	}
	
}
