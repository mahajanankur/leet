package com.sb.ds.recursion;

/**
 * @author ankur
 * @crated 21-Jul-2021
 * 
 *         Sum of N natural numbers by recursion only.
 * 
 *         otherwise int sum = (n * (n + 1)) / 2;
 */
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int n = 11;
		// int sum = (n * (n + 1)) / 2;
		int s = sum(n);
		System.out.println(s);
	}

	//
	private static int sum(int n) {
		// Base case
		if (n == 1) {
			return 1;
		}
		// Recursive case
		return n + sum(n - 1);
	}
}
