package com.trendnxt.java;
import java.io.*;

public class BufferedReaderDemo {
	public static  void main(String s[]) throws IOException{System.out.println("Enter the String to check");/* Creates a filter forbuffered reading from keyboard*/BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));/* Reads from the Keyboardusing the filter*/String sStr= objReader.readLine(); System.out.println(sStr);int iCount=0,iLoc;/* To Count the number of balnkspaces */for(int iIndex=1; iIndex<sStr.length();iIndex++){iLoc=sStr.charAt(iIndex); if (iLoc == 32){iCount++;}}System.out.println("No. of Blankspaces ="+iCount);}
}
