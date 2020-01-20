package com.trendnxt.java;

public class DivisionByZero2 {
	public void division() throws DivisionByZeroException{
		int iNumerator= 10;int iDenominator= 0;if (iDenominator== 0) throw new DivisionByZeroException("Divide By Zero");  
		System.out.println(iNumerator+ "/"+ iDenominator+"=" + (iNumerator/iDenominator));System.out.println("End of Function ");
		
	}
	public static void main(String args[]){
			try{new DivisionByZero2().division();}
			catch(DivisionByZeroException e){               //(4)
				System.out.println("Error"+ e);                                             //(5)
			}
			finally{System.out.println("Finally Block");}
			System.out.println("End of main.");
	}
	
		
	
}
