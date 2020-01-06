package com.trendnxt.java;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String args[])  {
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(arr);
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}
}
