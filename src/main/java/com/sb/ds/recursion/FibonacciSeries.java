/**
 * 
 */
package com.sb.ds.recursion;

/**
 * @author ankur
 * @crated 21-Jul-2021
 * 
 *         The formula for nth term in the fibonacci series.
 * 
 *         Fn = {[(√5 + 1)/2]^ n} / √5
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 19;
		System.out.println(nthFib(n));
		// System.out.println(fib(n));

	}

	// 0, 1, 1, 2, 3, 5, 8, 13 ...... T(n -1) + T(n -2)
	private static int fib(int n) {
		int fibNum = 0;
		// Base case.
		if (n == 0 || n == 1) {
			return n;
		} else {
			// Recursive case.
			fibNum = fib(n - 1) + fib(n - 2);
			// return fib(n - 1) + fib(n - 2);
		}
		System.out.println(fibNum);
		return n;
	}

	private static int nthFib(int n) {
		// {[(√5 + 1) / 2]^n}/√5
		double inner = (Math.sqrt(5) + 1) / 2;
		int num = (int) Math.round((Math.pow(inner, n) / Math.sqrt(5)));

		return num;
	}

}
