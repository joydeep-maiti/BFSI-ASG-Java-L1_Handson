package com.trendnxt.java;
import java.io.*;

public class LineNumber {
	public static void main(String args[]) throws IOException{try {FileReader objFileIn = new FileReader("Trng"); LineNumberReader objLineNumber = new LineNumberReader(objFileIn);String sStr;while ((sStr= objLineNumber.readLine()) != null){System.out.println(objLineNumber.getLineNumber()+ "." + sStr); }}catch (IOException E) {System.out.println(" Error : " + E); }}
}
